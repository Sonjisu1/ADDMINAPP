package com.example.addminapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Userlist extends AppCompatActivity {

    RecyclerImageTextAdapter recyclerImageTextAdapter;
    ArrayList<ListViewItem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerImageTextAdapter = new RecyclerImageTextAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        recyclerView.setAdapter(recyclerImageTextAdapter);

        list.add(new ListViewItem(R.drawable.ic_person_black_24dp,"김철수"));
        list.add(new ListViewItem(R.drawable.ic_person_black_24dp,"김영희"));
    }
}
