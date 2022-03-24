package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import java.util.Calendar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuthException;

public class UserSignUp extends AppCompatActivity {

    private EditText firstnameusersignup,lastnameusersignup,addressusersignup,nationalityusersignup,aadharusersignup,
            phoneusersignup,ageusersignup,emailusersignup,passwordusersignup;

    private Button submitusersignup;

    /*private FirebaseAuth auth;*/

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);

        /*firstnameusersignup=findViewById(R.id.usersignupfirstname);
        lastnameusersignup=findViewById(R.id.usersignuplastname);
        addressusersignup=findViewById(R.id.usersignupaddress);
        nationalityusersignup=findViewById(R.id.usersignupnationality);
        aadharusersignup=findViewById(R.id.usersignupaadhar);
        phoneusersignup=findViewById(R.id.usersignupphone);
        ageusersignup=findViewById(R.id.usersignupage);
        emailusersignup=findViewById(R.id.usersignupemail);
        passwordusersignup=findViewById(R.id.usersignuppassword);
        submitusersignup=findViewById(R.id.usersignupsubmit);*/

        /*submitusersignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstnamesignupuser = firstnameusersignup.getText().toString();
                String lastnamesignupuser = lastnameusersignup.getText().toString();
                String addresssignupuser = addressusersignup.getText().toString();
                String nationalitysignupuser = nationalityusersignup.getText().toString();
                String aadharsignupuser = aadharusersignup.getText().toString();
                String phonesignupuser = phoneusersignup.getText().toString();
                String agesignupuser = ageusersignup.getText().toString();
                String usernamesignupuser = usernameusersignup.getText().toString();
                String passwordsignupuser = passwordusersignup.getText().toString();

            }
        });*/

    }

    }

