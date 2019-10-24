package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.printon.user.Adapters.ShiftCatRecyclerAdapter;
import com.printon.user.Models.ShiftCatmodel;
import com.printon.user.R;
import com.printon.user.Util.App;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import github.ishaan.buttonprogressbar.ButtonProgressBar;

public class AddToCartActivity extends AppCompatActivity {
    TextView sub_cat;
    ImageView sub_cat_image,logo, add;



    String cat_name = "";
    LinearLayout layout_tshirt,layout_tshirt2;
    RelativeLayout layout_others;
    @BindView(R.id.add_to_cart)
    ButtonProgressBar addToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);
        ButterKnife.bind(this);
        getSupportActionBar().hide();
        logo=findViewById(R.id.logo_add_to_cart);
        sub_cat = findViewById(R.id.sub_cat_text);
        sub_cat_image = findViewById(R.id.sub_cat_image);
        add=findViewById(R.id.add_image_button);
        layout_tshirt=findViewById(R.id.layout_tshirt);
        layout_tshirt2=findViewById(R.id.layout_tshirt2);
        layout_others=findViewById(R.id.layout_others);

        sub_cat.setText(App.getSingleton().getSub_category());
        cat_name = App.getSingleton().getCategory();
        setImage();



        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddToCartActivity.this,MainActivity.class));
            }
        });

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToCart.startLoader();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        addToCart.stopLoader();
                        startActivity(new Intent(AddToCartActivity.this,CartActivity.class));
                    }
                }, 800);
            }
        });

    }

    private void setImage() {
        switch (sub_cat.getText().toString()) {

            case "Round Key Chain":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.round_kc);
                break;

            case "Square Key Chain":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.square_kc);
                break;

            case "Heart-Shaped Key Chain":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.heart_shaped_kc);
                break;

            case "Rectangle Key Chain":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.rectangle_kc);
                break;

            case "White Mug":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.white_empty_mug);
                break;

            case "Colour Mug":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.colour_empty_mug);
                break;

            case "Magic Mug":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.black_empty_mug);
                break;

            case "Square Shape Pillow":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.sqaure_shape_empty_pillow);
                break;

            case "Heart Shape Pillow":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.heart_shape_empty_pillow);
                break;

            case "Family Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.family_frame);
                break;

            case "Valentine Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.valentine_frame);
                break;

            case "I Love Dad Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.i_love_dad_frame);
                break;

            case "Love Forever Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.love_forever_frame);
                break;

            case "I Love Mom Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.i_love_mom_frame);
                break;

            case "Anniversary Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.anniversary_frame);
                break;

            case "Friends Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.friends_frame);
                break;


            case "Birthday Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.birthday_frame);
                break;


            case "My Family Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.my_family_frame);
                break;

            case "Best Friend Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.best_friend_frame);
                break;

            case "Memories Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.memories_frame);
                break;

            case "Sweet Home Frame":
                add.setVisibility(View.INVISIBLE);
                layout_others.setVisibility(View.VISIBLE);
                layout_tshirt.setVisibility(View.INVISIBLE);
                layout_tshirt2.setVisibility(View.GONE);
                sub_cat_image.setImageResource(R.drawable.sweet_home_frame);
                break;

            case "Men's":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.INVISIBLE);
                layout_tshirt.setVisibility(View.VISIBLE);
                layout_tshirt2.setVisibility(View.VISIBLE);
                sub_cat_image.setImageResource(R.drawable.white_empty_tshirt);
                break;

            case "Women's":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.INVISIBLE);
                layout_tshirt.setVisibility(View.VISIBLE);
                layout_tshirt2.setVisibility(View.VISIBLE);
                sub_cat_image.setImageResource(R.drawable.white_empty_tshirt);
                break;

            case "Boy":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.INVISIBLE);
                layout_tshirt.setVisibility(View.VISIBLE);
                layout_tshirt2.setVisibility(View.VISIBLE);
                sub_cat_image.setImageResource(R.drawable.white_empty_tshirt);
                break;

            case "Girl":
                add.setVisibility(View.VISIBLE);
                layout_others.setVisibility(View.INVISIBLE);
                layout_tshirt.setVisibility(View.VISIBLE);
                layout_tshirt2.setVisibility(View.VISIBLE);
                sub_cat_image.setImageResource(R.drawable.white_empty_tshirt);
                break;
        }
    }



}
