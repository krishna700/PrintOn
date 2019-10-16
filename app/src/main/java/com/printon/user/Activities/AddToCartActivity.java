package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.printon.user.Adapters.ShiftCatRecyclerAdapter;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.ArrayList;
import java.util.List;

public class AddToCartActivity extends AppCompatActivity {
    TextView sub_cat;
    ImageView sub_cat_image,logo;
    RecyclerView shift_cat_recycler;
    ShiftCatmodel shift_cat_model;
    List<ShiftCatmodel> shift_cat = new ArrayList<>();
    String cat_name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);
        getSupportActionBar().hide();
        logo=findViewById(R.id.logo_add_to_cart);
        sub_cat = findViewById(R.id.sub_cat_text);
        sub_cat_image = findViewById(R.id.sub_cat_image);
        shift_cat_recycler = findViewById(R.id.add_to_cart_shift_cat_recycler);
        sub_cat.setText(App.getSingleton().getSub_category());
        cat_name = App.getSingleton().getCategory();
        setImage();
        shift_cat_recycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        setList();
        shift_cat_recycler.setAdapter(new ShiftCatRecyclerAdapter(this, shift_cat));
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddToCartActivity.this,MainActivity.class));
            }
        });

    }

    private void setImage() {
        switch (sub_cat.getText().toString()) {

            case "Round Key Chain":
                sub_cat_image.setImageResource(R.drawable.round_kc);
                break;

            case "Square Key Chain":
                sub_cat_image.setImageResource(R.drawable.square_kc);
                break;

            case "Heart-Shaped Key Chain":
                sub_cat_image.setImageResource(R.drawable.heart_shaped_kc);
                break;

            case "Rectangle Key Chain":
                sub_cat_image.setImageResource(R.drawable.rectangle_kc);
                break;

            case "White Mug":
                sub_cat_image.setImageResource(R.drawable.white_empty_mug);
                break;

            case "Colour Mug":
                sub_cat_image.setImageResource(R.drawable.colour_empty_mug);
                break;

            case "Magic Mug":
                sub_cat_image.setImageResource(R.drawable.black_empty_mug);
                break;

            case "Square Shape Pillow":
                sub_cat_image.setImageResource(R.drawable.sqaure_shape_empty_pillow);
                break;

            case "Heart Shape Pillow":
                sub_cat_image.setImageResource(R.drawable.heart_shape_empty_pillow);
                break;
        }
    }

    private void setList() {
        switch (cat_name) {

            case "Photos":

                shift_cat.clear();
                shift_cat_model = new ShiftCatmodel(R.drawable.mug_circle, "Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.keychain_circle, "Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.tshirt_circle, "T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.cushion, "Cushions");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.gift_circle, "Gifts");
                shift_cat.add(shift_cat_model);

                break;

            case "Mugs":

                shift_cat.clear();
                shift_cat_model = new ShiftCatmodel(R.drawable.photo_circle, "Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.keychain_circle, "Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.tshirt_circle, "T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.cushion, "Cushions");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.gift_circle, "Gifts");
                shift_cat.add(shift_cat_model);

                break;

            case "Key Chains":

                shift_cat.clear();
                shift_cat_model = new ShiftCatmodel(R.drawable.photo_circle, "Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.mug_circle, "Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.tshirt_circle, "T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.cushion, "Cushions");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.gift_circle, "Gifts");
                shift_cat.add(shift_cat_model);

                break;

            case "T-shirts":

                shift_cat.clear();
                shift_cat_model = new ShiftCatmodel(R.drawable.photo_circle, "Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.mug_circle, "Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.keychain_circle, "Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.cushion, "Cushions");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.gift_circle, "Gifts");
                shift_cat.add(shift_cat_model);
                break;

            case "Cushions":

                shift_cat.clear();
                shift_cat_model = new ShiftCatmodel(R.drawable.photo_circle, "Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.mug_circle, "Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.keychain_circle, "Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.tshirt_circle, "T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.gift_circle, "Gifts");
                shift_cat.add(shift_cat_model);

                break;

            case "Gifts":

                shift_cat.clear();
                shift_cat_model = new ShiftCatmodel(R.drawable.photo_circle, "Photos");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.mug_circle, "Mugs");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.keychain_circle, "Key Chains");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.tshirt_circle, "T-shirts");
                shift_cat.add(shift_cat_model);
                shift_cat_model = new ShiftCatmodel(R.drawable.cushion, "Cushions");
                shift_cat.add(shift_cat_model);


                break;

            case "Bookings":
                shift_cat.clear();
                break;
        }
    }
}
