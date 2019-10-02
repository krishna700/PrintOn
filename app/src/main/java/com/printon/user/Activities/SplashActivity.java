package com.printon.user.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.printon.user.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashactivity);
        getSupportActionBar().hide();
        final int splash_length = 1000;
        new Handler().postDelayed(
                new Runnable() {

                    @Override
                    public void run() {

                        startActivity(new Intent(SplashActivity.this,MainActivity.class));


                    }


                }, splash_length);


    }
}
