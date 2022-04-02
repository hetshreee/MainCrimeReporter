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
        profilepm=findViewById(R.id.pmprofile);
        citpm=findViewById(R.id.pmcit);
        upactpm=findViewById(R.id.pmupact);
        logoutpm=findViewById(R.id.pmlogout);

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
                Intent i = new Intent(getApplicationContext(), PoliceContactInfo.class);
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