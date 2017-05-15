package com.cly.minevideoapplication.data;

import com.cly.minevideoapplication.data.internet.RemoteDataImpl;
import com.cly.minevideoapplication.data.local.LocalDataImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Angel on 2017/5/15.
 */
@Module
public abstract class DataMoudle {

    @Singleton
    @Binds
    @Local
    abstract LocalDataImpl provideLocalData(LocalDataImpl data);

    @Singleton
    @Binds
    @Remote
    abstract RemoteDataImpl provideRemoteData(RemoteDataImpl data);

}
