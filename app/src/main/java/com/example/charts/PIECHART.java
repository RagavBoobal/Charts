package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
public class PIECHART extends AppCompatActivity {

    PieChart pieChart;
    PieData pieData;
    PieDataSet pieDataSet;
    ArrayList pieEntries;
    ArrayList PieEntryLabels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_i_e_c_h_a_r_t);
        pieChart = findViewById(R.id.pieChart);

        pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(8, "Work"));
        pieEntries.add(new PieEntry(6, "Task"));
        pieEntries.add(new PieEntry(2, "Eat"));
        pieEntries.add(new PieEntry(6, "Sleep"));
        pieEntries.add(new PieEntry(2, "Mobile"));

        pieDataSet = new PieDataSet(pieEntries, "Daily Activities");
        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        pieDataSet.setSliceSpace(2f);
        pieDataSet.setValueTextColor(Color.BLUE);
        pieDataSet.setValueTextSize(10f);
        pieDataSet.setSliceSpace(5f);
    }
}