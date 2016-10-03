package com.example.dh.kukgel.Gallery_hyundai_car;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dh.kukgel.Gallery_listview_adapter;
import com.example.dh.kukgel.R;

public class Gallery_hyundai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_listview);
        ListView listview;
        Gallery_listview_adapter adapter;


        adapter = new Gallery_listview_adapter();


        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);


        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.accent),
                "엑센트","1 ~ 2천만원대 / 소형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.avante),
                "아반떼","1 ~ 2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.i30),
                "i30","1 ~ 2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sonata),
                "쏘나타","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sonatahybrid),
                "쏘나타 hybrid","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sonatapluginhybrid),
                "쏘나타 PHEV","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.i40),
                "i40","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.grandeur),
                "그랜저","2 ~ 3천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.grandeurhybrid),
                "그랜저 hybrid","3천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.aslan),
                "아슬란","3 ~ 4천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ioniqhybrid),
                "아이오닉 hybrid","2 ~ 3천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ioniqelectric),
                "아이오닉 electric","4천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tucson),
                "투싼","2 ~ 3천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tucsonixfuelcell),
                "투싼 FUELCELL","8천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.santafe),
                "싼타페","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.maxcruz),
                "맥스크루즈","3 ~ 4천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.veloster),
                "벨로스터","1 ~ 2천만원대 / 준중형차");


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_accent.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_avante.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(),Gallery_hyundai_i30.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_sonata.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_hyundai_sonatahybrid.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_hyundai_sonatapluginhybrid.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_hyundai_i40.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_grandeur.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_grandeurhybrid.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_aslan.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_ioniqhybrid.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_ioniqelectric.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_tucson.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_tucsonixfuelcell.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_santafe.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_maxcruz.class);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_hyundai_veloster.class);
                    startActivity(intent);
                }
            }
        });
    }
}