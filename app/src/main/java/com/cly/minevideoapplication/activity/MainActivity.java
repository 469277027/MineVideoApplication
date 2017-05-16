package com.cly.minevideoapplication.activity;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.test.mock.MockApplication;

import com.cly.minevideoapplication.BaseActivity;
import com.cly.minevideoapplication.BaseApplication;
import com.cly.minevideoapplication.R;
import com.cly.minevideoapplication.ui.videolist.DaggerVideoListComponent;
import com.cly.minevideoapplication.ui.videolist.VideoListFragment;
import com.cly.minevideoapplication.ui.videolist.VideoListPresenter;
import com.cly.minevideoapplication.ui.videolist.VideoListPresenterModule;
import com.cly.minevideoapplication.utils.ActivityUtils;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    VideoListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),R.id.fl_content, VideoListFragment.newInstance());

        VideoListFragment videoListFragment = (VideoListFragment) getSupportFragmentManager().findFragmentByTag(VideoListFragment.class.getSimpleName());
        if (videoListFragment == null) {
            videoListFragment = VideoListFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), R.id.fl_content, videoListFragment);
        }


        DaggerVideoListComponent.builder()
                .dataComponent(((BaseApplication) getApplication()).getDataComponent())
                .videoListPresenterModule(new VideoListPresenterModule(videoListFragment))
                .build()
                .inject(this);
    }
}
