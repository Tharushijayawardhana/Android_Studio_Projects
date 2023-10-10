package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textViewReceiver);

        Intent receiverIntent = getIntent();
        String message = receiverIntent.getStringExtra("message");

        if (message != null) {
            textView.setText(message);
        }
    }
}