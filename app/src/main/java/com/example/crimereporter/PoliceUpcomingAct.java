package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class PoliceUpcomingAct extends AppCompatActivity {

    TextView fitness_1,cyber_1,meet_1,exam_1,duty_1,audit_1,rep_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_upcoming);
        fitness_1 = findViewById(R.id.fitness1);
        fitness_1.setMovementMethod(LinkMovementMethod.getInstance());
        cyber_1 = findViewById(R.id.cyber1);
        cyber_1.setMovementMethod(LinkMovementMethod.getInstance());
        meet_1 = findViewById(R.id.meet1);
        meet_1.setMovementMethod(LinkMovementMethod.getInstance());
        exam_1 = findViewById(R.id.exam1);
        exam_1.setMovementMethod(LinkMovementMethod.getInstance());
        duty_1 = findViewById(R.id.duty1);
        duty_1.setMovementMethod(LinkMovementMethod.getInstance());
        audit_1 = findViewById(R.id.audit1);
        audit_1.setMovementMethod(LinkMovementMethod.getInstance());
        rep_1 = findViewById(R.id.rep1);
        rep_1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}