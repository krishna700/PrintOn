package com.printon.user.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.printon.user.R;

import java.util.List;

public class FramesRecyclerAdapter extends RecyclerView.Adapter<FramesRecyclerAdapter.Holder> {
    Context context;
    List<Integer> Frame;

    public FramesRecyclerAdapter(Context context, List<Integer> frame) {
        this.context = context;
        Frame = frame;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.frames_recycler_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.frame.setImageResource(Frame.get(position));

    }

    @Override
    public int getItemCount() {
        return Frame.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView frame;

        public Holder(@NonNull View itemView) {
            super(itemView);
            frame=itemView.findViewById(R.id.frame);
        }
    }
}
