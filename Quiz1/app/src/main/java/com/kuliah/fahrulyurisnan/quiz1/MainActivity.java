package com.kuliah.fahrulyurisnan.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    RadioGroup genderRadioGroup;
    EditText nama, email, tahunlahir;
    Spinner country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViewsId();
        //piye iki data adapter e pak :"
//        country.setAdapter(new SpinnerAdapter())

        button.setOnClickListener(this);
    }

    private void findAllViewsId() {
        button = findViewById(R.id.kirimdata);
        nama = findViewById(R.id.nama);
        email = findViewById(R.id.email);
        tahunlahir = findViewById(R.id.tahunlahir);
        country = findViewById(R.id.countrySpinner);
        genderRadioGroup = findViewById(R.id.gender);
    }

    public String hitungUmur(int tahunLahir){
        Calendar calendar = Calendar.getInstance();
        Calendar now = Calendar.getInstance();

        calendar.set(tahunLahir,1,1);

        int umur = now.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);

        Integer hasil = Integer.valueOf(umur);

        return hasil.toString();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), LayarKedua.class);

        Bundle b = new Bundle();

        String umur = hitungUmur(Integer.parseInt(tahunlahir.getText().toString()));

        b.putString("nama", nama.getText().toString());
        b.putString("email", email.getText().toString());
        b.putString("tahunlahir", umur);
        int id = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(id);
        b.putString("gender", radioButton.getText().toString());

        int i = (int) country.getSelectedItemId();

        intent.putExtras(b);

        startActivity(intent);
    }
}
