package com.example.crimereporter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PoliceLogin extends AppCompatActivity {

    Button loginbtn;
    TextView ploginphnno,plogininpasswd,policesignuptxt,forgotpass;
    DatabaseReference databaseReference2 = FirebaseDatabase.getInstance().getReferenceFromUrl("https://crimereportmgmt-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_login);

        loginbtn = findViewById(R.id.ploginbtn);
        policesignuptxt = findViewById(R.id.ploginsignup);
        forgotpass = findViewById(R.id.policeloginforgotpass);
        ploginphnno = findViewById(R.id.policeloginphnno);
        plogininpasswd = findViewById(R.id.policeloginpassword);

        policesignuptxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceRegister.class);
                startActivity(i);
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String phnnotxt = ploginphnno.getText().toString();
                final String passwordtxt = plogininpasswd.getText().toString();

                if (phnnotxt.isEmpty() || passwordtxt.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter the Details...!!", Toast.LENGTH_SHORT).show();
                } else {

                    databaseReference2.child("Police").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(phnnotxt)) {

                                final String getpassword = snapshot.child(phnnotxt).child("Password").getValue(String.class);

                                if (getpassword.equals(passwordtxt)) {
                                    Toast.makeText(getApplicationContext(), "Logged In Successfully...!!", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(getApplicationContext(), UserMenu.class));

                                } else {
                                    Toast.makeText(getApplicationContext(), "Incorrect Password...!!", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(getApplicationContext(), "Please Enter Valid Phnone no...!!", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                }

            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PoliceEditProfile.class);
                startActivity(i);
            }
        });
    }
}