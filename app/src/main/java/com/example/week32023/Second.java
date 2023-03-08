package com.example.week32023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
 TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=(TextView) findViewById(R.id.textView);

    String ad=getIntent().getStringExtra("Ad");
    tv.setText(ad);
        MyContainer mc=(MyContainer) getIntent().getSerializableExtra("mc");
        ad+= "\n"+ mc.getAd() +"\n"+mc.getSoyad() +"\n"+ mc.getDob().getTime() ;
        tv.setText(ad);

    }
}