package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart = findViewById(R.id.PieChart);
        ArrayList<PieEntry> test = new ArrayList<>();
        test.add(new PieEntry(320, "NON-test"));
        test.add(new PieEntry(420, "test"));

        PieDataSet pieDataSet = new PieDataSet(test, "test");
        pieDataSet.setColors(ColorTemplate.PASTEL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(20f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.setCenterText("test");
        pieChart.animate();

    }
}