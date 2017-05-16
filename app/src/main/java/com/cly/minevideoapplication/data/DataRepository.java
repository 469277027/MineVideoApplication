package com.cly.minevideoapplication.data;

import com.cly.minevideoapplication.data.bean.AVBean;
import com.cly.minevideoapplication.data.internet.RemoteDataImpl;
import com.cly.minevideoapplication.data.local.LocalDataImpl;
import com.cly.minevideoapplication.internet.HttpResult;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by Angel on 2017/5/15.
 */
@Singleton
public class DataRepository implements DataSource {

    private final DataSource remoteData;

    private final DataSource localData;

    @Inject
    public DataRepository(@Local LocalDataImpl localData,
                          @Remote RemoteDataImpl remoteData) {
        this.remoteData = remoteData;
        this.localData = localData;
    }


    @Override
    public Observable<HttpResult<List<AVBean>>> getAVBeanList(String page) {
        return remoteData.getAVBeanList(page);
    }
}
