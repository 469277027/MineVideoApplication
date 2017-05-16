package com.cly.minevideoapplication.internet;

import android.util.Log;

import com.cly.minevideoapplication.data.bean.AVBean;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Angel on 2017/5/16.
 */

public class HttpMethods {

    public static final String BASE_URL = "http://192.168.1.103:8080/test/";

    private static final int DEFAULT_TIMEOUT = 5;
    private static final String TAG = "HttpMethods";

    private Retrofit retrofit;
    private DataService dataService;

    private class LoggingInterceptor implements Interceptor {
        @Override
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();

            long t1 = System.nanoTime();
            Log.d(TAG, request.url().toString());

            Response response = chain.proceed(request);

            long t2 = System.nanoTime();
//            logger.info(String.format("Received response for %s in %.1fms%n%s",
//                    response.request().url(), (t2 - t1) / 1e6d, response.headers()));

            return response;
        }
    }

    private HttpMethods() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.
                addInterceptor(new LoggingInterceptor()).connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(httpClientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        dataService = retrofit.create(DataService.class);
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final HttpMethods INSTANCE = new HttpMethods();
    }

    //获取单例
    public static HttpMethods getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //获取视频列表
    public Observable<HttpResult<List<AVBean>>> getVideoList(String page) {
        return dataService.getAVList(page);
    }


}
