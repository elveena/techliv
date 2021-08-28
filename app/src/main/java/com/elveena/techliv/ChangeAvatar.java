package com.elveena.techliv;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class ChangeAvatar extends AppCompatActivity {
    Button set;

    MaterialCardView cardAv1,cardAv2,cardAv3,cardAv4,cardAv5,cardAv6,cardAv7,cardAv8,cardAv9,cardAv10;
    private static final int[] CHECKED_STATE_SET = {
            android.R.attr.state_checked,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_avatar);


        set = findViewById(R.id.set_avatar);

        cardAv1 = findViewById(R.id.card_avatar1);
        cardAv2 = findViewById(R.id.card_avatar2);
        cardAv3 = findViewById(R.id.card_avatar3);
        cardAv4 = findViewById(R.id.card_avatar4);
        cardAv5 = findViewById(R.id.card_avatar5);
        cardAv6 = findViewById(R.id.card_avatar6);
        cardAv7 = findViewById(R.id.card_avatar7);
        cardAv8 = findViewById(R.id.card_avatar8);
        cardAv9 = findViewById(R.id.card_avatar9);
        cardAv10 = findViewById(R.id.card_avatar10);

        cardAv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv1.setChecked(!cardAv1.isChecked());
            }
        });
        cardAv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv2.setChecked(!cardAv2.isChecked());
            }
        });
        cardAv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv3.setChecked(!cardAv3.isChecked());
            }
        });
        cardAv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv4.setChecked(!cardAv4.isChecked());
            }
        });
        cardAv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv5.setChecked(!cardAv5.isChecked());
            }
        });
        cardAv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv6.setChecked(!cardAv6.isChecked());
            }
        });
        cardAv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv7.setChecked(!cardAv7.isChecked());
            }
        });
        cardAv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv8.setChecked(!cardAv8.isChecked());
            }
        });
        cardAv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv9.setChecked(!cardAv9.isChecked());
            }
        });
        cardAv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAv10.setChecked(!cardAv10.isChecked());
            }
        });

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChangeAvatar.this, "Avatar changed successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Dashboard.class));
            }
        });


    }

}