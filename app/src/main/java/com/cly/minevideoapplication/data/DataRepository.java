package com.cly.minevideoapplication.data;

import com.cly.minevideoapplication.data.bean.AVBean;
import com.cly.minevideoapplication.data.internet.RemoteDataImpl;
import com.cly.minevideoapplication.data.local.LocalDataImpl;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Angel on 2017/5/15.
 */
@Singleton
public class DataRepository implements DataSource {

    private final DataSource remoteData;

    private final DataSource localData;

    @Inject
    public DataRepository(@Remote RemoteDataImpl remoteData,
                          @Local LocalDataImpl localData) {
        this.remoteData = remoteData;
        this.localData = localData;
    }

    @Override
    public AVBean getAVBeanList(String page) {


        return remoteData.getAVBeanList(page);
    }
}
