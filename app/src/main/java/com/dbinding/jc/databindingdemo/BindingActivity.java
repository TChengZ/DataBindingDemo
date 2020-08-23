package com.dbinding.jc.databindingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.dbinding.jc.databindingdemo.model.UserInfo;

public class BindingActivity extends Activity {

    private com.dbinding.jc.databindingdemo.binding.UserInfoBinding userInfoBinding = null;
    private UserInfo userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userInfoBinding = DataBindingUtil.setContentView(this, R.layout.activity_binding);
        init();
        setUIData();
    }

    private void init(){
        userInfo = new UserInfo();
        userInfo.setName("T Cheng Z");
        userInfo.setAge(20);
        userInfo.setSex("男");
        userInfo.setJob("软件工程师");
        userInfo.setAvatar("https://avatars1.githubusercontent.com/u/2180654?s=400&u=6d0310a6cab9805d89f4d8ec8d5ce2114e408c6c&v=4");
        userInfo.setPersonalWebsite("https://www.chenzujie.com");
    }

    private void setUIData(){
        userInfoBinding.setTitle("个人介绍");
        userInfoBinding.setUserInfo(userInfo);
    }
}
