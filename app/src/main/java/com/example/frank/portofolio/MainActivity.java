package com.example.frank.portofolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void about (View view){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void portfolio (View view){
        Intent intent = new Intent(this, PortofolioActivity.class);
        startActivity(intent);
    }

    public void contact (View view){
        Intent intent = new Intent(this,ContactActivity.class);
        startActivity(intent);
    }
}
