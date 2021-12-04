package com.example.myfragrments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnfar1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framee, new Fragment1()).commit();
    }

    public void btnfar2(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framee, new BlankFragment2()).commit();
    }
}