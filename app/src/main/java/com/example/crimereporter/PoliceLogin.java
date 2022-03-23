package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliceLogin extends AppCompatActivity {

    Button signinpolicelogin,signuppolicelogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_login);

        signinpolicelogin = findViewById(R.id.policeloginsignin);
        signuppolicelogin = findViewById(R.id.policeloginsignup);

        signuppolicelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceRegister.class);
                startActivity(i);
            }
        });
        signinpolicelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceMenu.class);
                startActivity(i);
            }
        });
    }
}