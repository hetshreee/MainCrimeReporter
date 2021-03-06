package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PoliceEditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_edit_profile);
        Spinner spinneroptusereditprofile = findViewById(R.id.pepspin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinneroptusereditprofile.setAdapter(adapter);
    }
}