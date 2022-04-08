package com.example.crimereporter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserRegSOS extends AppCompatActivity {

    EditText latitudecurrentadd, longitudecurrentadd;
    Button getLocation;
    TextView addresscurrentadd;
    public String address1;
    public LocationManager locationManager;
    public LocationListener locationListener = new UserRegSOS.MyLocationListener();
    String lat, lon;
    private boolean gps_enable = false;
    private boolean network_enable = false;
    //To generate address
    Geocoder geocoder;
    List<Address> myaddress;
    DatabaseReference databaseReference5 = FirebaseDatabase.getInstance().getReferenceFromUrl("https://crimereportmgmt-default-rtdb.firebaseio.com/");
    Button subsosuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg_sos);
        latitudecurrentadd = findViewById(R.id.currentaddlatitude);
        longitudecurrentadd = findViewById(R.id.currentaddlongitude);
        getLocation = findViewById(R.id.currentaddlocationbtn);
        addresscurrentadd = findViewById(R.id.currentaddaddress);
        subsosuc = findViewById(R.id.ucsubsos);
        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        getLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMyLocation();
            }
        });
        checkLocationPermission();

        final EditText typeuc = findViewById(R.id.uctype);
        final EditText phnouc = findViewById(R.id.ucphno);
        final TextView adduc = findViewById(R.id.currentaddaddress);

        subsosuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String typeucuc = typeuc.getText().toString();
                final String phnoucuc = phnouc.getText().toString();
                final String adducuc = adduc.getText().toString();
                if(typeucuc.isEmpty()||phnoucuc.isEmpty()||adducuc.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter the Details...!!", Toast.LENGTH_SHORT).show();
                }else{
                    databaseReference5.child("SOS").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if(snapshot.hasChild(phnoucuc)){
                                Toast.makeText(getApplicationContext(), "Mobile No. is already Registered...!!", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                String Id = databaseReference5.push().getKey();
                                databaseReference5.child("SOS").child(Id).child("ID").setValue(Id);
                                databaseReference5.child("SOS").child(Id).child("Mobile No").setValue(phnoucuc);
                                databaseReference5.child("SOS").child(Id).child("Type of Emergency").setValue(typeucuc);
                                databaseReference5.child("SOS").child(Id).child("Address").setValue(adducuc);

                                Toast.makeText(getApplicationContext(), "Complaint Registered Successfully...!!", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(), UserMenu.class));
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) { }
                    });
                }
            }
        });

    }


    class MyLocationListener implements LocationListener {

        @Override
        public void onLocationChanged(@NonNull Location location) {
            if (location != null) {
                locationManager.removeUpdates(locationListener);
                lat = "" + location.getLatitude();
                lon = "" + location.getLongitude();
                latitudecurrentadd.setText(lat);
                longitudecurrentadd.setText(lon);
                geocoder = new Geocoder(UserRegSOS.this, Locale.getDefault());
                try{
                    myaddress = geocoder.getFromLocation(location.getLatitude(),location.getLongitude(),1);
                }catch(IOException ex){
                    ex.printStackTrace();
                }
                address1 = myaddress.get(0).getAddressLine(0);
                addresscurrentadd.setText(address1);
            }
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(@NonNull String provider) {

        }

        @Override
        public void onProviderDisabled(@NonNull String provider) {

        }
    }

    public void getMyLocation() {
        try {
            gps_enable = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch (Exception e) {

        }

        try {
            network_enable = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch (Exception e) {

        }

        if (!gps_enable && !network_enable) {
            AlertDialog.Builder builder = new AlertDialog.Builder(UserRegSOS.this);
            builder.setTitle("Attention");
            builder.setMessage("Sorry, location is not available, please enable location services");
            builder.create().show();
        }
        if (gps_enable) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
        }
        if(network_enable){
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
        }
    }
    private boolean checkLocationPermission(){
        int location = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        int location2 = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
        List<String> listPermission = new ArrayList<>();
        if(location!=PackageManager.PERMISSION_GRANTED){
            listPermission.add(Manifest.permission.ACCESS_FINE_LOCATION);
        }
        if(location2 != PackageManager.PERMISSION_GRANTED){
            listPermission.add(Manifest.permission.ACCESS_COARSE_LOCATION);
        }if(!listPermission.isEmpty()){
            ActivityCompat.requestPermissions(this, listPermission.toArray(new String[listPermission.size()]),
                    1);
        }
        return true;
    }
}