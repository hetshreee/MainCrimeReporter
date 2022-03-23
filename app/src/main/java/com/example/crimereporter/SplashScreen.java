package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashScreen.this , ChooseUser.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }
}