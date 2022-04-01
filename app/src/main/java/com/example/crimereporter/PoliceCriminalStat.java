package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.TextView;

public class PoliceCriminalStat<adapter, simple_spinner_dropdown_item> extends AppCompatActivity {

    public String vselect;
    TextView pcs22,pcs33,pcs44,pcs55,pcs66,pcs77,pcs88,pcs99,pcs1010,pcs1111,pcs1212,pcs1313,pcs1414;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_criminal_stat);
        pcs22 = findViewById(R.id.pcs2);
        pcs22.setMovementMethod(LinkMovementMethod.getInstance());
        pcs33 = findViewById(R.id.pcs3);
        pcs33.setMovementMethod(LinkMovementMethod.getInstance());
        pcs44 = findViewById(R.id.pcs4);
        pcs44.setMovementMethod(LinkMovementMethod.getInstance());
        pcs55 = findViewById(R.id.pcs5);
        pcs55.setMovementMethod(LinkMovementMethod.getInstance());
        pcs66 = findViewById(R.id.pcs6);
        pcs66.setMovementMethod(LinkMovementMethod.getInstance());
        pcs77 = findViewById(R.id.pcs7);
        pcs77.setMovementMethod(LinkMovementMethod.getInstance());
        pcs88 = findViewById(R.id.pcs8);
        pcs88.setMovementMethod(LinkMovementMethod.getInstance());
        pcs99 = findViewById(R.id.pcs9);
        pcs99.setMovementMethod(LinkMovementMethod.getInstance());
        pcs1010 = findViewById(R.id.pcs10);
        pcs1010.setMovementMethod(LinkMovementMethod.getInstance());
        pcs1111 = findViewById(R.id.pcs11);
        pcs1111.setMovementMethod(LinkMovementMethod.getInstance());
        pcs1212 = findViewById(R.id.pcs12);
        pcs1212.setMovementMethod(LinkMovementMethod.getInstance());
        pcs1313 = findViewById(R.id.pcs13);
        pcs1313.setMovementMethod(LinkMovementMethod.getInstance());
        pcs1414 = findViewById(R.id.pcs14);
        pcs1414.setMovementMethod(LinkMovementMethod.getInstance());
    }
}