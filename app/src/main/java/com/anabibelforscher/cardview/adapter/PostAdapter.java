package com.anabibelforscher.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anabibelforscher.cardview.R;
import com.anabibelforscher.cardview.model.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    private List<Post> mPosts;

    public PostAdapter(List<Post> postList) {
        this.mPosts = postList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_post, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Post post =  mPosts.get(position);
        holder.name.setText(post.getName());
        holder.time.setText(post.getTime());
        holder.subtitle.setText(post.getSubtitle());
        holder.image.setImageResource(post.getImage());
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView time;
        private TextView subtitle;
        private ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textName);
            time = itemView.findViewById(R.id.textTime);
            image = itemView.findViewById(R.id.imagePost);
            subtitle = itemView.findViewById(R.id.subtitlePost);

        }
    }
}
