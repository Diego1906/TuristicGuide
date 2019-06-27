package com.turisticguide.android.turisticguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == Position.zero.value) {
            return new RestaurantFragment();
        } else if (position == Position.one.value) {
            return new BarFragment();
        } else if (position == Position.two.value) {
            return new ParkFragment();
        } else {
            return new TheaterFragment();
        }
    }

    @Override
    public int getCount() {
        return Position.four.value;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == Position.zero.value) {
            return mContext.getString(R.string.restaurant);
        } else if (position == Position.one.value) {
            return mContext.getString(R.string.bar);
        } else if (position == Position.two.value) {
            return mContext.getString(R.string.park);
        } else {
            return mContext.getString(R.string.theater);
        }
    }

    private enum Position {
        zero(0),
        one(1),
        two(2),
        three(3),
        four(4);

        private int value;

        Position(int value) {
            this.value = value;
        }
    }
}
