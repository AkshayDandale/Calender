package com.example.kalcharya;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class Navigation extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    ImageButton imgRight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        toolbar=findViewById(R.id.toolbar);
        imgRight=findViewById(R.id.imgRight);

        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        imgRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(imgRight))
                {
                    drawerLayout.closeDrawer(imgRight);
                }
               else if (!drawerLayout.isDrawerOpen(imgRight))
                {
                    drawerLayout.openDrawer(imgRight);
                }
            }
        });

    }
}
