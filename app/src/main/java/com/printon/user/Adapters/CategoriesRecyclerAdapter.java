package com.printon.user.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.printon.user.Activities.SubCategoriesActivity;
import com.printon.user.Models.CategoriesRecyclerModel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.List;

public class CategoriesRecyclerAdapter extends RecyclerView.Adapter<CategoriesRecyclerAdapter.Holder> {

    Context context;
    List<CategoriesRecyclerModel> categories;
    String cat_name = "";

    public CategoriesRecyclerAdapter(Context context, List<CategoriesRecyclerModel> categories) {
        this.context = context;
        this.categories = categories;

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_frag_recycler_item, parent, false);
        return new Holder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int position) {
        CategoriesRecyclerModel model = categories.get(position);
        holder.categories_image.setImageResource(model.getCat_image());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView categories_image;

        public Holder(@NonNull View itemView) {
            super(itemView);
            categories_image = itemView.findViewById(R.id.categories_image);

            categories_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    App.getSingleton().setCategory(categories.get(getAdapterPosition()).getCat_name());
                    context.startActivity(new Intent(context, SubCategoriesActivity.class));

                }
            });
        }
    }
}
