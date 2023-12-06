package com.example.wishesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.edit_txt);
        Button button = findViewById(R.id.greet_btn);

        button.setOnClickListener(view -> {
            String name = mEditText.getText().toString();
            Intent intent = new Intent(this, GreetActivity.class);
            intent.putExtra("NAME", name);
            startActivity(intent);
        });
    }


}