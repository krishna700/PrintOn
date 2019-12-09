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

import com.printon.user.Activities.Event;
import com.printon.user.Activities.GiftsSubCategoriesActivity;
import com.printon.user.Activities.KeyChainSubCategoriesActivity;
import com.printon.user.Activities.MugsSubCategoriesActivity;
import com.printon.user.Activities.PhotosSubcategoriesActivity;
import com.printon.user.Activities.PillowSubCategoriesActivity;
import com.printon.user.Activities.TshirtsSubcategoriesActivity;
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
        holder.categories_text.setText(model.getCat_name());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView categories_image;
        TextView categories_text;

        public Holder(@NonNull View itemView) {
            super(itemView);
            categories_image = itemView.findViewById(R.id.categories_image);
            categories_text=itemView.findViewById(R.id.categories_text);

            categories_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    App.getSingleton().setCategory(categories.get(getAdapterPosition()).getCat_name());
                    switch (categories.get(getAdapterPosition()).getCat_name()){

                        case "Photos":
                            context.startActivity(new Intent(context, PhotosSubcategoriesActivity.class));
                           // Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
                            break;

                        case "Mugs":
                            context.startActivity(new Intent(context, MugsSubCategoriesActivity.class));
                           // Toast.makeText(context, "2", Toast.LENGTH_SHORT).show();
                            break;

                        case "Key Chains":
                            context.startActivity(new Intent(context, KeyChainSubCategoriesActivity.class));
                           // Toast.makeText(context, "3", Toast.LENGTH_SHORT).show();
                            break;

                        case "T-shirts":
                            context.startActivity(new Intent(context, TshirtsSubcategoriesActivity.class));
                           // Toast.makeText(context, "4", Toast.LENGTH_SHORT).show();
                            break;

                        case "Cushions":
                            context.startActivity(new Intent(context, PillowSubCategoriesActivity.class));
                            //Toast.makeText(context, "5", Toast.LENGTH_SHORT).show();
                            break;

                        case "Events":
                            context.startActivity(new Intent(context, Event.class));
                            //Toast.makeText(context, "6", Toast.LENGTH_SHORT).show();
                            break;


                        case "Gifts":
                            context.startActivity(new Intent(context, GiftsSubCategoriesActivity.class));
                            Toast.makeText(context, "7", Toast.LENGTH_SHORT).show();
                            break;


                    }


                }
            });
        }
    }
}
