package com.example.crimereporter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class PoliceViewComplain extends AppCompatActivity {

    ListView listViewCases;
    List<Case> caseList;
    DatabaseReference databaseReference4 = FirebaseDatabase.getInstance().getReferenceFromUrl("https://crimereportmgmt-default-rtdb.firebaseio.com/");


    @Override
    protected void onStart() {
        super.onStart();
        databaseReference4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot casesnapshot) {
                caseList.clear();
                for(DataSnapshot caseSnapshot : casesnapshot.getChildren()){
                    Case casee = caseSnapshot.getValue(Case.class);
                    caseList.add(casee);
                }
                PoliceCaseList adapter = new PoliceCaseList(PoliceViewComplain.this,caseList);
                listViewCases.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_view_complain);
        listViewCases = findViewById(R.id.listViewCases);
        caseList = new ArrayList<>();
    }
}