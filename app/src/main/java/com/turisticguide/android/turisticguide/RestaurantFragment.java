package com.turisticguide.android.turisticguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<Guide> listRestaurant = new ArrayList<Guide>();
        listRestaurant.add(new Guide(R.drawable.ic_china_in_box, getString(R.string.description_china_in_box)));
        listRestaurant.add(new Guide(R.drawable.ic_taco_bell, getString(R.string.description_taco_bell)));
        listRestaurant.add(new Guide(R.drawable.ic_kfc, getString(R.string.description_kfc)));
        listRestaurant.add(new Guide(R.drawable.ic_pizza_hut, getString(R.string.description_pizza_hut)));
        listRestaurant.add(new Guide(R.drawable.ic_mcdonalds, getString(R.string.description_mcdonalds)));

        LayoutInflaterFragmentHelper layoutInflaterFragmentHelper =
                new LayoutInflaterFragmentHelper(getActivity(), inflater, container, listRestaurant);

        return layoutInflaterFragmentHelper.inflate();
    }
}
