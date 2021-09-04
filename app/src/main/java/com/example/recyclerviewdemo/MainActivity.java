package com.example.recyclerviewdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.model.Note;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvNames;
    Adapter adapter;
    List<Note> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNames = findViewById(R.id.rvNames);

        names = new ArrayList<>();

        names.add(new Note("Bob"));
        names.add(new Note("John"));
        names.add(new Note("Sarah"));

        adapter = new Adapter(names);

        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rvNames.addItemDecoration(dividerItemDecoration);

        rvNames.setLayoutManager(new LinearLayoutManager(this));
        rvNames.setAdapter(adapter);
    }
}
