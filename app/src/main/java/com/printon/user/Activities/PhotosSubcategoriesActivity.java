package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.printon.user.Adapters.FramesRecyclerAdapter;
import com.printon.user.R;

import java.util.ArrayList;
import java.util.List;

public class PhotosSubcategoriesActivity extends AppCompatActivity implements View.OnClickListener {
    RelativeLayout without_frame, with_frame, laminated;
    TextView without_frame_text, with_frame_text, laminated_text;
    RecyclerView frames_recycler;
    LinearLayout for_frames;
    ImageView logo;
    List<Integer> Frame=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos_subcategories);
        getSupportActionBar().hide();
        logo=findViewById(R.id.logo_sub_cat_photos);
        with_frame=findViewById(R.id.with_frame_layout);
        for_frames =findViewById(R.id.for_with_frame);
        with_frame_text=findViewById(R.id.with_frame_text);
        without_frame=findViewById(R.id.without_frame_layout);
        without_frame_text=findViewById(R.id.without_frame_text);
        laminated=findViewById(R.id.laminate_layout);
        laminated_text=findViewById(R.id.laminate_text);
        without_frame.setBackgroundResource(R.drawable.layout_background_dark);
        without_frame_text.setTextColor(Color.WHITE);
        with_frame.setBackgroundResource(R.drawable.layout_background_light);
        with_frame_text.setTextColor(Color.parseColor("#4e4e50"));
        laminated.setBackgroundResource(R.drawable.layout_background_light);
        laminated_text.setTextColor(Color.parseColor("#4e4e50"));
        for_frames.setVisibility(View.GONE);
        frames_recycler=findViewById(R.id.frames_recycler);
        setOnClicks();
        frames_recycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        Frame.add(R.drawable.frame1);
        Frame.add(R.drawable.frame2);
        Frame.add(R.drawable.frame3);
        Frame.add(R.drawable.frame4);
        Frame.add(R.drawable.frame5);
        Frame.add(R.drawable.frame6);
        Frame.add(R.drawable.frame7);
        Frame.add(R.drawable.frame8);
        frames_recycler.setAdapter(new FramesRecyclerAdapter(this, Frame));



    }

    private void setOnClicks() {
        without_frame.setOnClickListener(this);
        with_frame.setOnClickListener(this);
        laminated.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.without_frame_layout:
                without_frame.setBackgroundResource(R.drawable.layout_background_dark);
                without_frame_text.setTextColor(Color.WHITE);
                with_frame.setBackgroundResource(R.drawable.layout_background_light);
                with_frame_text.setTextColor(Color.parseColor("#4e4e50"));
                laminated.setBackgroundResource(R.drawable.layout_background_light);
                laminated_text.setTextColor(Color.parseColor("#4e4e50"));
                for_frames.setVisibility(View.GONE);
                break;

            case R.id.with_frame_layout:
                without_frame.setBackgroundResource(R.drawable.layout_background_light);
                without_frame_text.setTextColor(Color.parseColor("#4e4e50"));
                with_frame.setBackgroundResource(R.drawable.layout_background_dark);
                with_frame_text.setTextColor(Color.WHITE);
                laminated.setBackgroundResource(R.drawable.layout_background_light);
                laminated_text.setTextColor(Color.parseColor("#4e4e50"));
                for_frames.setVisibility(View.VISIBLE);
                break;

            case R.id.laminate_layout:
                without_frame.setBackgroundResource(R.drawable.layout_background_light);
                without_frame_text.setTextColor(Color.parseColor("#4e4e50"));
                with_frame.setBackgroundResource(R.drawable.layout_background_light);
                with_frame_text.setTextColor(Color.parseColor("#4e4e50"));
                laminated.setBackgroundResource(R.drawable.layout_background_dark);
                laminated_text.setTextColor(Color.WHITE);
                for_frames.setVisibility(View.GONE);
                break;


        }

    }
}
