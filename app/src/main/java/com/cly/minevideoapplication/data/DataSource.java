package com.cly.minevideoapplication.data;

import com.cly.minevideoapplication.data.bean.AVBean;

/**
 * Created by Angel on 2017/5/15.
 */

public interface DataSource {

    //获取视频列表
    AVBean getAVBeanList(String page);

}
