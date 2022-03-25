package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PoliceLogin extends AppCompatActivity {

    Button signinplogin;
    TextView signuppolicelogin,forgotpasspolicelogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_login);

        signinplogin = findViewById(R.id.ploginsigninbtn);
        signuppolicelogin = findViewById(R.id.ploginsignup);
        forgotpasspolicelogin = findViewById(R.id.ploginforgotpass);

        signuppolicelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceRegister.class);
                startActivity(i);
            }
        });
        signinplogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceDashboard.class);
                startActivity(i);
            }
        });

        forgotpasspolicelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceEditProfile.class);
                startActivity(i);
            }
        });
    }
}