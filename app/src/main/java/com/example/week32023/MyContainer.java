package com.example.week32023;

import java.io.Serializable;
import java.sql.Date;


public class MyContainer implements Serializable {

    public String getSoyad() {
        return Soyad;
    }

    public Date getDob() {
        return dob;
    }

    private String Ad;
    private String Soyad;
    private Date dob;

    public String getAd() {
        return Ad;
    }

    public MyContainer(String ad, String sad, Date dob){

        this.Ad=ad;
        this.Soyad=sad;
        this.dob=dob;



    }

}
