package com.kuliah.fahrulyurisnan.helloworld;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "pesanAyas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "ini OnCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "ini OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "ini OnRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "ini OnStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "ini OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "ini OnPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "ini OnStart");
    }

}
