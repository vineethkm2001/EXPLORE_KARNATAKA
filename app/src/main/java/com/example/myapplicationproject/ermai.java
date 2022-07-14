package com.example.myapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ermai extends AppCompatActivity {
    Button btnermai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ermai);
        btnermai=findViewById(R.id.guideermai);
        btnermai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "GUIDE FOR ERMAI", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),ermaiguide.class);
                startActivity(intent);
            }
        });
    }
}