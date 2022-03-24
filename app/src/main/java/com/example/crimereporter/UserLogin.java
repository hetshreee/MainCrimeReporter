package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserLogin extends AppCompatActivity {

    Button signinuserlogin;
    TextView signupuserlogin,forgotpassuserlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        signinuserlogin = findViewById(R.id.userloginsignin);
        signupuserlogin = findViewById(R.id.userloginsignup);
        forgotpassuserlogin = findViewById(R.id.userloginforgotpass);

        signinuserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserMenu.class);
                startActivity(i);
            }
        });

        signupuserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),UserSignUp.class);
                startActivity(intent1);
            }
        });

        forgotpassuserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),UserEditProfile.class);
                startActivity(intent1);
            }
        });

    }
}