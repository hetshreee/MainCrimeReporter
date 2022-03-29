package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserComplaint extends AppCompatActivity {
    Button ucaddevi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_complaint);
        ucaddevi = findViewById(R.id.addeviuc);

        ucaddevi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserAddEvidence.class);
                startActivity(i);
            }
        });
    }
}