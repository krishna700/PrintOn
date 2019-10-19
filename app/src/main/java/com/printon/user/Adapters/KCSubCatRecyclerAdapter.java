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

import com.printon.user.Activities.AddToCartActivity;
import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.List;

public class KCSubCatRecyclerAdapter extends RecyclerView.Adapter<KCSubCatRecyclerAdapter.Holder> {
    Context context;
    List<SubCategoriesModel> sub_cat;
    String sub_catergory="";

    public KCSubCatRecyclerAdapter(Context context, List<SubCategoriesModel> sub_cat) {
        this.context = context;
        this.sub_cat = sub_cat;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.kc_sub_cat_recycler_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        SubCategoriesModel model=sub_cat.get(position);
        holder.kc_sub_cat_recycler_image.setImageResource(model.getSub_cat_image());
        holder.kc_sub_cat_recycler_text.setText(model.getSub_cat_name());

    }

    @Override
    public int getItemCount() {
        return sub_cat.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView kc_sub_cat_recycler_image;
        TextView kc_sub_cat_recycler_text;

        public Holder(@NonNull View itemView) {
            super(itemView);
            kc_sub_cat_recycler_image=itemView.findViewById(R.id.kc_sub_cat_image);
            kc_sub_cat_recycler_text=itemView.findViewById(R.id.kc_sub_cat_text);
            kc_sub_cat_recycler_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (App.getSingleton().getCategory().equals("Key Chains")){
                        sub_catergory=sub_cat.get(getAdapterPosition()).getSub_cat_name()+" Key Chain";
                    }else
                        if (App.getSingleton().getCategory().equals("T-shirts")){
                            sub_catergory=sub_cat.get(getAdapterPosition()).getSub_cat_name();
                        }

                    Toast.makeText(context, sub_catergory, Toast.LENGTH_SHORT).show();
                    App.getSingleton().setSub_category(sub_catergory);
                    context.startActivity(new Intent(context,AddToCartActivity.class));

                }
            });
        }
    }
}
