package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.printon.user.Adapters.KCSubCatRecyclerAdapter;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;

import java.util.ArrayList;
import java.util.List;

public class TshirtsSubcategoriesActivity extends AppCompatActivity {
    RecyclerView ts_sub_cat_recycler;
    List<SubCategoriesModel> sub_cat=new ArrayList<>();
    SubCategoriesModel subCatModel;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirts_subcategories);
        getSupportActionBar().hide();
        logo=findViewById(R.id.logo_sub_cat_ts);
        ts_sub_cat_recycler =findViewById(R.id.ts_sub_cat_recycler);
        ts_sub_cat_recycler.setLayoutManager(new GridLayoutManager(this,2));
        setLists();
        ts_sub_cat_recycler.setAdapter(new KCSubCatRecyclerAdapter(this,sub_cat));


    }

    private void setLists() {
        sub_cat.clear();
        subCatModel =new SubCategoriesModel(R.drawable.men_tshirt,"Men's", "Rs. 0.00");
        sub_cat.add(subCatModel);
        subCatModel =new SubCategoriesModel(R.drawable.women_tshirt,"Women's", "Rs. 0.00");
        sub_cat.add(subCatModel);
        subCatModel =new SubCategoriesModel(R.drawable.boys_tshirt,"Boy", "Rs. 0.00");
        sub_cat.add(subCatModel);
        subCatModel =new SubCategoriesModel(R.drawable.girls_tshirt,"Girl", "Rs. 0.00");
        sub_cat.add(subCatModel);

    }
}
