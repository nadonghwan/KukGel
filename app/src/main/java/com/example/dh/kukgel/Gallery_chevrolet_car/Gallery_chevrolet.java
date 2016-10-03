package com.example.dh.kukgel.Gallery_chevrolet_car;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dh.kukgel.Gallery_listview_adapter;
import com.example.dh.kukgel.R;


public class Gallery_chevrolet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_listview);
        ListView listview;
        Gallery_listview_adapter adapter;

        adapter = new Gallery_listview_adapter();

        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);


        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.spark),
                "스파크", "1천만원대 / 경차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sparkev),
                "스파크EV", "3천만원대 / 경차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.volt),
                "볼트", "3천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.aveo),
                "아베오", "1천만원대 / 소형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.cruze),
                "크루즈", "1 ~ 2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.malibu),
                "말리부", "2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.impala),
                "임팔라", "3 ~ 4천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.trax),
                "트랙스", "1 ~ 2천만원대 / 소형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.orlando),
                "올란도", "2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.captiva),
                "캡티바", "2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.camaross),
                "카마로SS", "5천만원대 / 스포츠카");


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_chevrolet_spark.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_chevrolet_sparkev.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_chevrolet_volt.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_chevrolet_aveo.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_chevrolet_cruze.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_chevrolet_malibu.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_chevrolet_impala.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_chevrolet_trax.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_chevrolet_orlando.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_chevrolet_captiva.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_chevrolet_camaross.class);
                    startActivity(intent);
                }
            }
        });
    }
}


