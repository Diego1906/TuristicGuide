package com.turisticguide.android.turisticguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TheaterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<Guide> listTheater = new ArrayList<Guide>();
        listTheater.add(new Guide(getString(R.string.theatro_municipal_de_sao_paulo), getString(R.string.description_theatro_municipal_de_sao_paulo)));
        listTheater.add(new Guide(getString(R.string.teatro_commune), getString(R.string.description_teatro_commune)));
        listTheater.add(new Guide(getString(R.string.teatro_shopping_frei_caneca), getString(R.string.description_teatro_shopping_frei_caneca)));
        listTheater.add(new Guide(getString(R.string.teatro_joao_caetano), getString(R.string.description_teatro_joao_caetano)));
        listTheater.add(new Guide(getString(R.string.teatro_renault), getString(R.string.description_teatro_renault)));

        LayoutInflaterFragmentHelper layoutInflaterFragmentHelper =
                new LayoutInflaterFragmentHelper(getActivity(), inflater, container, listTheater);

        return layoutInflaterFragmentHelper.inflate();
    }
}
