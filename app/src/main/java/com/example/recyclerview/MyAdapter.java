package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {
    Context context;
    String[]title,description;
    int []images;

    public MyAdapter(Context context, String[] title, String[] description, int[] images) {
        this.context = context;
        this.title = title;
        this.description = description;
        this.images = images;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.item,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.tileTextView.setText(title[position]);
        holder.descriptionTextView.setText(description[position]);
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        TextView tileTextView,descriptionTextView;
        ImageView imageView;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            tileTextView=itemView.findViewById(R.id.titleTextViewId);
            descriptionTextView=itemView.findViewById(R.id.descriptionTextViewId);
            imageView=itemView.findViewById(R.id.imageViewId);
        }

        @Override
        public void onClick(View view) {
            
        }

        @Override
        public boolean onLongClick(View view) {
            return false;
        }
    }
}
