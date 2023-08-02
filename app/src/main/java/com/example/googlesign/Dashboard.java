package com.example.googlesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {


    TextView email_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        email_tv = findViewById(R.id.email_tv);

        Intent intent = getIntent();
       String email = intent.getStringExtra("email");
        email_tv.setText(email);


    }
}