package com.cly.minevideoapplication.ui.list;

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
        void setDatas(List<AVBean.DataBean> list);

    }

    interface Presenter extends BasePresenter {

        //获取列表
        AVBean getList(String page);

    }
}
