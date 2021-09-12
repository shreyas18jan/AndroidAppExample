package com.example.androidappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button example1 = (Button) findViewById(R.id.ButtonLabel);
        // On clicking this button open Labal Example Page
        example1.setOnClickListener(v -> openLabelExamplePage());

        Button example2 = (Button) findViewById(R.id.ButtonText);
        // On clicking this button open Text Example Page
        example2.setOnClickListener(v -> openTextExamplePage());

    }

    public void openLabelExamplePage(){
        // User can see the transition to another page using Intent
        Intent intent = new Intent(this, LabelExamplePage.class);
        startActivity(intent);
    }

    public void openTextExamplePage(){
        // User can see the transition to another page using Intent
        Intent intent = new Intent(this, TextExamplePage.class);
        startActivity(intent);
    }
}