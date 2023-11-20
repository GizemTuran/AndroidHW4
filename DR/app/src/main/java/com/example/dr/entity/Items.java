package com.example.dr.entity;

public class Items {

    private int id;
    private String ad;
    private double fiyat;

    private String resim;

    public Items() {
    }

    public Items(int id, String ad, double fiyat, String resim) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
        this.resim = resim;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
