package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliceSOS extends AppCompatActivity {

    Button upbtnpsos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_sos);
        upbtnpsos = findViewById(R.id.psosupbtn);
        upbtnpsos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceUpdateSOS.class);
                startActivity(i);
            }
        });
    }
}