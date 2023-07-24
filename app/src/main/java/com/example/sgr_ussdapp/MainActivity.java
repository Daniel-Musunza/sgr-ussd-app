package com.example.sgr_ussdapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sgr_ussdapp.Activity2;
import com.example.sgr_ussdapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String userInput = editText.getText().toString().trim();
        if (userInput.equals("*639#")) {
            openActivity2();
        } else {
            Toast.makeText(this, "INVALID USSD", Toast.LENGTH_SHORT).show();
        }
    }

    public void openActivity2() {
        Toast.makeText(this, "USSD RUNNING", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
