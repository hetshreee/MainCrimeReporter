package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class UserLogin extends AppCompatActivity {

Button loginsigninuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        loginsigninuser=findViewById(R.id.userloginsignin);
        loginsigninuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserMenu.class);
                startActivity(i);
            }
        });
    }
}