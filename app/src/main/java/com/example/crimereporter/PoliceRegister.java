package com.example.crimereporter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import java.util.Calendar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PoliceRegister extends AppCompatActivity {

    DatabaseReference databaseReference3 = FirebaseDatabase.getInstance().getReferenceFromUrl("https://crimereportmgmt-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_register);

        final EditText firstname = findViewById(R.id.policesignupfirstname);
        final EditText lastname = findViewById(R.id.policesignuplastname);
        final EditText address = findViewById(R.id.policesignupaddress);
        final EditText mobileno = findViewById(R.id.policesignupphone);
        final EditText aadharno = findViewById(R.id.policesignupaadhar);
        final EditText age = findViewById(R.id.policesignupage);
        final EditText email = findViewById(R.id.policesignupemail);
        final EditText password = findViewById(R.id.policesignuppassword);
        final EditText repassword = findViewById(R.id.policesignuprepassword);
        final Button signupbtn = findViewById(R.id.policesignupsubmit);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String firstnametxt = firstname.getText().toString();
                final String lastnametxt = lastname.getText().toString();
                final String addresstxt = address.getText().toString();
                final String mobilenotxt = mobileno.getText().toString();
                final String aadharnotxt = aadharno.getText().toString();
                final String agetxt = age.getText().toString();
                final String emailtxt = email.getText().toString();
                final String passwordtxt = password.getText().toString();
                final String repasswordtxt = repassword.getText().toString();

                if (firstnametxt.isEmpty() || lastnametxt.isEmpty() || addresstxt.isEmpty() || mobilenotxt.isEmpty() || aadharnotxt.isEmpty() || agetxt.isEmpty() ||
                        emailtxt.isEmpty() || passwordtxt.isEmpty() || repasswordtxt.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter the Details...!!", Toast.LENGTH_SHORT).show();
                } else if (!passwordtxt.equals(repasswordtxt)) {
                    Toast.makeText(getApplicationContext(), "Password Mismatch...!!", Toast.LENGTH_SHORT).show();
                } else {

                    databaseReference3.child("Police").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(mobilenotxt)) {
                                Toast.makeText(getApplicationContext(), "Mobile No. is already Registered...!!", Toast.LENGTH_SHORT).show();
                            } else {
                                databaseReference3.child("Police").child(mobilenotxt).child("FirstName").setValue(firstnametxt);
                                databaseReference3.child("Police").child(mobilenotxt).child("LastName").setValue(lastnametxt);
                                databaseReference3.child("Police").child(mobilenotxt).child("Address").setValue(addresstxt);
                                databaseReference3.child("Police").child(mobilenotxt).child("Aadharno").setValue(aadharnotxt);
                                databaseReference3.child("Police").child(mobilenotxt).child("Age").setValue(agetxt);
                                databaseReference3.child("Police").child(mobilenotxt).child("Email").setValue(emailtxt);
                                databaseReference3.child("Police").child(mobilenotxt).child("Password").setValue(passwordtxt);

                                Toast.makeText(getApplicationContext(), "Signed Up Successfully...!!", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(), PoliceDashboard.class));
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                }
            }
        });
    }
}

