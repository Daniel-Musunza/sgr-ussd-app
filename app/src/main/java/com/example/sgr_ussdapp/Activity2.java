package com.example.sgr_ussdapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = findViewById(R.id.textView);
        textView.setText("\n\n1. Inter-County 8:00AM\n2. Nairobi-Voi-Msa Express\n3. Mombasa-Voi-Nrb Express\n4. Suswa Train\n\nHelpline:0709388888\n\n00. Main\n98:MORE");

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

    }

    public void openActivity3() {
        Toast.makeText(this, "USSD RUNNING",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}