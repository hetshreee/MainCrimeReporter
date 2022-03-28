package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UserMenu extends AppCompatActivity {

    ImageView ivumcom,ivumprof,ivumgbk,ivumsos,ivumcon,ivumbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);

        ivumcom = findViewById(R.id.umcomiv);
        ivumprof = findViewById(R.id.umprofiv);
        ivumgbk = findViewById(R.id.umgbkiv);
        ivumsos = findViewById(R.id.umsosiv);
        ivumcon = findViewById(R.id.umconiv);
        ivumbar = findViewById(R.id.umbariv);

        ivumcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserComplaint.class);
                startActivity(i);
            }
        });

        ivumprof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),UserViewProfile.class);
                startActivity(i);
            }
        });

        ivumgbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserGuideBook.class);
                startActivity(i);
            }
        });

        ivumsos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserRegSOS.class);
                startActivity(i);
            }
        });

        ivumcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceContactInfo.class);
                startActivity(i);
            }
        });
        ivumbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent i = new Intent(getApplicationContext(), PoliceContactInfo.class);
                startActivity(i);*/
            }
        });

    }
}