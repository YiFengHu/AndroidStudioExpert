/*******************************************************************
 * Copyright  (C) Newegg Corporation. All rights reserved.
 * <p/>
 * Author: Roder.Y.Hu (Roder.Y.Hu@newegg.com)
 * Create Date: 2015/12/2
 * Usage:
 * <p/>
 * RevisionHistory
 * Date    		Author    Description
 ********************************************************************/
package com.example.androidstudioexpert;

import android.util.Log;

@SuppressWarnings("SSBasedInspection")
public class CustomLogger {
    private static boolean isLogEnable = true;

    public static void init(boolean enable){
        isLogEnable = enable;
    }


    public static void i(String tag, String str) {
        if (isLogEnable) {
            Log.i(tag, str);
        }
    }

    public static void d(String tag, String str) {
        if (isLogEnable) {
            Log.d(tag, str);
        }
    }

    public static void v(String tag, String str) {
        if (isLogEnable) {
            Log.v(tag, str);
        }
    }

    public static void w(String tag, String str) {
        if (isLogEnable) {
            Log.w(tag, str);
        }
    }

    public static void e(String tag, String str) {
        if (isLogEnable) {
            Log.e(tag, str);
        }
    }
}
