package com.elveena.techliv;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;


public class Social extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        chipNavigationBar = findViewById(R.id.bottom_social_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FeedFragment()).commit();

        bottomMenu();

    }

    private void bottomMenu() {
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;
                switch(i){
                    case R.id.bottom_social_messages:
                        fragment = new FeedFragment();
                        break;
                    case R.id.bottom_social_feed:
                        fragment = new MessagesFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();

            }
        });
    }


}