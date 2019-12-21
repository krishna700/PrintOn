package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.printon.user.Adapters.MugsSubCategoriesRecyclerAdapter;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.ArrayList;
import java.util.List;

public class MugsSubCategoriesActivity extends AppCompatActivity {
    String cat_name="";
    RecyclerView sub_cat_recycler;
    List<SubCategoriesModel> mugs_sub_cat =new ArrayList<>();
    SubCategoriesModel sub_cat_model;
    ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugs_sub_categories);
        getSupportActionBar().hide();
        cat_name=App.getSingleton().getCategory();
        sub_cat_recycler=findViewById(R.id.mugs_sub_cat_recycler);

        logo=findViewById(R.id.logo_mugs_sub_cat);
        sub_cat_recycler.setLayoutManager(new LinearLayoutManager(this));
        setLists();
        sub_cat_recycler.setAdapter(new MugsSubCategoriesRecyclerAdapter(getApplicationContext(), mugs_sub_cat));

    }

    private void setLists() {
        mugs_sub_cat.clear();
        sub_cat_model =new SubCategoriesModel(R.drawable.white_mug,"White Mug", "Rs. 0.00");
        mugs_sub_cat.add(sub_cat_model);
        sub_cat_model =new SubCategoriesModel(R.drawable.colour_mug,"Colour Mug", "Rs. 0.00");
        mugs_sub_cat.add(sub_cat_model);
        sub_cat_model =new SubCategoriesModel(R.drawable.magic_mug,"Magic Mug", "Rs. 0.00");
        mugs_sub_cat.add(sub_cat_model);

    }


}
