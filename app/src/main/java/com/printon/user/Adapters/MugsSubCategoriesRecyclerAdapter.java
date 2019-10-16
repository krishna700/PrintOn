package com.printon.user.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.printon.user.Activities.AddToCartActivity;
import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.List;

public class MugsSubCategoriesRecyclerAdapter extends RecyclerView.Adapter<MugsSubCategoriesRecyclerAdapter.Holder> {
    Context context;
    List<SubCategoriesModel> sub_cat;


    public MugsSubCategoriesRecyclerAdapter(Context context, List<SubCategoriesModel> sub_cat) {
        this.context = context;
        this.sub_cat = sub_cat;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.mugs_sub_cat_recycler_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int position) {
        holder.mugs_sub_cat_image.setImageResource(sub_cat.get(position).getSub_cat_image());
        holder.mugs_sub_cat_name.setText(sub_cat.get(position).getSub_cat_name());
    }

    @Override
    public int getItemCount() {
        return sub_cat.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView mugs_sub_cat_image;
        TextView mugs_sub_cat_name;
        RelativeLayout mugs_sub_cat;

        public Holder(@NonNull View itemView) {
            super(itemView);
            mugs_sub_cat_image =itemView.findViewById(R.id.mugs_sub_cat_recycler_image);
            mugs_sub_cat_name =itemView.findViewById(R.id.mugs_sub_cat_recycler_name);
            mugs_sub_cat=itemView.findViewById(R.id.mugs_sub_cat_layout);

            mugs_sub_cat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    App.getSingleton().setSub_category(sub_cat.get(getAdapterPosition()).getSub_cat_name());
                    Intent intent= new Intent(context, AddToCartActivity.class);
                    intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            });


        }
    }
}
