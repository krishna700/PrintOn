package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.printon.user.Adapters.CurrentOrdersRecyclerAdapter;
import com.printon.user.R;

public class CurrentOrdersActivity extends AppCompatActivity {

    RecyclerView current_orders_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_orders);
        getSupportActionBar().hide();
        current_orders_recycler=findViewById(R.id.current_orders_recycler);
        current_orders_recycler.setLayoutManager(new LinearLayoutManager(this));
        current_orders_recycler.setAdapter(new CurrentOrdersRecyclerAdapter(this));

    }
}
