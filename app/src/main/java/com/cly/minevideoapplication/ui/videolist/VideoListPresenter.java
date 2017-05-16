package com.cly.minevideoapplication.ui.videolist;

import android.util.Log;

import com.cly.minevideoapplication.data.DataRepository;
import com.cly.minevideoapplication.data.bean.AVBean;
import com.cly.minevideoapplication.internet.HttpMethods;
import com.cly.minevideoapplication.internet.HttpResult;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Angel on 2017/5/16.
 */

public class VideoListPresenter implements VideoListContract.Presenter {

    private static final String TAG = "VideoListPresenter";

    private final DataRepository dataRepository;
    private final VideoListContract.View view;

    @Inject
    VideoListPresenter(DataRepository dataRepository, VideoListContract.View view) {
        Log.d(TAG,"--> VideoListPresenter");
        this.dataRepository = dataRepository;
        this.view = view;
    }

    @Inject
    void setupListeners() {
        view.setPresenter(this);
        Log.d(TAG,"--> setupListeners");
    }

    @Override
    public void subscribe() {
        getList("0");
    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void getList(String page) {

        HttpMethods.getInstance().getVideoList(page)
                .subscribeOn(Schedulers.newThread())
                .unsubscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HttpResult<List<AVBean>>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HttpResult<List<AVBean>> value) {
                        Log.d(TAG,"--> onNext:value = " + value.toString());
                        view.loadDatas(value.getData());
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
