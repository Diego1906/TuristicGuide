package com.turisticguide.android.turisticguide;

public class Guide {

    private final int NO_IMAGE_PROVIDED = -1;
    private final String NO_NAME_PROVIDED = null;

    private String mDescriptionPlace;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mNamePlace = NO_NAME_PROVIDED;

    public Guide(String namePlace, String descriptionPlace) {
        this.mNamePlace = namePlace;
        this.mDescriptionPlace = descriptionPlace;
    }

    public Guide(int imageResourceId, String descriptionPlace) {
        this.mImageResourceId = imageResourceId;
        this.mDescriptionPlace = descriptionPlace;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getNamePlace() {
        return mNamePlace;
    }

    public String getDescriptionPlace() {
        return mDescriptionPlace;
    }

    public boolean hasImagePlace() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasNamePlace() {
        return mNamePlace != NO_NAME_PROVIDED;
    }
}