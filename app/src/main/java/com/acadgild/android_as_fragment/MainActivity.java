package com.acadgild.android_as_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bring the fragment to our mainactivity
        getFragmentManager().findFragmentById(R.id.fragment);
    }
}
