package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
public class BARCHART extends AppCompatActivity {

    BarChart barChart;
    BarData barData;
    BarDataSet barDataSet;
    ArrayList barEntries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_a_r_c_h_a_r_t);

        barChart = findViewById(R.id.BarChart);

        barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1, 2018));
        barEntries.add(new BarEntry(2, 2019));
        barEntries.add(new BarEntry(3, 2020));
        barEntries.add(new BarEntry(4, 2021));
        barEntries.add(new BarEntry(5, 2023));
        barEntries.add(new BarEntry(6, 2023));

        barDataSet = new BarDataSet(barEntries, "");
        barData = new BarData(barDataSet);
        barChart.setData(barData);
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        barDataSet.setValueTextColor(Color.BLUE);
        barDataSet.setValueTextSize(18f);
    }
}