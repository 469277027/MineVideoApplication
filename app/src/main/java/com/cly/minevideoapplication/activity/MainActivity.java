package com.cly.minevideoapplication.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.cly.minevideoapplication.BaseActivity;
import com.cly.minevideoapplication.R;
import com.cly.minevideoapplication.ui.videolist.VideoListPresenter;
import com.lc.mytoolslibrary.util.Log;

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
                item.setChecked(!item.isChecked());
                drawerLayout.closeDrawers();

                switch (item.getItemId()) {
                    case R.id.nav_movie:
                        Log.i(TAG, "--> 电影");
                        break;
                    case R.id.nav_mv:
                        Log.i(TAG, "--> MV");
                        break;
                    case R.id.nav_tv_play:
                        Log.i(TAG, "--> 电视剧");
                        break;
                    case R.id.nav_local:
                        Log.i(TAG, "--> 本地视频");
                        break;
                    case R.id.nav_collection:
                        Log.i(TAG, "--> 收藏");
                        break;
                    case R.id.nav_guess_you_like:
                        Log.i(TAG, "--> 猜你喜欢");
                        break;
                    case R.id.nav_history:
                        Log.i(TAG, "--> 历史记录");
                        break;
                    case R.id.nav_update:
                        Log.i(TAG, "--> 上传视频");
                        break;
                    case R.id.nav_setting:
                        Log.i(TAG, "--> 设置");
                        break;
                }

                return true;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && drawerLayout.isDrawerOpen(navigationView)) {
            drawerLayout.closeDrawers();
            return true;
        } else
            return super.onKeyDown(keyCode, event);
    }
}
