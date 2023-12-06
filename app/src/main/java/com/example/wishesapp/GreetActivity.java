package com.example.wishesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class GreetActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);
         textView=findViewById(R.id.greetText);
         Intent intent=getIntent();
         String name=intent.getStringExtra("NAME");
        Log.i("message",name);
         textView.setText(String.valueOf("Happy Birthday\n"+name));
    }
}