package com.cly.minevideoapplication.ui.videolist;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Angel on 2017/5/16.
 */
@Module
public class VideoListPresenterModule {

    private final VideoListContract.View view;

    public VideoListPresenterModule(VideoListContract.View view) {
        this.view = view;
    }

    @Provides
    VideoListContract.View provideVideoList() {
        return view;
    }
}
