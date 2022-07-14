package com.example.myapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class netrani extends AppCompatActivity {
    Button btnnetrani;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_netrani);
      btnnetrani=findViewById(R.id.guidenetrani);
      btnnetrani.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(getApplicationContext(), "GUIDE FOR NETRANI", Toast.LENGTH_SHORT).show();
              Intent intent=new Intent(getApplicationContext(),netraniguide.class);
              startActivity(intent);
          }
      });

    }
}