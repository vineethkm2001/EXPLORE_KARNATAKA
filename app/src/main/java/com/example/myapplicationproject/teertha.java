package com.example.myapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class teertha extends AppCompatActivity {
    Button btnteertha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teertha);
        btnteertha=findViewById(R.id.guideteertha);
        btnteertha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "GUIDE FOR THEERTHA", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),teerthaguide.class);
                startActivity(intent);
            }
        });
    }
}