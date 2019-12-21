package com.printon.user.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.printon.user.Adapters.PastOrdersRecyclerAdapter;
import com.printon.user.R;

public class PastOrdersActivity extends AppCompatActivity {

    RecyclerView past_orders_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_orders);
        getSupportActionBar().hide();
        past_orders_recycler=findViewById(R.id.past_orders_recycler);
        past_orders_recycler.setLayoutManager(new LinearLayoutManager(this));
        past_orders_recycler.setAdapter(new PastOrdersRecyclerAdapter(this));

    }
}
