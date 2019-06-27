package com.turisticguide.android.turisticguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
