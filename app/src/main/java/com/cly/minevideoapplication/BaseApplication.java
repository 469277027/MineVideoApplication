package com.cly.minevideoapplication;

import android.app.Application;

import com.cly.minevideoapplication.data.DaggerDataComponent;
import com.cly.minevideoapplication.data.DataComponent;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.lc.mytoolslibrary.ClyTools;

/**
 * Created by Angel on 2017/5/15.
 */

public class BaseApplication extends Application {

    private DataComponent dataComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        dataComponent = DaggerDataComponent.builder()
                .applicationMoudle(new ApplicationMoudle(getApplicationContext()))
                .build();

        Fresco.initialize(this.getApplicationContext());

        ClyTools.init(getApplicationContext(), "", BuildConfig.DEBUG);
    }

    public DataComponent getDataComponent() {
        return dataComponent;
    }
}
