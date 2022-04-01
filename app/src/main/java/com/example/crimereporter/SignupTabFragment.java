package com.example.crimereporter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignupTabFragment extends Fragment {
    float v = 0;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://crimereportmgmt-default-rtdb.firebaseio.com/");

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_fragment, container, false);

        final EditText firstname = root.findViewById(R.id.usersignupfirstname);
        final EditText lastname = root.findViewById(R.id.usersignuplastname);
        final EditText address = root.findViewById(R.id.usersignupaddress);
        final EditText mobileno = root.findViewById(R.id.usersignupphone);
        final EditText aadharno = root.findViewById(R.id.usersignupaadhar);
        final EditText age = root.findViewById(R.id.usersignupage);
        final EditText email = root.findViewById(R.id.usersignupemail);
        final EditText password = root.findViewById(R.id.usersignuppassword);
        final EditText repassword = root.findViewById(R.id.usersignuprepassword);
        final Button signupbtn = root.findViewById(R.id.usersignupsubmit);

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
                    Toast.makeText(getContext(), "Please Enter the Details...!!", Toast.LENGTH_SHORT).show();
                } else if (!passwordtxt.equals(repasswordtxt)) {
                    Toast.makeText(getContext(), "Password Mismatch...!!", Toast.LENGTH_SHORT).show();
                } else {

                    databaseReference.child("Users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(mobilenotxt)) {
                                Toast.makeText(getContext(), "Mobile No is already Registered...!!", Toast.LENGTH_SHORT).show();
                            } else {
                                databaseReference.child("Users").child(mobilenotxt).child("FirstName").setValue(firstnametxt);
                                databaseReference.child("Users").child(mobilenotxt).child("LastName").setValue(lastnametxt);
                                databaseReference.child("Users").child(mobilenotxt).child("Address").setValue(addresstxt);
                                databaseReference.child("Users").child(mobilenotxt).child("Aadharno").setValue(aadharnotxt);
                                databaseReference.child("Users").child(mobilenotxt).child("Age").setValue(agetxt);
                                databaseReference.child("Users").child(mobilenotxt).child("Email").setValue(emailtxt);
                                databaseReference.child("Users").child(mobilenotxt).child("Password").setValue(passwordtxt);

                                Toast.makeText(getContext(), "Signed Up Successfully...!!", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getContext(), UserMenu.class));
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                }
            }
        });
        return root;
    }
}
