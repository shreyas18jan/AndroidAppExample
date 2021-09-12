package com.example.androidappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class TextExamplePage extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_page);

        LinearLayout linearLayout = findViewById(R.id.textPageExample);

        for(int i=1; i<=30; i++){
            TextView textView = new TextView(this);
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            textView.setText("This is Line Number - " + i + "\n");
            textView.setId(i);
            linearLayout.addView(textView);
        }
    }
}