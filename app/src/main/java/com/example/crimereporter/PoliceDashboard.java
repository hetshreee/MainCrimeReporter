package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PoliceDashboard extends AppCompatActivity {
    ImageView viewcomplpolicemenu,editprofilepolicemenu,viewsospolicemenu,criminalpolicemenu,logoutpolicemenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_dashboard);

        viewcomplpolicemenu = findViewById(R.id.policemenuviewcompl);
        editprofilepolicemenu = findViewById(R.id.policemenueditprofile);
        viewsospolicemenu = findViewById(R.id.policemenuviewsos);
        criminalpolicemenu = findViewById(R.id.policemenucriminal);
        logoutpolicemenu=findViewById(R.id.policemenulogout);

        viewcomplpolicemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent i = new Intent(getApplicationContext(),PoliceViewComplaint.class);
                startActivity(i);*/
            }
        });
        criminalpolicemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent i = new Intent(getApplicationContext(),PoliceViewCriminalData.class);
                startActivity(i);*/
            }
        });
        editprofilepolicemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceEditProfile.class);
                startActivity(i);
            }
        });
        viewsospolicemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent i = new Intent(getApplicationContext(), PoliceViewSOS.class);
                startActivity(i);*/
            }
        });
        logoutpolicemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceLogin.class);
                startActivity(i);
            }
        });
    }
}