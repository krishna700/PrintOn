package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.printon.user.Adapters.KCSubCatRecyclerAdapter;
import com.printon.user.Adapters.ShiftCatRecyclerAdapter;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;

import java.util.ArrayList;
import java.util.List;

public class KeyChainSubCategoriesActivity extends AppCompatActivity {
    RecyclerView kc_sub_cat_recycler;
    List<SubCategoriesModel> sub_cat=new ArrayList<>();
    SubCategoriesModel subCatModel;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_chain_sub_categories);
        getSupportActionBar().hide();
        logo=findViewById(R.id.logo_sub_cat_kc);
        kc_sub_cat_recycler =findViewById(R.id.kc_sub_cat_recycler);
        kc_sub_cat_recycler.setLayoutManager(new GridLayoutManager(this,2));
        setLists();
        kc_sub_cat_recycler.setAdapter(new KCSubCatRecyclerAdapter(this,sub_cat));

    }

    private void setLists() {
        sub_cat.clear();
        subCatModel =new SubCategoriesModel(R.drawable.round_kc,"Round", "Rs. 0.00");
        sub_cat.add(subCatModel);
        subCatModel =new SubCategoriesModel(R.drawable.square_kc,"Square", "Rs. 0.00");
        sub_cat.add(subCatModel);
        subCatModel =new SubCategoriesModel(R.drawable.heart_shaped_kc,"Heart-Shaped", "Rs. 0.00");
        sub_cat.add(subCatModel);
        subCatModel =new SubCategoriesModel(R.drawable.rectangle_kc,"Rectangle", "Rs. 0.00");
        sub_cat.add(subCatModel);

    }
}
