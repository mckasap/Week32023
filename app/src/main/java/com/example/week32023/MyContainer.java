package com.example.week32023;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;


public class MyContainer implements Serializable {

    public String getSoyad() {
        return Soyad;
    }

    public Calendar getDob() {
        return dob;
    }

    private String Ad;
    private String Soyad;
    private Calendar dob;

    public String getAd() {
        return Ad;
    }

    public MyContainer(String ad, String sad, Calendar dob){
        this.Ad=ad;
        this.Soyad=sad;
        this.dob=dob;
    }

}
