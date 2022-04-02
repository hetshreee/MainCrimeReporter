package com.example.crimereporter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserComplaint extends AppCompatActivity {
    Button ucaddevi,ucsub;

    DatabaseReference databaseReference4 = FirebaseDatabase.getInstance().getReferenceFromUrl("https://crimereportmgmt-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_complaint);
        ucaddevi = findViewById(R.id.addeviuc);
        ucsub = findViewById(R.id.subuc);
        final EditText mobnouc = findViewById(R.id.ucmno);
        final EditText vicnameuc = findViewById(R.id.ucvicname);
        final EditText descuc = findViewById(R.id.ucdesc);

        ucsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String mobnoucc = mobnouc.getText().toString();
                final String vicnameucc = vicnameuc.getText().toString();
                final String descucc = descuc.getText().toString();
                if(mobnoucc.isEmpty()||vicnameucc.isEmpty()||descucc.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter the Details...!!", Toast.LENGTH_SHORT).show();
                }else{
                    databaseReference4.child("Complaint").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if(snapshot.hasChild("mobnoucc")){
                                Toast.makeText(getApplicationContext(), "Mobile No. is already Registered...!!", Toast.LENGTH_SHORT).show();
                            }else{
                                databaseReference4.child("Complaint").child(mobnoucc).child("Victim Name").setValue(vicnameucc);
                                databaseReference4.child("Complaint").child(mobnoucc).child("Description").setValue(descucc);

                                Toast.makeText(getApplicationContext(), "Complaint Registered Successfully...!!", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(), UserMenu.class));


                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }
        });

        ucaddevi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserAddEvidence.class);
                startActivity(i);
            }
        });
    }
}