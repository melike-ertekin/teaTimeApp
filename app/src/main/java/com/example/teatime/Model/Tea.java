package com.example.teatime.Model;

/**
 * {@link Tea} represents a tea that the user can select from the menu.
 * It contains a tea name and an associated.
 */

public class Tea {

    private String mTeaName;
    private int mImageResourceId;

    public Tea(String teaName, int imageResourceId) {
        mTeaName = teaName;
        mImageResourceId = imageResourceId;
    }

    public String getTeaName() {
        return mTeaName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
