package com.example.myapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page2 extends AppCompatActivity {
    Button btnevent1;
    Button btnevent2;
    Button btnevent3;
    Button btnevent4;
    Button btnevent5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        //THEERTHA FALLS
        btnevent1 = findViewById(R.id.btnteertha);
        btnevent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "btnteertha", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),teertha.class);
                startActivity(intent);
            }
        });
        //ERMAI FALLS
        btnevent2=findViewById(R.id.btnermai);
        btnevent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "btnermai", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),ermai.class);
                startActivity(intent);
            }
        });
        //NETRANI ISLAND
        btnevent3=findViewById(R.id.btnnetrani);
        btnevent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "btnnetrani", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),netrani.class);
                startActivity(intent);
            }
        });
        btnevent4=findViewById(R.id.btnknoda);
        btnevent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "btnapsara", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),konda.class);
                startActivity(intent);
            }
        });
        //ST MARY's ISLAND
        btnevent5=findViewById(R.id.btnisland);
        btnevent5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "btnisland", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),island.class);
                startActivity(intent);
            }
        });
    }
}