package com.kuliah.fahrulyurisnan.a06sharedpreference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle b = getIntent().getExtras();

        TextView username = findViewById(R.id.txv_username);

        username.setText(b.getCharSequence("username"));
    }


    public void onClick_logout(View view) {
        SharedPreferences handler = this.getSharedPreferences("dataLogin",
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = handler.edit();

        editor.clear();
        editor.apply();

        openLogin();
    }

    public void openLogin(){
        Intent i = new Intent(this.getApplicationContext(), MainActivity.class);
        this.startActivity(i);
    }
}
