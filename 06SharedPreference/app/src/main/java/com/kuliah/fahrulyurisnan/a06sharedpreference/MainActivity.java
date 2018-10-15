package com.kuliah.fahrulyurisnan.a06sharedpreference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkRemember;
    private Button btnLogin;
    private EditText txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.checkSavedCredentials();

        this.initComponents();
    }

    private void initComponents() {
        this.chkRemember = this.findViewById(R.id.chk_remember);
        this.btnLogin = this.findViewById(R.id.btn_login);
        this.txtUsername = this.findViewById(R.id.txt_username);
        this.txtPassword = this.findViewById(R.id.txt_password);
    }

    public void button_onClick(View view){
        this.login();
    }

    private void login() {
        String username = this.txtUsername.getText().toString();
        String password = this.txtPassword.getText().toString();

        boolean loginCorrect = this.checkCredentials(username, password);

        if (loginCorrect){
            boolean remember = this.chkRemember.isChecked();

            if(remember){
                this.saveCredentials();
            }
            this.openHome(username);
        } else {
            Toast.makeText(this.getApplicationContext(), "Username dan/atau Password salah!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void openHome(String username) {
        Intent i = new Intent(this.getApplicationContext(), HomeActivity.class);

        i.putExtra("username", username);

        this.startActivity(i);
    }

    private void saveCredentials() {
        SharedPreferences handler = this.getSharedPreferences("dataLogin",
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = handler.edit();

        editor.putString("username", this.txtUsername.getText().toString());
        editor.putString("password", this.txtPassword.getText().toString());

        editor.apply();
    }

    private boolean checkCredentials(String username, String password) {
        return username.equals("fahrul@bosq.com") && password.equals("bosq");
    }

    private void checkSavedCredentials() {
        SharedPreferences handler = this.getSharedPreferences("dataLogin",
                Context.MODE_PRIVATE);

        String username = handler.getString("username", "");
        String password = handler.getString("password", "");

        boolean loginCorrect = this.checkCredentials(username, password);

        if (loginCorrect)
            this.openHome(username);
    }
}
