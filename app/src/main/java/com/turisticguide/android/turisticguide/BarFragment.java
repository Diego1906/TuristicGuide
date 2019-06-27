package com.turisticguide.android.turisticguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class BarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<Guide> listBar = new ArrayList<Guide>();
        listBar.add(new Guide(getString(R.string.trabuca), getString(R.string.description_trabuca)));
        listBar.add(new Guide(getString(R.string.bar_de_cima), getString(R.string.description_bar_de_cima)));
        listBar.add(new Guide(getString(R.string.biri_nait), getString(R.string.description_biri_nait)));
        listBar.add(new Guide(getString(R.string.vila_567), getString(R.string.description_vila_567)));
        listBar.add(new Guide(getString(R.string.vila_seu_justino), getString(R.string.description_vila_seu_justino)));

        LayoutInflaterFragmentHelper layoutInflaterFragmentHelper =
                new LayoutInflaterFragmentHelper(getActivity(), inflater, container, listBar);

        return layoutInflaterFragmentHelper.inflate();
    }
}
