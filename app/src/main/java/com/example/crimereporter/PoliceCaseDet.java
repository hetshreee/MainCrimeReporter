package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliceCaseDet extends AppCompatActivity {
    Button btnpcdup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_case_det);

        btnpcdup=findViewById(R.id.pcdupbtn);
        btnpcdup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceUpdateCaseDet.class);
                startActivity(i);
            }
        });
    }
}