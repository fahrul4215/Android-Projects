package com.kuliah.fahrulyurisnan.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DuaActivity extends AppCompatActivity {
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        myTextView = findViewById(R.id.nama);
        Intent i = getIntent();
        String nama = i.getStringExtra("nama");
        myTextView.setText(nama);
    }
}
