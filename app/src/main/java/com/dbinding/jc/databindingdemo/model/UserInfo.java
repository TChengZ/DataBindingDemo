package com.dbinding.jc.databindingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by chenzujie on 2020/8/23.
 */

public class UserInfo extends BaseObservable{

    private String name; // 姓名
    private String sex; //性别
    private int age; // 年龄
    private String job; // 工作
    private String avatar; //头像
    private String personalWebsite; //个人网站
    private String websiteSymbol; //网站符号

    public UserInfo(){

    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPersonalWebsite() {
        return personalWebsite;
    }

    public void setPersonalWebsite(String personalWebsite) {
        this.personalWebsite = personalWebsite;
    }

    public String getWebsiteSymbol() {
        return websiteSymbol;
    }

    public void setWebsiteSymbol(String websiteSymbol) {
        this.websiteSymbol = websiteSymbol;
    }
}
