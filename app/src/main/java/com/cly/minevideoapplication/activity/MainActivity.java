package com.cly.minevideoapplication.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.cly.minevideoapplication.BaseActivity;
import com.cly.minevideoapplication.R;
import com.cly.minevideoapplication.ui.videolist.VideoListPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @Inject
    VideoListPresenter presenter;
    @BindView(R.id.fl_content)
    FrameLayout flContent;
    @BindView(R.id.navigation_view)
    NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),R.id.fl_content, VideoListFragment.newInstance());

        initNavigation();
//
//        VideoListFragment videoListFragment = (VideoListFragment) getSupportFragmentManager().findFragmentByTag(VideoListFragment.class.getSimpleName());
//        if (videoListFragment == null) {
//            videoListFragment = VideoListFragment.newInstance();
//            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), R.id.fl_content, videoListFragment);
//        }
//
//
//        DaggerVideoListComponent.builder()
//                .dataComponent(((BaseApplication) getApplication()).getDataComponent())
//                .videoListPresenterModule(new VideoListPresenterModule(videoListFragment))
//                .build()
//                .inject(this);
    }

    private void initNavigation() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setEnabled(true);
                drawerLayout.closeDrawers();
                return false;
            }
        });
    }
}
