package com.dbinding.jc.databindingdemo.model;

import android.databinding.BaseObservable;

/**
 * Created by chenzujie on 2020/9/13.
 */

public class Article extends BaseObservable {

    private String title; // 标题
    private String url; //网址
    private String time; //时间

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
