package com.salim.seelaptop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView nama, harga;
    ImageView gambar;

    public static String setImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        nama = findViewById(R.id.nama);
        harga = findViewById(R.id.harga);
        gambar = findViewById(R.id.gambar);
        String url_image = "http://192.168.20.30/Laptop/gambar/";


        Intent ambil = getIntent();
        setImage = getIntent().getStringExtra("GAMBAR");
        nama.setText(""+ambil.getStringExtra("NAMA"));
        harga.setText("Harga sekitar"+"\n"+ambil.getStringExtra("HARGA"));
        Glide.with(DetailActivity.this)
                .load(url_image + setImage)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(gambar);
    }
}
