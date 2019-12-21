package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.printon.user.Fragments.AddressDetailsFragment;
import com.printon.user.Fragments.PersonalDetailsFragment;
import com.printon.user.R;

public class AddDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    FrameLayout details_frame;
    RelativeLayout address_tab,personal_tab;
    TextView personal,address;
    View view_p,view_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);
        initIds();
        setOnClickListenrs();
        address.setTextColor(Color.parseColor("#525151"));
        personal.setTextColor(Color.parseColor("#FF5722"));
        view_a.setBackgroundColor(Color.parseColor("#525151"));
        view_p.setBackgroundColor(Color.parseColor("#FF5722"));
        SelectFragment(new PersonalDetailsFragment());
    }

    private void initIds() {
        details_frame=findViewById(R.id.add_details_tab);
        address_tab=findViewById(R.id.address_tab);
        personal_tab=findViewById(R.id.personal_tab);
        address=findViewById(R.id.address_tab_text);
        personal=findViewById(R.id.personal_tab_text);
        view_p=findViewById(R.id.personal_tab_view);
        view_a=findViewById(R.id.address_tab_view);


    }

    private void setOnClickListenrs() {
        address_tab.setOnClickListener(this);
        personal_tab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.address_tab:
                address.setTextColor(Color.parseColor("#FF5722"));
                personal.setTextColor(Color.parseColor("#525151"));
                view_a.setBackgroundColor(Color.parseColor("#FF5722"));
                view_p.setBackgroundColor(Color.parseColor("#525151"));
                SelectFragment(new AddressDetailsFragment());
                break;

            case R.id.personal_tab:
                address.setTextColor(Color.parseColor("#525151"));
                personal.setTextColor(Color.parseColor("#FF5722"));
                view_a.setBackgroundColor(Color.parseColor("#525151"));
                view_p.setBackgroundColor(Color.parseColor("#FF5722"));
                SelectFragment(new PersonalDetailsFragment());
                break;


        }

    }

    private void SelectFragment(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.add_details_tab,fragment);
        transaction.commit();

    }
}
