package com.example.dh.kukgel.Gallery_chevrolet_car;

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

public class Gallery_chevrolet_sparkev extends Activity {


    private ViewPager viewPager;
    private ArrayList<View> pageViews;
    private ImageView imageView;
    private ImageView[] imageViews;
    private ViewGroup viewPics;
    private ViewGroup viewPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check);

        LayoutInflater inflater = getLayoutInflater();
        pageViews = new ArrayList<View>();
        pageViews.add(inflater.inflate(R.layout.gallery_chevrolet_sparkev1, null));
        pageViews.add(inflater.inflate(R.layout.gallery_chevrolet_sparkev2, null));
        pageViews.add(inflater.inflate(R.layout.gallery_chevrolet_sparkev3, null));


        imageViews = new ImageView[pageViews.size()];
        viewPics = (ViewGroup) inflater.inflate(R.layout.check, null);


        viewPoints = (ViewGroup) viewPics.findViewById(R.id.viewGroup);
        viewPager = (ViewPager) viewPics.findViewById(R.id.guidePages);


        for(int i=0;i<pageViews.size();i++){
            imageView = new ImageView(Gallery_chevrolet_sparkev.this);

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


        viewPager.setAdapter(new CheckAdapter(pageViews, this));
        viewPager.setOnPageChangeListener(new Checkchangelistener(imageViews));

    }
}

