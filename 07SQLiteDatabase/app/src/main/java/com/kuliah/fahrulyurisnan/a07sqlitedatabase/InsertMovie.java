package com.kuliah.fahrulyurisnan.a07sqlitedatabase;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class InsertMovie extends AppCompatActivity {

    protected Cursor cursor;
    MyDataHelper dbHelper;
    Button btn1, btn2;
    EditText editTxt2, editTxt3, editTxt5, editTxt6;
    Spinner genreSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_movie);

        dbHelper = new MyDataHelper(this);
        editTxt2 = findViewById(R.id.editText2);
        editTxt3 = findViewById(R.id.editText3);
        editTxt5 = findViewById(R.id.editText5);
        editTxt6 = findViewById(R.id.editText6);

        genreSpinner = findViewById(R.id.spinnerGenre);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues cv = new ContentValues();
                cv.put("judul", editTxt2.getText().toString());
                cv.put("tahunRilis", editTxt3.getText().toString());
                cv.put("genre", genreSpinner.getSelectedItem().toString());
                cv.put("sutradara", editTxt5.getText().toString());
                cv.put("sinopsis", editTxt6.getText().toString());
                db.insert("pilem", null, cv);
//                db.execSQL("INSERT INTO pilem(judul, tahunRilis, genre, sutradara, sinopsis) VALUES('" +
//                        editTxt2.getText().toString() + "','" +
//                        editTxt3.getText().toString() + "','" +
//                        genreSpinner.getSelectedItem().toString() + "','" +
//                        editTxt5.getText().toString() + "','" +
//                        editTxt6.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Pilem Berhasil Ditambahkan",
                        Toast.LENGTH_LONG).show();
                
                MainActivity.layarUtama.TampilkanList();
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
