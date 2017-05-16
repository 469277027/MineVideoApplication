package com.cly.minevideoapplication.internet;

import com.cly.minevideoapplication.data.bean.AVBean;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Angel on 2017/5/15.
 */

public interface DataService {

    @GET("first")
    Observable<HttpResult<List<AVBean>>> getAVList(@Query("page") String page);




}
