package com.example.dh.kukgel;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dh.kukgel.Gallery_chevrolet_car.Gallery_chevrolet;
import com.example.dh.kukgel.Gallery_hyundai_car.Gallery_hyundai;
import com.example.dh.kukgel.Gallery_kia_car.Gallery_kia;
import com.example.dh.kukgel.Gallery_samsung_car.Gallery_samsung;
import com.example.dh.kukgel.Gallery_ssangyong_car.Gallery_ssangyong;

public class Gallery extends Activity {
    @Override
    protected void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.gallery);
    }

    public void onClick11(View view) {
        Intent intent = new Intent(this, Gallery_hyundai.class);
        startActivity(intent);
    }
    public void onClick12(View view) {
        Intent intent = new Intent(this, Gallery_kia.class);
        startActivity(intent);
    }
    public void onClick13(View view) {
        Intent intent = new Intent(this, Gallery_samsung.class);
        startActivity(intent);
    }
    public void onClick14(View view) {
        Intent intent = new Intent(this, Gallery_ssangyong.class);
        startActivity(intent);
    }
    public void onClick15(View view) {
        Intent intent = new Intent(this, Gallery_chevrolet.class);
        startActivity(intent);
    }
}

