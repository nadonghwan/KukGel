package com.example.dh.kukgel.Gallery_samsung_car;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dh.kukgel.Gallery_listview_adapter;
import com.example.dh.kukgel.R;


public class Gallery_samsung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_listview);
        final ListView listview;
        Gallery_listview_adapter adapter;

        // Adapter 생성
        adapter = new Gallery_listview_adapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);


        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sm3),
                "SM3","1 ~ 2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sm3ze),
                "SM3ZE","4천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sm5),
                "SM5","2천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sm6),
                "SM6","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sm7),
                "SM7","2 ~ 3천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.qm3),
                "QM3","2천만원대 / 소형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.qm5),
                "QM5","2천만원대 / 준중형차");



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_samsung_sm3.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_samsung_sm3ze.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_samsung_sm5.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_samsung_sm6.class);
                    startActivity(intent);

                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_samsung_sm7.class);
                    startActivity(intent);

                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_samsung_qm3.class);
                    startActivity(intent);

                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_samsung_qm5.class);
                    startActivity(intent);
                }
        }
        });
    }
}



