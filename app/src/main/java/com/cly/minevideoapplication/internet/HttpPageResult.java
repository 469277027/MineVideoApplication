package com.cly.minevideoapplication.internet;

/**
 * Created by Angel on 2017/5/17.
 */

public class HttpPageResult<T> extends HttpResult<T> {

    private String allPage;
    private String eachPage;

    public String getAllPage() {
        return allPage;
    }

    public void setAllPage(String allPage) {
        this.allPage = allPage;
    }

    public String getEachPage() {
        return eachPage;
    }

    public void setEachPage(String eachPage) {
        this.eachPage = eachPage;
    }

    @Override
    public String toString() {
        return "HttpPageResult{" +
                "allPage='" + allPage + '\'' +
                ", eachPage='" + eachPage + '\'' +
                "} " + super.toString();
    }
}
