package com.example.bhjencryption;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EcraResultado extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecra_resultado);


        TextView theTextView = (TextView) findViewById(R.id.menResultado);
        theTextView.setText("Este é o ecrã do resultado da operação");
    }
}
