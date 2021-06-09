package com.example.financious;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class Graph extends AppCompatActivity {

    private  BarChart barChart;
    private BarData barData;
    private BarDataSet barDataSet;
    ArrayList entries;
private Button graph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        barChart=findViewById(R.id.chart);
        getEntries();
        barDataSet=new BarDataSet(entries,"Data Set");
        barData=new BarData(barDataSet);

        barChart.setData(barData);

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);
    }
    private void getEntries(){
        entries=new ArrayList();
        entries.add(new BarEntry(1,10000));

        entries.add(new BarEntry(2,30000));
        entries.add(new BarEntry(3,0));
        entries.add(new BarEntry(4,0));
        entries.add(new BarEntry(5,24000));
    }

}