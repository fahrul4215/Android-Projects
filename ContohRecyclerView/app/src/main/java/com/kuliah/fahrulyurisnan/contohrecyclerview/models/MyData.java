package com.kuliah.fahrulyurisnan.contohrecyclerview.models;

public class MyData {
    public String judul,nama,tahun,lirik;
    public int gambar;

    public MyData(String judul, String nama, String tahun, int gambar, String lirik) {
        this.judul = judul;
        this.nama = nama;
        this.tahun = tahun;
        this.gambar = gambar;
        this.lirik = lirik;
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

    public String getLirik() {
        return lirik;
    }

    public void setLirik(String lirik) {
        this.lirik = lirik;
    }
}
