package com.cly.minevideoapplication;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by Angel on 2017/5/15.
 */

public class BaseFragment extends Fragment {

    private static final String KEY_DATA = "KEY_DATA";
    protected String TAG = getClass().getSimpleName();
    protected Parcelable data;

    public static <T extends Parcelable> BaseFragment newInstance(T t) {

        Bundle args = new Bundle();
        args.putParcelable(KEY_DATA, t);
        BaseFragment fragment = new BaseFragment();
        fragment.setArguments(args);
        return fragment;
    }




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getArguments().getParcelable(KEY_DATA);
        Log.d(TAG,"--> onCreate");
    }
}
