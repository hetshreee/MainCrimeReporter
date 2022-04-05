package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliceMenu extends AppCompatActivity {

    Button profilepm,citpm,upactpm,logoutpm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_menu);
        profilepm=findViewById(R.id.pm1);
        citpm=findViewById(R.id.pm2);
        upactpm=findViewById(R.id.pm3);
        logoutpm=findViewById(R.id.pm4);

        profilepm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceViewProfile.class);
                startActivity(i);
            }
        });

        citpm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserGuideBook.class);
                startActivity(i);
            }
        });

        upactpm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceUpcomingAct.class);
                startActivity(i);
            }
        });

        logoutpm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ChooseUser.class);
                startActivity(i);
            }
        });
    }
}