package com.elveena.techliv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    Button btn_profile,btn_goalsSetting,btn_digitalHealth,btn_change_avatar,btn_social;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btn_profile = findViewById(R.id.button_profile);
        btn_goalsSetting = findViewById(R.id.button_goalsSetting);
        btn_digitalHealth = findViewById(R.id.button_digitalHealth);
        btn_change_avatar = findViewById(R.id.button_change_avatar);
        btn_social = findViewById(R.id.button_social);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),UserProfile.class);
                startActivity(intent);
            }
        });
        btn_goalsSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GoalsSetting.class);
                startActivity(intent);
            }
        });
        btn_digitalHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DigitalHealth.class);
                startActivity(intent);
            }
        });

        btn_change_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ChangeAvatar.class));
            }
        });
        btn_social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Social.class);
                startActivity(intent);
            }
        });
    }
}