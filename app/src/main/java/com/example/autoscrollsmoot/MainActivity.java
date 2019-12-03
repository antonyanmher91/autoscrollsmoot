package com.example.autoscrollsmoot;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView resuclerview;
    RecviewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.android);
        list.add(R.drawable.android);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.android);
        list.add(R.drawable.android);

        list.add(R.drawable.android);
        list.add(R.drawable.android);
        list.add(R.drawable.ic_launcher_foreground);
        list.add(R.drawable.android);
        list.add(R.drawable.android);
        resuclerview = findViewById(R.id.resview);
        adapter = new RecviewAdapter(list);

        LinearLayoutManager manager = new MyManager(this, LinearLayoutManager.HORIZONTAL, false);

        resuclerview.setLayoutManager(manager);


        resuclerview.setAdapter(adapter);
        resuclerview.smoothScrollToPosition(8);


    }
}
