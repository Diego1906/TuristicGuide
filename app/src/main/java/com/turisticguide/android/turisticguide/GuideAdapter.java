package com.turisticguide.android.turisticguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GuideAdapter extends ArrayAdapter<Guide> {

    public GuideAdapter(Context context,  List<Guide> guides) {
        super(context, 0, guides);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View currentConvertView = convertView;

        if (currentConvertView == null) {
            currentConvertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Guide currentGuide = getItem(position);

        ImageView imageView = currentConvertView.findViewById(R.id.image_place);
        if (currentGuide.hasImagePlace()) {
            imageView.setImageResource(currentGuide.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView textViewNamePlace = currentConvertView.findViewById(R.id.text_view_name_place);
        if (currentGuide.hasNamePlace()) {
            textViewNamePlace.setText(currentGuide.getNamePlace());
            textViewNamePlace.setVisibility(View.VISIBLE);
        } else {
            textViewNamePlace.setVisibility(View.GONE);
        }

        TextView textViewDescriptionPlace = currentConvertView.findViewById(R.id.text_view_description_place);
        textViewDescriptionPlace.setText(currentGuide.getDescriptionPlace());

        return currentConvertView;
    }
}
