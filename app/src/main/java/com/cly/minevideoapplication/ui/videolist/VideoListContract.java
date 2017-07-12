package com.cly.minevideoapplication.ui.videolist;

import com.cly.minevideoapplication.BasePresenter;
import com.cly.minevideoapplication.BaseView;
import com.cly.minevideoapplication.data.bean.AVBean;

import java.util.List;

/**
 * Created by Angel on 2017/5/15.
 */

public interface VideoListContract {

    interface View extends BaseView<Presenter>{

        //设置进度条状态
        void setProgressState(boolean isShow);

        //设置数据
        void loadDatas(List<AVBean> list);

        //数据加载失败
        void loadError(String message);


    }

    interface Presenter extends BasePresenter {

        //获取列表
        void getList(String page);

    }
}
