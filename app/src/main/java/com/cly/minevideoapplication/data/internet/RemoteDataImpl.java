package com.cly.minevideoapplication.data.internet;

import com.cly.minevideoapplication.data.DataSource;
import com.cly.minevideoapplication.data.bean.AVBean;
import com.cly.minevideoapplication.internet.HttpMethods;
import com.cly.minevideoapplication.internet.HttpResult;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by Angel on 2017/5/15.
 */
@Singleton
public class RemoteDataImpl implements DataSource {

    @Inject
    public RemoteDataImpl() {
    }


    @Override
    public Observable<HttpResult<List<AVBean>>> getAVBeanList(String page) {
        return HttpMethods.getInstance().getVideoList(page);
    }
}
