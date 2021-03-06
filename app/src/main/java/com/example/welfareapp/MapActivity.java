package com.example.welfareapp;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private FragmentManager fragmentManager;
    private MapFragment mapFragment;

    // back button listener
    private static long back_pressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Bundle bundle = getIntent().getExtras();

        fragmentManager = getFragmentManager();
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setSelectedItemId(R.id.navigation_3);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.navigation_1:
                        Intent intent = new Intent(MapActivity.this, MainActivity.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        finish();
                        return true;
                    case R.id.navigation_2:
                        Intent intent2 = new Intent(MapActivity.this, ChatActivity.class);
                        intent2.putExtras(bundle);
                        startActivity(intent2);
                        finish();
                        return true;
                    case R.id.navigation_3:
                        return true;
                    case R.id.navigation_4:
                        Intent intent4 = new Intent(MapActivity.this, MyProfileActivity.class);
                        intent4.putExtras(bundle);
                        startActivity(intent4);
                        finish();
                        return true;
                }
                return false;
            }
        });

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        LatLng location = new LatLng(37.66906721801756, 126.74585049396974);
        MarkerOptions makerOptions = new MarkerOptions();
        makerOptions.title("?????????");
        makerOptions.position(location);
        googleMap.addMarker(makerOptions);
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,16));

        // ?????? 6?????? ?????? ????????? ???????????? ??????
        findViewById(R.id.map_button_1).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LatLng location = new LatLng(37.67499970139062, 126.75630109866633);
                        MarkerOptions makerOptions = new MarkerOptions();
                        makerOptions.title("??????7???????????????");
                        makerOptions.snippet("????????????");
                        makerOptions.position(location);
                        googleMap.addMarker(makerOptions);
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,16));

                    }
                }
        );
        findViewById(R.id.map_button_2).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LatLng location = new LatLng(37.68570899575992, 126.77617620877542);
                        MarkerOptions makerOptions = new MarkerOptions();
                        makerOptions.title("?????????????????????");
                        makerOptions.snippet("?????????");
                        makerOptions.position(location);
                        googleMap.addMarker(makerOptions);
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,16));

                    }
                }
        );
        findViewById(R.id.map_button_3).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LatLng location = new LatLng(37.6730556169046, 126.75073982985964);
                        MarkerOptions makerOptions = new MarkerOptions();
                        makerOptions.title("???????????????");
                        makerOptions.snippet("?????????");
                        makerOptions.position(location);
                        googleMap.addMarker(makerOptions);
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,16));
                    }
                }
        );
        findViewById(R.id.map_button_4).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LatLng location = new LatLng(37.670906121679465, 126.76323593167368);
                        MarkerOptions makerOptions = new MarkerOptions();
                        makerOptions.title("??????1???????????????");
                        makerOptions.snippet("????????????");
                        makerOptions.position(location);
                        googleMap.addMarker(makerOptions);
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,16));
                    }
                }
        );
        findViewById(R.id.map_button_5).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LatLng location = new LatLng(37.67934144312334, 126.7452744402421);
                        MarkerOptions makerOptions = new MarkerOptions();
                        makerOptions.title("???????????????");
                        makerOptions.snippet("??????");
                        makerOptions.position(location);
                        googleMap.addMarker(makerOptions);
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,16));

                    }
                }
        );
        findViewById(R.id.map_button_6).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LatLng location = new LatLng(37.672414256752596, 126.75911880168037);
                        MarkerOptions makerOptions = new MarkerOptions();
                        makerOptions.title("???????????????");
                        makerOptions.snippet("??????");
                        makerOptions.position(location);
                        googleMap.addMarker(makerOptions);
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,16));
                    }
                }
        );

        findViewById(R.id.map_button_7).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LatLng location = new LatLng(37.66906721801756, 126.74585049396974);
                        MarkerOptions makerOptions = new MarkerOptions();
                        makerOptions.snippet("?????? ??????");
                        makerOptions.position(location);
                        googleMap.addMarker(makerOptions);
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,13));
                    }
                }
        );
    }

    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
        }
        else {
            Toast.makeText(getBaseContext(), "???????????? ????????? ?????? ??? ????????? ?????? ???????????????.", Toast.LENGTH_SHORT).show();
        }
        back_pressed = System.currentTimeMillis();
    }

}