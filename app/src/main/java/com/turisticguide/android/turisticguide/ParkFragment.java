package com.turisticguide.android.turisticguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ParkFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<Guide> listPark = new ArrayList<Guide>();
        listPark.add(new Guide(getString(R.string.parque_ibirapuera), getString(R.string.description_parque_ibirapuera)));
        listPark.add(new Guide(getString(R.string.parque_estadual_da_cantareira), getString(R.string.description_parque_estadual_da_cantareira)));
        listPark.add(new Guide(getString(R.string.parque_estadual_serra_do_mar), getString(R.string.description_parque_estadual_serra_do_mar)));
        listPark.add(new Guide(getString(R.string.parque_estadual_villa_lobos), getString(R.string.description_parque_estadual_villa_lobos)));
        listPark.add(new Guide(getString(R.string.thermas_dos_laranjais), getString(R.string.description_thermas_dos_laranjais)));
        listPark.add(new Guide(getString(R.string.hopi_hari), getString(R.string.description_hopi_hari)));

        LayoutInflaterFragmentHelper layoutInflaterFragmentHelper =
                new LayoutInflaterFragmentHelper(getActivity(), inflater, container, listPark);

        return layoutInflaterFragmentHelper.inflate();
    }
}


