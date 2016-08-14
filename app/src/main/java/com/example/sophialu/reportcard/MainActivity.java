package com.example.sophialu.reportcard;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<ReportCard> reportCard = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.report_card_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        initializeData();
        mAdapter = new ReportCardAdapter(reportCard);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }


    // This method creates an ArrayList that has reportCard objects
    // Checkout the project associated with this tutorial on Github if
    // you want to use the same images.

    private void initializeData(){
        reportCard = new ArrayList<>();
        //    String studentName, String term, int grammerGrade, int mathGrade, int artGrade
        reportCard.add(new ReportCard("Chris", "Q1 2016-2017", 69, 85, 77));
        reportCard.add(new ReportCard("Jenny", "Q1 2016-2017", 88, 75, 92));
        reportCard.add(new ReportCard("John", "Q1 2016-2017", 80, 94, 72));
        reportCard.add(new ReportCard("John", "Q2 2016-2017", 79, 85, 80));
    }
}




