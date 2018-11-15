package com.example.administrator.titipan;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final DrawerLayout drawerLayout;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.main_navigationView);
        getFragmentManager().beginTransaction().replace(R.id.main_frame, new Main01Activity()).commit();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.first) {
                    getFragmentManager().beginTransaction().replace(R.id.main_frame, new MenuActivity()).commit();
                }
                if (menuItem.getItemId() == R.id.second) {
                    getFragmentManager().beginTransaction().replace(R.id.main_frame, new IntroduceActivity()).commit();
                }
                if (menuItem.getItemId() == R.id.third) {
                    getFragmentManager().beginTransaction().replace(R.id.main_frame, new MapActivity()).commit();
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });


        ImageView imageView_logo = (ImageView) findViewById(R.id.Toolbar_logo);
        imageView_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.main_frame, new Main01Activity()).commit();
            }
        });


    }

    public void onProductLink01(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps/place/%ED%8B%B0%ED%8B%B0%ED%8C%AC%EB%AF%B8%EC%8B%9C%EB%A0%B9%EC%A0%90/@38.2070865,128.5745487,15z/data=!4m2!3m1!1s0x0:0x1c676e8bcec80f16?ved=2ahUKEwj1v6WR4s3eAhXbZt4KHdMhAQMQ_BIwEXoECAYQCA"));
        startActivity(intent);
    }
    public void onProductLink02(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps/place/%ED%8B%B0%ED%8B%B0%ED%8C%AC+%5B%EC%9C%A0%EA%B8%B0%EB%86%8D+%EC%88%98%EC%A0%9C%EC%8B%9D%EB%B9%B5%EC%A0%84%EB%AC%B8%EC%A0%90%5D/@38.2018804,128.5867217,17.5z/data=!4m5!3m4!1s0x0:0x9e9430112286159!8m2!3d38.201659!4d128.5881917"));
        startActivity(intent);

    }

}
