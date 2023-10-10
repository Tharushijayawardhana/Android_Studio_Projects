package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstNameEditText;
    EditText lastNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEditText = findViewById(R.id.firstname);
        lastNameEditText = findViewById(R.id.lastname);

    }

    public void sayHi(View v) {
        String firstName = firstNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();
        String message = "Hi, " + firstName + " " + lastName;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}