package com.cly.minevideoapplication.data;

import com.cly.minevideoapplication.ApplicationMoudle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Angel on 2017/5/15.
 */
@Singleton
@Component(modules = {ApplicationMoudle.class,DataMoudle.class})
public interface DataComponent {

    DataRepository getDataRepository();
}
