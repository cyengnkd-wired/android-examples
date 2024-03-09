package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.BarChart).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), BarChartActivity.class)));
        findViewById(R.id.PieChart).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), PieChartActivity.class)));

    }
}