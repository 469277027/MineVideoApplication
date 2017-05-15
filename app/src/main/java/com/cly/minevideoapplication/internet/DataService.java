package com.cly.minevideoapplication.internet;

import com.cly.minevideoapplication.data.bean.AVBean;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Angel on 2017/5/15.
 */

public interface DataService {

    @GET("/first")
    AVBean getAVList(@Query("page") String page);
}
