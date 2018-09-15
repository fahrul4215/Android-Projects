package com.kuliah.fahrulyurisnan.contohrecyclerview.models;

import android.graphics.drawable.Drawable;

public class MyData {
    public String judul,nama,tahun;
    public int gambar;

    public MyData(String judul, String nama, String tahun, int gambar) {
        this.judul = judul;
        this.nama = nama;
        this.tahun = tahun;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
