package com.turisticguide.android.turisticguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

public class LayoutInflaterFragmentHelper {

    private LayoutInflater mInflater;
    private ViewGroup mContainer;
    private List<Guide> mListGuide;
    private Context mContext;

    public LayoutInflaterFragmentHelper(Context mContext, LayoutInflater mInflater, ViewGroup mContainer, List<Guide> mListGuide) {
        this.mContext = mContext;
        this.mInflater = mInflater;
        this.mContainer = mContainer;
        this.mListGuide = mListGuide;
    }

    public View inflate() {
        View rootView = mInflater.inflate(R.layout.guide_list, mContainer, false);

        GuideAdapter adapter = new GuideAdapter(mContext, mListGuide);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
