package com.printon.user.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.printon.user.Activities.CurrentOrdersActivity;
import com.printon.user.Activities.PastOrdersActivity;
import com.printon.user.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SupportFragment extends Fragment {

    RelativeLayout current_orders,past_orders;


    public SupportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_support, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        current_orders=rootView.findViewById(R.id.current_orders);
        past_orders=rootView.findViewById(R.id.past_orders);

        current_orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CurrentOrdersActivity.class));
            }
        });

        past_orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PastOrdersActivity.class));
            }
        });


        return rootView;
    }

}
