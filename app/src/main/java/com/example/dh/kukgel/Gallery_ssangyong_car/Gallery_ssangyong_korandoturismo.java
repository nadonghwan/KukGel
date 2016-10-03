package com.example.dh.kukgel.Gallery_ssangyong_car;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dh.kukgel.CheckAdapter;
import com.example.dh.kukgel.Checkchangelistener;
import com.example.dh.kukgel.R;

import java.util.ArrayList;

public class Gallery_ssangyong_korandoturismo extends Activity {


    private ViewPager viewPager;
    private ArrayList<View> pageViews;    // pages view
    private ImageView imageView;        // image => small white and black point
    private ImageView[] imageViews;
    private ViewGroup viewPics;         // layout for view group
    private ViewGroup viewPoints;       // layout for small points


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check);



        // save views into array
        LayoutInflater inflater = getLayoutInflater();
        pageViews = new ArrayList<View>();
        pageViews.add(inflater.inflate(R.layout.gallery_ssangyong_korandoturismo1, null));
        pageViews.add(inflater.inflate(R.layout.gallery_ssangyong_korandoturismo2, null));
        pageViews.add(inflater.inflate(R.layout.gallery_ssangyong_korandoturismo3, null));





        // save small points into array
        imageViews = new ImageView[pageViews.size()];
        viewPics = (ViewGroup) inflater.inflate(R.layout.check, null);

        // find view by id
        viewPoints = (ViewGroup) viewPics.findViewById(R.id.viewGroup);
        viewPager = (ViewPager) viewPics.findViewById(R.id.guidePages);

        // set images
        for(int i=0;i<pageViews.size();i++){
            imageView = new ImageView(Gallery_ssangyong_korandoturismo.this);

            imageView.setLayoutParams(new ViewGroup.LayoutParams(20,20));
            imageView.setPadding(20, 0, 20, 0);
            imageViews[i] = imageView;

            if(i==0){
                imageViews[i].setBackgroundResource(R.drawable.circle_white);
            }else{
                imageViews[i].setBackgroundResource(R.drawable.circle_grey);
            }

            viewPoints.addView(imageViews[i]);
        }
        setContentView(viewPics);

        // set page adapter and listener
        viewPager.setAdapter(new CheckAdapter(pageViews, this));
        viewPager.setOnPageChangeListener(new Checkchangelistener(imageViews));

    }
}

