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

public class UpdateMovie extends AppCompatActivity {

    protected Cursor cursor;
    MyDataHelper dbHelper;
    Button btn1, btn2;
    EditText editTxt2, editTxt3, editTxt5, editTxt6;
    Spinner genreSpinner;
    String judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_movie);

        dbHelper = new MyDataHelper(this);
        editTxt2 = findViewById(R.id.editText2);
        editTxt3 = findViewById(R.id.editText3);
        editTxt5 = findViewById(R.id.editText5);
        editTxt6 = findViewById(R.id.editText6);

        genreSpinner = findViewById(R.id.spinnerGenre);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        judul = getIntent().getStringExtra("judul");

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM pilem WHERE judul = '" + judul + "'",
                null);
        cursor.moveToFirst();

        if (cursor.getCount()>0){
            cursor.moveToPosition(0);
            editTxt2.setText(judul);
            editTxt3.setText(cursor.getString(2));
            genreSpinner.setSelection(getIndexSpinner(genreSpinner, cursor.getString(3)));
            editTxt5.setText(cursor.getString(4));
            editTxt6.setText(cursor.getString(5));
        }

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
                db.update("pilem", cv, "judul = '" + judul +"'", null);

                Toast.makeText(getApplicationContext(), "Pilem Berhasil Di-Update-",
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

    private int getIndexSpinner(Spinner mySpinner, String cari){
        for (int i=0;i<mySpinner.getCount();i++){
            if (mySpinner.getItemAtPosition(i).toString().equalsIgnoreCase(cari)){
                return i;
            }
        }
        return 0;
    }
}
