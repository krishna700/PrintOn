package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.printon.user.Adapters.GiftsSubCategoriesRecyclerAdapter;
import com.printon.user.Adapters.PillowsSubCategoriesRecyclerAdapter;
import com.printon.user.Adapters.ShiftCatRecyclerAdapter;
import com.printon.user.Models.GiftsSubRecyclerModel;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.ArrayList;
import java.util.List;

public class GiftsSubCategoriesActivity extends AppCompatActivity {
    String cat_name="";
    RecyclerView sub_cat_recycler,shift_cat_recycler;
    ImageView logo;
    List<GiftsSubRecyclerModel> gifts_sub_cat =new ArrayList<>();
    GiftsSubRecyclerModel sub_cat_model;
    List<ShiftCatmodel> gifts_shift_cat =new ArrayList<>();
    ShiftCatmodel shift_cat_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_gifts_sub_categories);
        cat_name= App.getSingleton().getCategory();
        sub_cat_recycler=findViewById(R.id.gifts_sub_cat_recycler);
        shift_cat_recycler=findViewById(R.id.gifts_shift_cat_recycler);
        logo=findViewById(R.id.logo_gifts_sub_cat);
        sub_cat_recycler.setLayoutManager(new LinearLayoutManager(this));
        shift_cat_recycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        setLists();
        sub_cat_recycler.setAdapter(new GiftsSubCategoriesRecyclerAdapter(getApplicationContext(), gifts_sub_cat));
        shift_cat_recycler.setAdapter(new ShiftCatRecyclerAdapter(getApplicationContext(), gifts_shift_cat));
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GiftsSubCategoriesActivity.this,MainActivity.class));
            }
        });

    }

    private void setLists() {
        gifts_sub_cat.clear();
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.family_frame,"Family Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.valentine_frame,"Valentine Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.i_love_dad_frame,"I Love Dad Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.love_forever_frame,"Love Forever Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.i_love_mom_frame,"I Love Mom Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.anniversary_frame,"Anniversary Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.friends_frame,"Friends Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.birthday_frame,"Birthday Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.my_family_frame,"My Family Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.best_friend_frame,"Best Friend Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.memories_frame,"Memories Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);
        sub_cat_model =new GiftsSubRecyclerModel(R.drawable.sweet_home_frame,"Sweet Home Frame", "Rs. 0.00", "3");
        gifts_sub_cat.add(sub_cat_model);

        gifts_shift_cat.clear();
        shift_cat_model=new ShiftCatmodel(R.drawable.photo_circle,"Photos");
        gifts_shift_cat.add(shift_cat_model);
        shift_cat_model=new ShiftCatmodel(R.drawable.mug_circle,"Mugs");
        gifts_shift_cat.add(shift_cat_model);
        shift_cat_model=new ShiftCatmodel(R.drawable.keychain_circle,"Key Chains");
        gifts_shift_cat.add(shift_cat_model);
        shift_cat_model=new ShiftCatmodel(R.drawable.tshirt_circle,"T-shirts");
        gifts_shift_cat.add(shift_cat_model);
        shift_cat_model=new ShiftCatmodel(R.drawable.cushion,"Cushions");
        gifts_shift_cat.add(shift_cat_model);


    }

}
