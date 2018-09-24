package com.kuliah.fahrulyurisnan.contohrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView myJudul, myNama, myLirik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        myJudul = findViewById(R.id.judul);
        myNama = findViewById(R.id.nama);
        myLirik = findViewById(R.id.lirik);
        Intent i = getIntent();
        String judul = i.getStringExtra("judul");
        String nama = i.getStringExtra("nama");
        String lirik = i.getStringExtra("lirik");
        myJudul.setText("\""+judul+"\"");
        myNama.setText(nama);
        myLirik.setText(lirik);
    }
}
