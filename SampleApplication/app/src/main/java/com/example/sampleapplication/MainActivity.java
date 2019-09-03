package com.example.sampleapplication;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    DisplayAdapter displayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutManager = new LinearLayoutManager(this);

        int resAnime = R.anim.animation_go_up;
        LayoutAnimationController animationController = AnimationUtils.loadLayoutAnimation(this, resAnime);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutAnimation(animationController);
        recyclerView.setLayoutManager(layoutManager);
        displayAdapter = new DisplayAdapter(this);
        recyclerView.setAdapter(displayAdapter);


    }
}
