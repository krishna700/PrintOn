package com.printon.user.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;

import java.util.List;

public class SubCategoriesRecyclerAdapter extends RecyclerView.Adapter<SubCategoriesRecyclerAdapter.Holder> {
    Context context;
    List<SubCategoriesModel> sub_cat;

    public SubCategoriesRecyclerAdapter(Context context, List<SubCategoriesModel> sub_cat) {
        this.context = context;
        this.sub_cat = sub_cat;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sub_cat_recycler_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.sub_cat_image.setImageResource(sub_cat.get(position).getSub_cat_image());
        holder.sub_cat_name.setText(sub_cat.get(position).getSub_cat_name());
        holder.sub_cat_price.setText(sub_cat.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return sub_cat.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView sub_cat_image;
        TextView sub_cat_name, sub_cat_price;

        public Holder(@NonNull View itemView) {
            super(itemView);
            sub_cat_image=itemView.findViewById(R.id.sub_cat_recycler_image);
            sub_cat_name=itemView.findViewById(R.id.sub_cat_recycler_name);
            sub_cat_price=itemView.findViewById(R.id.sub_cat_recycler_price);

        }
    }
}
