package com.cly.minevideoapplication.data;

import com.cly.minevideoapplication.data.bean.AVBean;
import com.cly.minevideoapplication.internet.HttpPageResult;

import java.util.List;

import io.reactivex.Observable;


/**
 * Created by Angel on 2017/5/15.
 */

public interface DataSource {

    //获取视频列表
    Observable<HttpPageResult<List<AVBean>>> getAVBeanList(String page);

}
