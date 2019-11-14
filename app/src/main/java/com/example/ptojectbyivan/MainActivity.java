package com.example.ptojectbyivan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TTTT","onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("QQQQ", "onRstart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("WWWW", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("EEEE", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("RRRR", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("YYYY", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("UUUU", "onDestroy");
    }


}
