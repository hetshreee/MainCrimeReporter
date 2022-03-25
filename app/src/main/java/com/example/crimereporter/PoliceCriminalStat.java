package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.os.Bundle;

public class PoliceCriminalStat<adapter, simple_spinner_dropdown_item> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_criminal_stat);

        Spinner spinner = (Spinner) findViewById(R.id.stats1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.statistics, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        //Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
}