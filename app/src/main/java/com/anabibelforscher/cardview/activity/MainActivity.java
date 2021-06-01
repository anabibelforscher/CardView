package com.anabibelforscher.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anabibelforscher.cardview.R;
import com.anabibelforscher.cardview.adapter.PostAdapter;
import com.anabibelforscher.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerPost;
    private List<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerPost = findViewById(R.id.recyclerPost);

        //Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerPost.setLayoutManager(layoutManager);

        //Adapter
        this.gerarPosts();
        PostAdapter adapter = new PostAdapter(posts);
        mRecyclerPost.setAdapter(adapter);
    }

    //Gerar posts de forma mais simples
    public void gerarPosts(){
        Post post = new Post("Ana Bibelforscher","September Song", "Now",R.drawable.nature);
        this.posts.add(post);
        post = new Post("Ana Bibelforscher","La vie en rose", "1 week ago", R.drawable.paris);
        this.posts.add(post);
        post = new Post("Ana Bibelforscher","Clouds", "2 weeks ago", R.drawable.sky);
        this.posts.add(post);
        post = new Post("Ana Bibelforscher","Up, up and away...", "3 weeks ago", R.drawable.fly);
        this.posts.add(post);
    }
}