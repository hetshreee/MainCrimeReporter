package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChooseUser extends AppCompatActivity {

    ImageButton policechooseuser,publicchooseuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user);

        policechooseuser = findViewById(R.id.chooseuserpolice);
        publicchooseuser = findViewById(R.id.chooseuserpublic);

        policechooseuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PoliceLogin.class);
                startActivity(i);
            }
        });

        publicchooseuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), UserLogin.class);
                startActivity(intent1);
            }
        });

    }
}