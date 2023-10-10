package com.example.activity3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText firstNameEditText;
    EditText lastNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstNameEditText = findViewById(R.id.firstname);
        lastNameEditText = findViewById(R.id.lastname);

        Button sayHiButton = findViewById(R.id.SayHi);
        sayHiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = firstNameEditText.getText().toString();
                String lastName = lastNameEditText.getText().toString();
                String message = "Hi, " + firstname + " " + lastName;

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);
            }
        });
    }
}
