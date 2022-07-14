package com.example.myapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button btnevent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnevent  = findViewById(R.id.btnvisit);
        btnevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"LETS EXPLORE!!!",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getApplicationContext(),page2.class);
                startActivity(intent);
            }
        });
    }
}