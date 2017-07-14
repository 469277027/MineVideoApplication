package com.lc.mytoolslibrary.widgets;

import android.content.Context;

/**
 * Created by congl on 2017/4/11.
 */

public class Toast {

    private static Context context;
    private static android.widget.Toast toast;

    public static void init(Context context) {
        Toast.context = context;
    }

    public static void makeText(String message, int duration) {
        showToast(message, duration);
    }

    public static void makeShortText(String message) {
        showToast(message, android.widget.Toast.LENGTH_SHORT);
    }

    public static void makeShortText(int resId) {
        showToast(context.getString(resId), android.widget.Toast.LENGTH_SHORT);
    }

    public static void makeLongText(String message) {
        showToast(message, android.widget.Toast.LENGTH_LONG);
    }

    public static void makeLongText(int resId) {
        showToast(context.getString(resId), android.widget.Toast.LENGTH_LONG);
    }

    private static void showToast(String message, int duration) {
        if (toast == null) {
            toast = android.widget.Toast.makeText(context, message, duration);
        } else {
            toast.setText(message);
            toast.setDuration(duration);
        }
        toast.show();
    }

}
