package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PoliceDashboard extends AppCompatActivity {
    ImageView ivpdbar,ivpdcom,ivpdcon,ivpdinv,ivpdsos,ivpdtask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_dashboard);

        ivpdbar = findViewById(R.id.pdbariv);
        ivpdcom = findViewById(R.id.pdcomiv);
        ivpdcon = findViewById(R.id.pdconiv);
        ivpdinv = findViewById(R.id.pdinviv);
        ivpdsos=findViewById(R.id.pdsosiv);
        ivpdtask=findViewById(R.id.pdtaskiv);

        ivpdbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceCriminalStat.class);
                startActivity(i);
            }
        });
        ivpdcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceCaseDet.class);
                startActivity(i);
            }
        });
        ivpdcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceContactInfo.class);
                startActivity(i);
            }
        });
        ivpdinv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceCases.class);
                startActivity(i);
            }
        });
        /*ivpdsos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), .class);
                startActivity(i);
            }
        });*/
        ivpdtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceUpcomingAct.class);
                startActivity(i);
            }
        });
    }
}