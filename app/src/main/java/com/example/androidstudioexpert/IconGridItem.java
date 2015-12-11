/*******************************************************************
 * Copyright  (C) Newegg Corporation. All rights reserved.
 * <p/>
 * Author: Roder.Y.Hu (Roder.Y.Hu@newegg.com)
 * Create Date: 2015/12/11
 * Usage:
 * <p/>
 * RevisionHistory
 * Date    		Author    Description
 ********************************************************************/
package com.example.androidstudioexpert;

import android.graphics.Bitmap;

public class IconGridItem {

    private int imgRes;
    private Bitmap bitmap;

    public IconGridItem(int imgRes) {
        this.imgRes = imgRes;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
