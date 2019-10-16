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

import com.printon.user.Activities.KeyChainSubCategoriesActivity;
import com.printon.user.Activities.MugsSubCategoriesActivity;
import com.printon.user.Activities.PillowSubCategoriesActivity;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.List;

public class ShiftCatRecyclerAdapter extends RecyclerView.Adapter<ShiftCatRecyclerAdapter.Holder> {
    Context context;
    List<ShiftCatmodel> shift_cat;

    public ShiftCatRecyclerAdapter(Context context, List<ShiftCatmodel> shift_cat) {
        this.context = context;
        this.shift_cat = shift_cat;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.shift_cat_recycler_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.shift_cat_text.setText(shift_cat.get(position).getCat());

    }

    @Override
    public int getItemCount() {
        return shift_cat.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView shift_cat_image;
        TextView shift_cat_text;


        public Holder(@NonNull View itemView) {
            super(itemView);
            shift_cat_image=itemView.findViewById(R.id.shift_cat_recycler_image);
            shift_cat_text=itemView.findViewById(R.id.shift_cat_recycler_text);
            shift_cat_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (shift_cat.get(getAdapterPosition()).getCat()){

                        case "Photos":
                            Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
                            break;

                        case "Mugs":
                            App.getSingleton().setCategory(shift_cat.get(getAdapterPosition()).getCat());
                            Intent intent2= new Intent(context, MugsSubCategoriesActivity.class);
                            intent2.setFlags(intent2.FLAG_ACTIVITY_NEW_TASK);
                            context.startActivity(intent2);
                            Toast.makeText(context, "2", Toast.LENGTH_SHORT).show();
                            break;

                        case "Key Chains":
                            App.getSingleton().setCategory(shift_cat.get(getAdapterPosition()).getCat());
                            Intent intent3= new Intent(context, KeyChainSubCategoriesActivity.class);
                            intent3.setFlags(intent3.FLAG_ACTIVITY_NEW_TASK);
                            context.startActivity(intent3);
                            Toast.makeText(context, "3", Toast.LENGTH_SHORT).show();
                            break;

                        case "T-shirts":
                            Toast.makeText(context, "4", Toast.LENGTH_SHORT).show();
                            break;

                        case "Cushions":
                            App.getSingleton().setCategory(shift_cat.get(getAdapterPosition()).getCat());
                            Intent intent5= new Intent(context, PillowSubCategoriesActivity.class);
                            intent5.setFlags(intent5.FLAG_ACTIVITY_NEW_TASK);
                            context.startActivity(intent5);
                            Toast.makeText(context, "5", Toast.LENGTH_SHORT).show();
                            break;

                        case "Events":
                            Toast.makeText(context, "6", Toast.LENGTH_SHORT).show();
                            break;


                        case "Gifts":
                            Toast.makeText(context, "7", Toast.LENGTH_SHORT).show();
                            break;


                    }

                }
            });
        }
    }
}
