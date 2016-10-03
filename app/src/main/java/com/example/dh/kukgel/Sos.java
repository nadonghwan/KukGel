package com.example.dh.kukgel;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Sos extends Activity {
    @Override
    protected void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.sos);
    }

    public void onClick4(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1588-5656"));
        startActivity(intent);
    }
    public void onClick5(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1588-5114"));
        startActivity(intent);
    }
    public void onClick6(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1544-0114"));
        startActivity(intent);
    }
    public void onClick7(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1588-0100"));
        startActivity(intent);
    }
    public void onClick8(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1588-7711"));
        startActivity(intent);
    }
    public void onClick9(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1588-3344"));
        startActivity(intent);
    }
    public void onClick10(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1566-1566"));
        startActivity(intent);
    }
    public void onClick16(View view) {
        Intent intent = new Intent(this, NaverMyLocation.class);
        startActivity(intent);
    }
}
