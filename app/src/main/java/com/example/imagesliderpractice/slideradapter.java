package com.example.imagesliderpractice;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class slideradapter extends RecyclerView.Adapter<slideradapter.ViewHolder>{
    List<Integer> mylist = new ArrayList<>();
    List<String> nameslist = new ArrayList<>();

    public slideradapter(List<Integer> mylist, List<String> nameslist) {
        this.mylist = mylist;
        this.nameslist = nameslist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sliderlayout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(mylist.get(position));
        holder.textView.setText(nameslist.get(position));
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
        public ImageView getImageView(){
            return imageView;
        }
        public TextView gettextview(){
            return textView;
        }
    }
}
