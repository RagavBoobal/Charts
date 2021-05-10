package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
import android.graphics.Color;
public class LINECHART extends AppCompatActivity {

    LineChart lineChart;
    LineData lineData;
    LineDataSet lineDataSet;
    ArrayList lineEntries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_i_n_e_c_h_a_r_t);
        lineChart = findViewById(R.id.lineChart);

        lineEntries = new ArrayList<>();
        lineEntries.add(new Entry(100, 2014));
        lineEntries.add(new Entry(200, 2015));
        lineEntries.add(new Entry(300, 2016));
        lineEntries.add(new Entry(400, 2017));
        lineEntries.add(new Entry(500, 2018));
        lineEntries.add(new Entry(600, 2019));

        lineDataSet = new LineDataSet(lineEntries, "Company Performance");
        lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);
        lineDataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        lineDataSet.setValueTextColor(Color.BLUE);
        lineDataSet.setValueTextSize(18f);
    }
}