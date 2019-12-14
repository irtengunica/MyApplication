package com.example.okul.myapplication;

/**
 * Created by okul on 7.9.2015.
 */
public class Ogrenci extends Insan {
private int numara;
    private String sinifSube;
    private String bolum;

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinifSube() {
        return sinifSube;
    }

    public void setSinifSube(String sinifSube) {
        this.sinifSube = sinifSube;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
}
