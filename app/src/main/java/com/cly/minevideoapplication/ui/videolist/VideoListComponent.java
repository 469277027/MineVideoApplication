package com.cly.minevideoapplication.ui.videolist;

import com.cly.minevideoapplication.BaseActivity;
import com.cly.minevideoapplication.activity.MainActivity;
import com.cly.minevideoapplication.dagger.FragmentScoped;
import com.cly.minevideoapplication.data.DataComponent;
import com.cly.minevideoapplication.data.DataMoudle;

import dagger.Component;

/**
 * Created by Angel on 2017/5/16.
 */
@FragmentScoped
@Component(modules = {VideoListPresenterModule.class}, dependencies = {DataComponent.class})
public interface VideoListComponent {

    void inject(MainActivity activity);
}
