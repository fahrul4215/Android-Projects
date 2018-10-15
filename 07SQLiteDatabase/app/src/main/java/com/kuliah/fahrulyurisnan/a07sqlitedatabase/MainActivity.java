package com.kuliah.fahrulyurisnan.a07sqlitedatabase;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView ListView01;
    protected Cursor cursor;
    MyDataHelper dataPilem;

    public static MainActivity layarUtama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, InsertMovie.class);
                startActivity(myIntent);
            }
        });
        layarUtama = this;

        TampilkanList();
    }

    public void TampilkanList(){
        dataPilem = new MyDataHelper(this);
        SQLiteDatabase db = dataPilem.getReadableDatabase();

        cursor = db.rawQuery("SELECT * FROM pilem", null);
        final String[] dataBaru = new String[cursor.getCount()];
        cursor.moveToFirst();

        for (int cc=0;cc < cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            dataBaru[cc] = cursor.getString(1);
        }

        ListView01 = findViewById(R.id.listView1);
        ListView01.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, dataBaru));
        ListView01.setSelected(true);

        ListView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, final int position, long id) {
                final String selection = dataBaru[position];
                final CharSequence[] dialogitem = {"Lihat Pilem", "Update Pilem", "Hapus Pilem"};

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Pilihan Hidup");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0 :
                                Intent intent0 = new Intent(getApplicationContext(),
                                        ViewMovie.class);
                                intent0.putExtra("judul", selection);
                                startActivity(intent0);
                                break;
                            case 1 :
                                Intent intent1 = new Intent(getApplicationContext(),
                                        UpdateMovie.class);
                                intent1.putExtra("judul", selection);
                                startActivity(intent1);
                                break;
                            case 2 :
                                SQLiteDatabase db = dataPilem.getWritableDatabase();
                                db.delete("pilem","judul = '"+selection+"'",
                                        null);
//                                db.execSQL("DELETE FROM pilem WHERE judul = '" +
//                                        selection + "'");
                                Toast.makeText(getApplicationContext(),
                                        "Pilem Berhasil Dihapus",Toast.LENGTH_LONG).show();
                                TampilkanList();
                                break;
                        }
                    }
                });
                builder.create().show();
            }
        });
        ((ArrayAdapter)ListView01.getAdapter()).notifyDataSetInvalidated();
        cursor.close();
    }
}
