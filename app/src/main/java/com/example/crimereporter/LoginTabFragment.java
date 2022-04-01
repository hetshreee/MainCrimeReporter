package com.example.crimereporter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginTabFragment extends Fragment {

    DatabaseReference databaseReference1 = FirebaseDatabase.getInstance().getReferenceFromUrl("https://crimereportmgmt-default-rtdb.firebaseio.com/");
    EditText phnno, passwd;
    TextView forgetpass;
    Button loginbtn;
    float v = 0;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_user_login, container, false);

        phnno = root.findViewById(R.id.userloginphnno);
        passwd = root.findViewById(R.id.userloginpassword);
        forgetpass = root.findViewById(R.id.userloginforgotpass);
        loginbtn = root.findViewById(R.id.userloginsignin);

        phnno.setTranslationX(800);
        phnno.setAlpha(v);
        phnno.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        passwd.setTranslationX(800);
        passwd.setAlpha(v);
        passwd.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetpass.setTranslationX(800);
        forgetpass.setAlpha(v);
        forgetpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        loginbtn.setTranslationX(800);
        loginbtn.setAlpha(v);
        loginbtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String phnnotxt = phnno.getText().toString();
                final String passwordtxt = passwd.getText().toString();

                if (phnnotxt.isEmpty() || passwordtxt.isEmpty()) {
                    Toast.makeText(getContext(), "Please Enter the Details...!!", Toast.LENGTH_SHORT).show();
                } else {

                    databaseReference1.child("Users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(phnnotxt)) {

                                final String getpassword = snapshot.child(phnnotxt).child("Password").getValue(String.class);

                                if (getpassword.equals(passwordtxt)) {
                                    Toast.makeText(getContext(), "Logged In Successfully...!!", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(getContext(), UserMenu.class));

                                } else {
                                    Toast.makeText(getContext(), "Incorrect Password...!!", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(getContext(), "Please Enter Valid Phnone no...!!", Toast.LENGTH_SHORT).show();
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
