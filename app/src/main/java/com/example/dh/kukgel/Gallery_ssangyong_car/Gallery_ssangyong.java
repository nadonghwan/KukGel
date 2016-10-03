package com.example.dh.kukgel.Gallery_ssangyong_car;


import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.dh.kukgel.Gallery_listview_adapter;
import com.example.dh.kukgel.R;

public class Gallery_ssangyong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_listview);
        ListView listview;
        Gallery_listview_adapter adapter;

        // Adapter 생성
        adapter = new Gallery_listview_adapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);


        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tivoliair),
                "티볼리에어","1 ~ 2천만원대 / 소형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tivoli),
                "티볼리","1 ~ 2천만원대 / 소형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chairmanw),
                "체어맨W","5 ~ 10천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.rextonw),
                "렉스턴W","2 ~ 3천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korandoc),
                "코란도C","2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korandosport),
                "코란도스포츠","2천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korandoturismo),
                "코란도투리스모","2 ~ 4천만원대 / 대형차");




        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_ssangyong_tivoliair.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_ssangyong_tivoli.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_ssangyong_chairmanw.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_ssangyong_rextonw.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_ssangyong_korandoc.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_ssangyong_korandosport.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_ssangyong_korandoturismo.class);
                    startActivity(intent);
                }

            }
        });
    }
}


