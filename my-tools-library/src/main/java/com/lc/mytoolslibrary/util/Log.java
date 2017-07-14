package com.lc.mytoolslibrary.util;

/**
 * Created by congl on 2017/4/11.
 */

public class Log {

    private static String appName;
    private static boolean isDebug;

    public static void init(String appName, boolean isDebug) {
        Log.appName = appName;
        Log.isDebug = isDebug;
    }

    /*======================debug=============================*/

    public static void d(String key,String value){
        if (isDebug) android.util.Log.d(key,value);
    }

    public static void d(String value){
        if (isDebug) d(appName,value);
    }

    public static void d(Class<?> clazz,String value){
        if (isDebug) d(clazz.getSimpleName(),value);
    }

    /*======================error=============================*/


    public static void e(String key,String value){
        if (isDebug) android.util.Log.e(key,value);
    }

    public static void e(String value){
        if (isDebug) e(appName,value);
    }

    public static void e(Class<?> clazz,String value){
        if (isDebug) e(clazz.getSimpleName(),value);
    }

    /*=======================info===========================*/

    public static void i(String key,String value){
        if (isDebug) android.util.Log.i(key,value);
    }

    public static void i(String value){
        if (isDebug) i(appName,value);
    }

    public static void i(Class<?> clazz,String value){
        if (isDebug) i(clazz.getSimpleName(),value);
    }
}
