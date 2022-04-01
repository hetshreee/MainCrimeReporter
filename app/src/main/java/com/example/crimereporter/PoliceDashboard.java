package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PoliceDashboard extends AppCompatActivity {
    ImageView ivpdbar,ivpdcom,ivpdcon,ivpdinv,ivpdsos,ivpdtask,ivpdupsos,ivpdprof,menupd,ivpdupcase,ivpdupact;
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
        ivpdupsos=findViewById(R.id.pdupsosiv);
        ivpdprof=findViewById(R.id.pdprofiv);
        menupd=findViewById(R.id.pdmenu);
        ivpdupcase=findViewById(R.id.pdupcaseiv);
        ivpdupact=findViewById(R.id.pdupactiv);

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
        ivpdsos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceSOS.class);
                startActivity(i);
            }
        });
        ivpdtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceOverview.class);
                startActivity(i);
            }
        });
        ivpdupsos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceUpdateSOS.class);
                startActivity(i);
            }
        });
        ivpdprof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceProfile.class);
                startActivity(i);
            }
        });
        menupd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceMenu.class);
                startActivity(i);
            }
        });
        ivpdupcase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceUpdateCaseDet.class);
                startActivity(i);
            }
        });
        ivpdupact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceUpcomingAct.class);
                startActivity(i);
            }
        });
    }
}