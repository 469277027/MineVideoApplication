package com.cly.minevideoapplication.data.internet;

import com.cly.minevideoapplication.data.DataSource;
import com.cly.minevideoapplication.data.bean.AVBean;

import javax.inject.Singleton;

/**
 * Created by Angel on 2017/5/15.
 */
@Singleton
public class RemoteDataImpl implements DataSource {

    public RemoteDataImpl() {
    }

    @Override
    public AVBean getAVBeanList(String page)   {
        return null;
    }
}
