package com.example.myapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class konda extends AppCompatActivity {
    Button btnkonda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konda);
        btnkonda=findViewById(R.id.guiddekonda);
        btnkonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "GUIDE FOR KONDA", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),kondaguide.class);
                startActivity(intent);
            }
        });
    }
}