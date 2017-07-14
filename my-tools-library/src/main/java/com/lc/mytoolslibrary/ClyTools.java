package com.lc.mytoolslibrary;

import android.content.Context;

import com.lc.mytoolslibrary.util.Log;
import com.lc.mytoolslibrary.widgets.Toast;

/**
 * Created by congl on 2017/4/11.
 */

public class ClyTools {

    private Context context;
    private String appName;
    private boolean isDebug;
//    private String Wx

    public static void init(Context context, String appName, boolean isDebug) {
        Log.init(appName, isDebug);
        Toast.init(context);
    }
}
