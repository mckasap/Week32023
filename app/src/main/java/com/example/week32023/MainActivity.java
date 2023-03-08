package com.example.week32023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.FillEventHistory;
import android.view.View;
import android.widget.Toast;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Git(View v){

        Intent myInt=new Intent(this,Second.class);
        //Intent myInt=new Intent(getApplicationContext(),Second.class);
        //Intent myInt=new Intent(MainActivity.this,Second.class);

        myInt.putExtra("Ad","KARAMURAT");

        MyContainer mc= new MyContainer("MC", "Hammer", new GregorianCalendar(1976,04,21));


        myInt.putExtra("mc",mc);
        startActivity(myInt);

        Toast.makeText(this, "Merhaba",Toast.LENGTH_SHORT).show();

    }
}