package com.example.myapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class island extends AppCompatActivity {
    Button btnisland;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island);
        btnisland=findViewById(R.id.guideisland);
        btnisland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "GUIDE FOR ISLAND", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),islandguide.class);
                startActivity(intent);
            }
        });
    }
}