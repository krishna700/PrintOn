package com.printon.user.Activities;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.printon.user.Fragments.HomeFragment;
import com.printon.user.Fragments.OffersFragment;
import com.printon.user.Fragments.SupportFragment;
import com.printon.user.Fragments.UserFragment;
import com.printon.user.R;
import com.printon.user.viewmodel.BottomBarAdapter;
import com.printon.user.viewmodel.NoSwipePager;

//  Git test

public class MainActivity extends AppCompatActivity {

    private NoSwipePager viewPager;
    private AHBottomNavigation bottomNavigation;
    private BottomBarAdapter pagerAdapter;
    private FragmentManager fm = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation =  findViewById(R.id.bottom_navigation_main);
        setupViewPager();
        addBottomNavigationItems();
        fm = getSupportFragmentManager();
        bottomNavigation.setTranslucentNavigationEnabled(false);
        bottomNavigation.setDefaultBackgroundColor(Color.WHITE);
        bottomNavigation.setAccentColor(fetchColor(R.color.colorPrimary));
        bottomNavigation.setInactiveColor(fetchColor(R.color.white));

        // Colors for selected (active) and non-selected items.
        bottomNavigation.setColoredModeColors(fetchColor(R.color.colorPrimary),
                fetchColor(R.color.textblack));

        //  Enables Reveal effect
        bottomNavigation.setColored(true);

        //  Displays item Title always (for selected and non-selected items)
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);


        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
//                fragment.updateColor(ContextCompat.getColor(MainActivity.this, colors[position]));

                if (!wasSelected)
                    viewPager.setCurrentItem(position);

                return true;
            }
        });










    }
    private int fetchColor(@ColorRes int color) {
        return ContextCompat.getColor(this, color);
    }
    private void addBottomNavigationItems() {
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.tab_1, R.drawable.order, R.color.white);
        AHBottomNavigationItem item2=new AHBottomNavigationItem(R.string.tab_2,R.drawable.offers,R.color.white);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.tab_3, R.drawable.support, R.color.white);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem(R.string.tab_4, R.drawable.user, R.color.white);

        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);
        bottomNavigation.addItem(item4);
    }

    private void setupViewPager() {
        viewPager = findViewById(R.id.viewpager);
        viewPager.setPagingEnabled(false);
        pagerAdapter = new BottomBarAdapter(getSupportFragmentManager());

        pagerAdapter.addFragments(new HomeFragment());
        pagerAdapter.addFragments(new OffersFragment());
        pagerAdapter.addFragments(new SupportFragment());
        pagerAdapter.addFragments(new UserFragment());

        viewPager.setAdapter(pagerAdapter);
    }



}
