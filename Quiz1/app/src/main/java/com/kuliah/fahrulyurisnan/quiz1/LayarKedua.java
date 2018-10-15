package com.kuliah.fahrulyurisnan.quiz1;

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
        TextView email = findViewById(R.id.emailValue);
        TextView country = findViewById(R.id.countryValue);
        TextView umur = findViewById(R.id.umurValue);
        TextView jeniskelamin = findViewById(R.id.genderValue);

        nama.setText(b.getCharSequence("nama"));
        email.setText(b.getCharSequence("email"));
        country.setText(b.getCharSequence("country"));
        umur.setText(b.getCharSequence("tahunlahir"));
        jeniskelamin.setText(b.getCharSequence("gender"));
    }
}
