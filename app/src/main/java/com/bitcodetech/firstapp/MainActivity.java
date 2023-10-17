package com.bitcodetech.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txtName = new TextView(this);
        txtName.setTextSize(50);
        txtName.setText("Hello World!");
        setContentView(txtName);
    }
}