package com.example.crimereporter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UserAddEvidence extends AppCompatActivity {

    ImageView covercomplaint;
    FloatingActionButton fabcomplaint;
    Button submituae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_add_evidence);
        submituae=findViewById(R.id.uaesubmit);
        submituae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),UserComplaint.class);
                startActivity(i);
            }
        });
        covercomplaint = findViewById(R.id.complaintcoverimage);
        fabcomplaint = findViewById(R.id.complaintfloatingActionButton);

        fabcomplaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImagePicker.with(UserAddEvidence.this)
                        /*.crop()	    			//Crop image(Optional), Check Customization for more option
                        .compress(1024)			//Final image size will be less than 1 MB(Optional)
                        .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)*/
                        .start();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri uri = data.getData();
        covercomplaint.setImageURI(uri);
    }



}