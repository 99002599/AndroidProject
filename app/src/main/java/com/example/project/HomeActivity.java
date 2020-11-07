package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    //Initializing the recycler view variable here
    RecyclerView recyclerView;
    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Assign variable
        recyclerView = findViewById(R.id.recycler_view);

        //Create Integer Array
        Integer[] artLogo = {R.drawable.a1
                ,R.drawable.a3,R.drawable.a4,R.drawable.a5
                ,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9
                ,R.drawable.a10,R.drawable.a11};
        //create string Array
        String[] artName = {"Painting1","Painting3","Architechture1",
                "Architechture2","Architechture3","Drawing","Photography"
                ,"Sculpture","Ceramics","Conceptualart"};

        //Initializing ArrayList
        mainModels = new ArrayList<>();
        for(int i=0;i<artLogo.length;i++){
            MainModel model = new MainModel(artLogo[i],artName[i]);
            mainModels.add(model);

        }
        //Designing Horizontal Layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                HomeActivity.this,LinearLayoutManager.HORIZONTAL,false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Initialize MainAdapter
        mainAdapter = new MainAdapter(HomeActivity.this,mainModels);
        //Set MainAdapter to RecyclerView
        recyclerView.setAdapter(mainAdapter);

    }
}