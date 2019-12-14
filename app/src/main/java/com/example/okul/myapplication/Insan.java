package com.example.okul.myapplication;

/**
 * Created by okul on 7.9.2015.
 */
public class Insan {
    private int yas;
    private float boy;
    private  float kilo;
    private String ad;
    private String soyad;
    public Insan()//boþ yapýcý metod
    {
        this.yas=0;
        this.boy=0;
        this.kilo=0;
        this.ad="";
        this.soyad="";

    }
    public Insan(int yas,float boy,float kilo,String ad,String soyad)//dolu yapýcý metod
    {
this.yas=yas;
        this.boy=boy;
        this.kilo=kilo;
        this.ad=ad;
        this.soyad=soyad;
    }
    //çok yapýcý metod programda istenmez
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public float getBoy() {
        return boy;
    }

    public void setBoy(float boy) {
        this.boy = boy;
    }

    public float getKilo() {
        return kilo;
    }

    public void setKilo(float kilo) {
     if (kilo<0) {
         kilo = 0;
     }

        this.kilo = kilo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public float KutleEndeksi()
    {//kutle endeksini hesaplayan metod
        float sonuc=kilo/boy*boy;
        return sonuc;
    }
}
