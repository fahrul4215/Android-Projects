package com.kuliah.fahrulyurisnan.praktikum04_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    RadioGroup genderRadioGroup;
    EditText nama, umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViewsId();
        button.setOnClickListener(this);
    }

    private void findAllViewsId() {
        button = findViewById(R.id.kirimdata);
        nama = findViewById(R.id.nama);
        umur = findViewById(R.id.umur);
        genderRadioGroup = findViewById(R.id.jeniskelamin);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), LayarKedua.class);

        Bundle b = new Bundle();

        b.putString("nama", nama.getText().toString());
        b.putString("umur", umur.getText().toString());
        int id = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(id);
        b.putString("jeniskelamin", radioButton.getText().toString());

        intent.putExtras(b);

        startActivity(intent);
    }
}
