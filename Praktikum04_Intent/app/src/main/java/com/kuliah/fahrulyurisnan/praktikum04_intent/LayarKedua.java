package com.kuliah.fahrulyurisnan.praktikum04_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LayarKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layar_kedua);

        Bundle b = getIntent().getExtras();

        TextView nama = findViewById(R.id.namaValue);
        TextView umur = findViewById(R.id.umurValue);
        TextView jeniskelamin = findViewById(R.id.jeniskelaminValue);

        nama.setText(b.getCharSequence("nama"));
        umur.setText(b.getCharSequence("umur"));
        jeniskelamin.setText(b.getCharSequence("jeniskelamin"));
    }
}
