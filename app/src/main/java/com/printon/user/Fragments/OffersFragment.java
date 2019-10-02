package com.printon.user.Fragments;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.printon.user.Adapters.OffersRecyclerAdapter;
import com.printon.user.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OffersFragment extends Fragment {

    RecyclerView offers_recycler_view;

    public OffersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_offers, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        offers_recycler_view=rootView.findViewById(R.id.offers_recycler_view);
        offers_recycler_view.setLayoutManager(new LinearLayoutManager(getActivity()));
        offers_recycler_view.setAdapter(new OffersRecyclerAdapter(getActivity()));

        return rootView;
    }

}
