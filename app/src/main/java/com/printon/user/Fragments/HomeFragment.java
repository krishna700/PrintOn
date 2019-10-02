package com.printon.user.Fragments;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.printon.user.Adapters.CategoriesRecyclerAdapter;
import com.printon.user.Models.CategoriesRecyclerModel;
import com.printon.user.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    RecyclerView categories_recycler_view;
    List<CategoriesRecyclerModel> categories=new ArrayList<>();
    CategoriesRecyclerModel model;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_home, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        categories_recycler_view=rootView.findViewById(R.id.categories_recycler);
        categories_recycler_view.setLayoutManager(new GridLayoutManager(getActivity(),2));
        categories.clear();
        model=new CategoriesRecyclerModel(R.drawable.photos,"Photos");
        categories.add(model);
        model=new CategoriesRecyclerModel(R.drawable.mugs,"Mugs");
        categories.add(model);
        model=new CategoriesRecyclerModel(R.drawable.key_chain,"Key Chains");
        categories.add(model);
        model=new CategoriesRecyclerModel(R.drawable.t_shirts,"T-shirts");
        categories.add(model);
        model=new CategoriesRecyclerModel(R.drawable.cushion,"Cushions");
        categories.add(model);
        model=new CategoriesRecyclerModel(R.drawable.bookings,"Bookings");
        categories.add(model);
        model=new CategoriesRecyclerModel(R.drawable.gifts,"Gifts");
        categories.add(model);
        categories_recycler_view.setAdapter(new CategoriesRecyclerAdapter(getActivity(),categories));


        return rootView;
    }

}
