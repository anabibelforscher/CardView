package com.anabibelforscher.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anabibelforscher.cardview.R;
import com.anabibelforscher.cardview.adapter.PostAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerPost = findViewById(R.id.recyclerPost);

        //Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerPost.setLayoutManager(layoutManager);

        //Adapter
        PostAdapter adapter = new PostAdapter();
        mRecyclerPost.setAdapter(adapter);
    }
}