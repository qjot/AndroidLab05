package com.example.mrlor.androidlab05;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonF1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityFragment f1 = new MainActivityFragment();
                setFragment(f1);
            }
        });

        findViewById(R.id.buttonF2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityFragment2 f2 = new MainActivityFragment2();
                setFragment(f2);
            }
        });
    }



    public void setFragment(Fragment fragment) {
          FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frameLayout, fragment);
            ft.commit();

    }

}




//        public void sendBroadcast()
//    {
//            Intent intent;
//    intent.setAction(:ten sam co w manifescie);
//    sendBroadcast(intent);}
//
