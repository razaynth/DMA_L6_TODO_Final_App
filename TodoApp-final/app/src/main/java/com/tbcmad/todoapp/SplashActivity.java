package com.tbcmad.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        this.getSupportActionBar().hide();
        new Handler().postDelayed(() -> {
        SharedPreferences preferences=getApplicationContext().getSharedPreferences("patinetpref",0);
////                startActivity(new Intent(SplashActivity.this,MainActivity.class));
//            Boolean authentication = preferences.getBoolean("authentication",false);
//           if (authentication)
//            {
            Log.e("err", "Error1");
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();

        }, 4000);

//            else {
//
//                Intent intent = new Intent(SplashActivity.this, .class);
//                startActivity(intent);
//                finish();
// }

    }

    }
