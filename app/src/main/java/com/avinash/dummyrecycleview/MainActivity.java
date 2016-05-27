package com.avinash.dummyrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private List<String> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycleView= (RecyclerView) findViewById(R.id.mRecycleView);
        mData = new ArrayList<>();
        mData.add("Avinash 1");
        mData.add("Avinash 2");
        mData.add("Avinash 3");
        mData.add("Avinash 4");
        mData.add("Avinash 5");
        mData.add("Avinash 6");
        mData.add("Avinash 7");
        mData.add("Avinash 8");
        mData.add("Avinash 9");
        setUpRecycleView();
    }


    private void setUpRecycleView(){
        RecycleViewAdapter mRecycleViewAdapter = new RecycleViewAdapter(this,mData);
        mRecycleView.setAdapter(mRecycleViewAdapter);

        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecycleView.setLayoutManager(mLinearLayoutManager);


    }
}
