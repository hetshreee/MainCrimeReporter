package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class PoliceOverview extends AppCompatActivity {

    TextView po22,po44,po66,po88,po1010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_overview);
        po22 = findViewById(R.id.po2);
        po22.setMovementMethod(LinkMovementMethod.getInstance());
        po44 = findViewById(R.id.po4);
        po44.setMovementMethod(LinkMovementMethod.getInstance());
        po66 = findViewById(R.id.po6);
        po66.setMovementMethod(LinkMovementMethod.getInstance());
        po88 = findViewById(R.id.po8);
        po88.setMovementMethod(LinkMovementMethod.getInstance());
        po1010 = findViewById(R.id.po10);
        po1010.setMovementMethod(LinkMovementMethod.getInstance());
    }
}