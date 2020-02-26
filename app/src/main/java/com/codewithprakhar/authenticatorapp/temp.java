package com.codewithprakhar.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class temp extends AppCompatActivity {

    public static int SPLACE_TIME_OUT=1000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(temp.this,Login.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLACE_TIME_OUT);


    }
}
