package com.kuliah.fahrulyurisnan.contohrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AwalActivity extends AppCompatActivity {
    private Button mButton;
    private EditText mUsername, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);
        mButton = findViewById(R.id.buttonPlayList);
        mUsername = findViewById(R.id.editUsername);
        mPassword = findViewById(R.id.editPassword);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.v("Edit Text", mUsername.getText().toString());
//                Log.v("Edit Text", mPassword.getText().toString());
                if (mUsername.getText().toString().equals("Fahrul") && mPassword.getText().
                        toString().equals("fahrul")){
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Salah",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
