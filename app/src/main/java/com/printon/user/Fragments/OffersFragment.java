package com.printon.user.Fragments;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.printon.user.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OffersFragment extends Fragment {


    public OffersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_offers, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return rootView;
    }

}