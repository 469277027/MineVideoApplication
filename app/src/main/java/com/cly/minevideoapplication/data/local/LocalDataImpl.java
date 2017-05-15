package com.cly.minevideoapplication.data.local;

import android.content.Context;

import com.cly.minevideoapplication.data.DataSource;
import com.cly.minevideoapplication.data.bean.AVBean;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Angel on 2017/5/15.
 */
@Singleton
public class LocalDataImpl implements DataSource {

    private Context context;

    @Inject
    public LocalDataImpl(Context context) {
        this.context = context;
    }

    @Override
    public AVBean getAVBeanList(String page) {
        return null;
    }
}
