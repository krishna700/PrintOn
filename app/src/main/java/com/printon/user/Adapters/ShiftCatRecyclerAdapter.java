package com.printon.user.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.printon.user.Activities.SubCategoriesActivity;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.List;

public class ShiftCatRecyclerAdapter extends RecyclerView.Adapter<ShiftCatRecyclerAdapter.Holder> {
    Context context;
    List<ShiftCatmodel> shift_cat;
    OnClick onClick;

    public interface OnClick{
        void shift();
    }


    public ShiftCatRecyclerAdapter(Context context, List<ShiftCatmodel> shift_cat, OnClick onClick) {
        this.context = context;
        this.shift_cat = shift_cat;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.shift_cat_recycler_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.shift_cat_image.setImageResource(shift_cat.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return shift_cat.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView shift_cat_image;

        public Holder(@NonNull View itemView) {
            super(itemView);
            shift_cat_image=itemView.findViewById(R.id.shift_cat_recycler_image);
            shift_cat_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    App.getSingleton().setCategory(shift_cat.get(getAdapterPosition()).getCat());
                    Toast.makeText(context, App.getSingleton().getCategory(), Toast.LENGTH_SHORT).show();
                    onClick.shift();
                }
            });
        }
    }
}
