package com.cly.minevideoapplication;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Angel on 2017/5/15.
 */
@Module
public class ApplicationMoudle {

    private final Context mContext;

    public ApplicationMoudle(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    Context provideContent(){
        return mContext;
    }
}
