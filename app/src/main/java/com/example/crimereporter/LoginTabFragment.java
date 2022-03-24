package com.example.crimereporter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class LoginTabFragment extends Fragment {

    EditText email,passwd;
    TextView forgetpass;
    Button loginbtn;
    float v = 0;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_user_login,container,false);

        email = root.findViewById(R.id.userloginemail);
        passwd = root.findViewById(R.id.userloginpassword);
        forgetpass = root.findViewById(R.id.userloginforgotpass);
        loginbtn = root.findViewById(R.id.userloginsignin);

        email.setTranslationX(800);
        email.setAlpha(v);
        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();

        passwd.setTranslationX(800);
        passwd.setAlpha(v);
        passwd.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();

        forgetpass.setTranslationX(800);
        forgetpass.setAlpha(v);
        forgetpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();

        loginbtn.setTranslationX(800);
        loginbtn.setAlpha(v);
        loginbtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }
}
