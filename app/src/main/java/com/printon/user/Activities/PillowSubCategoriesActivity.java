package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.printon.user.Adapters.MugsSubCategoriesRecyclerAdapter;
import com.printon.user.Adapters.PillowsSubCategoriesRecyclerAdapter;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.ArrayList;
import java.util.List;

public class PillowSubCategoriesActivity extends AppCompatActivity {
    String cat_name="";
    RecyclerView sub_cat_recycler;
    ImageView logo;
    List<SubCategoriesModel> pillows_sub_cat =new ArrayList<>();
    SubCategoriesModel sub_cat_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pillow_sub_categories);
        cat_name= App.getSingleton().getCategory();
        sub_cat_recycler=findViewById(R.id.pillows_sub_cat_recycler);
        logo=findViewById(R.id.logo_pillow_sub_cat);
        sub_cat_recycler.setLayoutManager(new LinearLayoutManager(this));
        setLists();
        sub_cat_recycler.setAdapter(new PillowsSubCategoriesRecyclerAdapter(getApplicationContext(), pillows_sub_cat));


    }

    private void setLists() {
        pillows_sub_cat.clear();
        sub_cat_model =new SubCategoriesModel(R.drawable.square_shape_pillow,"Square Shape Pillow", "Rs. 0.00");
        pillows_sub_cat.add(sub_cat_model);
        sub_cat_model =new SubCategoriesModel(R.drawable.heart_shape_pillow,"Heart Shape Pillow", "Rs. 0.00");
        pillows_sub_cat.add(sub_cat_model);

    }

}
