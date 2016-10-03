package com.example.dh.kukgel.Gallery_kia_car;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.dh.kukgel.Gallery_listview_adapter;
import com.example.dh.kukgel.R;

public class Gallery_kia extends AppCompatActivity {

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


        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.morning),
                "모닝","1천만원대 / 경차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ray),
                "레이","1천만원대 / 경차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pride),
                "프라이드","1천만원대 / 소형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kthree),
                "K3","1 ~ 2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kthreekoup),
                "K3 koup","1 ~ 2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kfive),
                "K5","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kseven),
                "K7","2 ~ 3천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.knine),
                "K9","4 ~ 8천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kfivehybrid),
                "K5 hybrid","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kfivephev),
                "K5 PHEV","3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ksevenhybrid),
                "K7 hybrid","3천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.soul),
                "쏘울","1 ~ 2천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.soulev),
                "쏘울 EV","4천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.niro),
                "니로","2천만원대 / 소형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.crens),
                "카렌스","2천만원대 / 카렌스");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sportage),
                "스포티지","2 ~ 3천만원대 / 준중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sorento),
                "쏘렌토","2 ~ 3천만원대 / 중형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.mohave),
                "모하비","4천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.carnival),
                "카니발","2 ~ 3천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.carnivalhilimousine),
                "카니발 하이리무진","4 ~ 5천만원대 / 대형차");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.carnivaloutdoor),
                "카니발 아웃도어","3 ~ 4천만원대 / 대형차");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_morning.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_ray.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_pride.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_kthree.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_kia_kthreekoup.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_kia_kfive.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_kia_kseven.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(),  Gallery_kia_knine.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_kfivehybrid.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_kfivephev.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_ksevenhybrid.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_soul.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_soulev.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_niro.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_crens.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_sportage.class);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_sorento.class);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_mohave.class);
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_carnival.class);
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_carnivalhilimousine.class);
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(getApplicationContext(), Gallery_kia_carnivaloutdoor.class);
                    startActivity(intent);
                }
            }
        });
    }
}



