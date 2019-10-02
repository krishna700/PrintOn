package com.printon.user.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.printon.user.Models.CategoriesRecyclerModel;
import com.printon.user.R;

import java.util.List;

public class CategoriesRecyclerAdapter extends RecyclerView.Adapter<CategoriesRecyclerAdapter.Holder> {

    Context context;
    List<CategoriesRecyclerModel> categories;

    public CategoriesRecyclerAdapter(Context context, List<CategoriesRecyclerModel> categories) {
        this.context=context;
        this.categories=categories;

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_frag_recycler_item,parent,false);
        return new Holder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        CategoriesRecyclerModel model=categories.get(position);
        holder.categories_text.setText(model.getCat_name());
        holder.categories_image.setImageResource(model.getCat_image());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView categories_text;
        ImageView categories_image;

        public Holder(@NonNull View itemView) {
            super(itemView);
            categories_text=itemView.findViewById(R.id.categories_text);
            categories_image=itemView.findViewById(R.id.categories_image);
        }
    }
}
