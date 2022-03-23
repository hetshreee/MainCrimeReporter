package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UserMenu extends AppCompatActivity {

    ImageView regcomplusermenu,editprofileusermenu,guidebookusermenu,regsosusermenu,logoutusermenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);

        regcomplusermenu = findViewById(R.id.usermenuregcompl);
        editprofileusermenu = findViewById(R.id.usermenueditprofile);
        guidebookusermenu = findViewById(R.id.usermenuguidebook);
        regsosusermenu = findViewById(R.id.usermenuregsos);
        logoutusermenu = findViewById(R.id.usermenulogout);

        regcomplusermenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserComplaint.class);
                startActivity(i);
            }
        });

        logoutusermenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),UserLogin.class);
                startActivity(i);
            }
        });

        editprofileusermenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserEditProfile.class);
                startActivity(i);
            }
        });

        guidebookusermenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserGuideBook.class);
                startActivity(i);
            }
        });

        regsosusermenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserRegSOS.class);
                startActivity(i);
            }
        });

    }
}