package com.cly.minevideoapplication.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.List;

/**
 * Created by Angel on 2017/5/16.
 */

public class ActivityUtils {

    public static void addFragmentToActivity(FragmentManager fragmentManager, int resId, Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(resId,fragment,fragment.getClass().getSimpleName());
        transaction.commit();
    }
}
