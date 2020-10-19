package com.sanju.graph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    GraphView graphView;
    LineGraphSeries<DataPoint>  series;
    SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graphView = findViewById(R.id.graphView);
        series = new LineGraphSeries<>(getdataPoint());
        graphView.addSeries(series);

//        graphView.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter()
//        {
//            @Override
//            public String formatLabel(double value, boolean isValueX) {
//                if(isValueX) {
//                    return sdf.format(new Date((long) value));
//                }
//                else {
//                    return super.formatLabel(value, isValueX);
//                }
//            }
//        });
//        graphView.getGridLabelRenderer().setNumHorizontalLabels(5);
    }

    private DataPoint[] getdataPoint() {
        DataPoint[] dp = new DataPoint[]{
                new DataPoint(0,11),
                new DataPoint(1,2),
                new DataPoint(2,10),
                new DataPoint(3,4),
                new DataPoint(4,15),
                new DataPoint(5,8),
                new DataPoint(6,10),
                new DataPoint(7,8),
                new DataPoint(8,9),
                new DataPoint(9,0),
        };
        return dp;
    }
}