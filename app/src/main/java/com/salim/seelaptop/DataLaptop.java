package com.salim.seelaptop;

import com.google.gson.annotations.SerializedName;

/**
 * Created by salim on 4/29/18.
 */

class DataLaptop {

    @SerializedName("id")
    private String id;

    @SerializedName("nama")
    private String nama;

    @SerializedName("harga")
    private String harga;

    @SerializedName("gambar")
    private String gambar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @Override
    public String toString(){
        return "DataLaptop{"+"id = "+id+"nama = "+nama+"harga = "+harga+"gambar = "+gambar+"}";
    }
}
