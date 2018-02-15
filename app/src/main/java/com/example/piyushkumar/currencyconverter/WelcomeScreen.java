package com.example.piyushkumar.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent toMainPage = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(toMainPage);
                    finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        };
        myThread.start();
    }
}
