package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.printon.user.Adapters.ShiftCatRecyclerAdapter;
import com.printon.user.Adapters.SubCategoriesRecyclerAdapter;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.Models.SubCategoriesModel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.ArrayList;
import java.util.List;

public class SubCategoriesActivity extends AppCompatActivity {
    String cat_name="";
    RecyclerView sub_cat_recycler,shift_cat_recycler;
    List<SubCategoriesModel> sub_cat=new ArrayList<>();
    SubCategoriesModel sub_cat_model;
    List<ShiftCatmodel>  shift_cat=new ArrayList<>();
    ShiftCatmodel shift_cat_model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_categories);
        getSupportActionBar().hide();
        cat_name=App.getSingleton().getCategory();
        sub_cat_recycler=findViewById(R.id.sub_cat_recycler);
        shift_cat_recycler=findViewById(R.id.shift_cat_recycler);
        sub_cat_recycler.setLayoutManager(new LinearLayoutManager(this));
        shift_cat_recycler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        setLists();
        sub_cat_recycler.setAdapter(new SubCategoriesRecyclerAdapter(getApplicationContext(),sub_cat));
        shift_cat_recycler.setAdapter(new ShiftCatRecyclerAdapter(getApplicationContext(), shift_cat, new ShiftCatRecyclerAdapter.OnClick() {
            @Override
            public void shift() {
                Intent intent=getIntent();
                finish();
                startActivity(intent);
            }
        }));


    }

    private void setLists() {
        switch (cat_name){

            case "Photos":
                sub_cat.clear();
                sub_cat_model =new SubCategoriesModel(R.drawable.photos,"Polaroid 1", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.photos,"Polaroid 2", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.photos,"Polaroid 3", "Rs. 0.00");
                sub_cat.add(sub_cat_model);

                shift_cat.clear();
                shift_cat_model=new ShiftCatmodel(R.drawable.mug_circle,"Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.keychain_circle,"Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.tshirt_circle,"T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.cushion,"Cushions");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.gift_circle,"Gifts");
                shift_cat.add(shift_cat_model);

                break;

            case "Mugs":
                sub_cat.clear();
                sub_cat_model =new SubCategoriesModel(R.drawable.mugs,"White Mug", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.mugs,"Black Mug", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.mugs,"Magic Mug", "Rs. 0.00");
                sub_cat.add(sub_cat_model);

                shift_cat.clear();
                shift_cat_model=new ShiftCatmodel(R.drawable.photo_circle,"Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.keychain_circle,"Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.tshirt_circle,"T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.cushion,"Cushions");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.gift_circle,"Gifts");
                shift_cat.add(shift_cat_model);

                break;

            case "Key Chains":
                sub_cat.clear();
                sub_cat_model =new SubCategoriesModel(R.drawable.key_chain,"Key Chains 1", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.key_chain,"Key Chains 2", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.key_chain,"Key Chains 3", "Rs. 0.00");
                sub_cat.add(sub_cat_model);

                shift_cat.clear();
                shift_cat_model=new ShiftCatmodel(R.drawable.photo_circle,"Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.mug_circle,"Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.tshirt_circle,"T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.cushion,"Cushions");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.gift_circle,"Gifts");
                shift_cat.add(shift_cat_model);

                break;

            case "T-shirts":
                sub_cat.clear();
                sub_cat_model =new SubCategoriesModel(R.drawable.t_shirt_sub,"Men's", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.t_shirt_sub,"Women's", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.t_shirt_sub,"Kid's", "Rs. 0.00");
                sub_cat.add(sub_cat_model);

                shift_cat.clear();
                shift_cat_model=new ShiftCatmodel(R.drawable.photo_circle,"Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.mug_circle,"Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.keychain_circle,"Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.cushion,"Cushions");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.gift_circle,"Gifts");
                shift_cat.add(shift_cat_model);
                break;

            case "Cushions":
                sub_cat.clear();
                sub_cat_model =new SubCategoriesModel(R.drawable.cushion,"cushion 1", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.cushion,"cushion 2", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.cushion,"cushion 3", "Rs. 0.00");
                sub_cat.add(sub_cat_model);

                shift_cat.clear();
                shift_cat_model=new ShiftCatmodel(R.drawable.photo_circle,"Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.mug_circle,"Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.keychain_circle,"Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.tshirt_circle,"T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.gift_circle,"Gifts");
                shift_cat.add(shift_cat_model);

                break;

            case "Gifts":
                sub_cat.clear();
                sub_cat_model =new SubCategoriesModel(R.drawable.gifts,"gift 1", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.gifts,"gift 2", "Rs. 0.00");
                sub_cat.add(sub_cat_model);
                sub_cat_model =new SubCategoriesModel(R.drawable.gifts,"gift 3", "Rs. 0.00");
                sub_cat.add(sub_cat_model);

                shift_cat.clear();
                shift_cat_model=new ShiftCatmodel(R.drawable.photo_circle,"Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.mug_circle,"Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.keychain_circle,"Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.tshirt_circle,"T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model=new ShiftCatmodel(R.drawable.cushion,"Cushions");
                shift_cat.add(shift_cat_model);


                break;

            case "Bookings":
                sub_cat.clear();
                shift_cat.clear();
                break;
        }
    }
}
