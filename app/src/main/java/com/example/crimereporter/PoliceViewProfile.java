package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliceViewProfile extends AppCompatActivity {
    Button btnpvpup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_view_profile);
        btnpvpup = findViewById(R.id.pvpupbtn);
        btnpvpup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),UserEditProfile.class);
                startActivity(intent);
            }
        });

    }
}