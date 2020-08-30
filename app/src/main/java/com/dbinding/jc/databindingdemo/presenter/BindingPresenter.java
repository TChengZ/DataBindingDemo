package com.dbinding.jc.databindingdemo.presenter;

import android.app.Activity;

import com.dbinding.jc.databindingdemo.model.UserInfo;
import com.dbinding.jc.databindingdemo.view.BindingView;

/**
 * Created by chenzujie on 2020/8/30.
 */

public class BindingPresenter extends BasePresenter<BindingView> implements IBindingPresenter<BindingView>{

    private UserInfo userInfo;

    public BindingPresenter(Activity activity) {
        super(activity);
    }

    @Override
    public void addAge() {
        int age = userInfo.getAge();
        userInfo.setAge(++age);
    }

    @Override
    public void onCreate() {
        userInfo = new UserInfo();
        userInfo.setName("T Cheng Z");
        userInfo.setAge(20);
        userInfo.setSex("男");
        userInfo.setJob("软件工程师");
        userInfo.setAvatar("https://avatars1.githubusercontent.com/u/2180654?s=400&u=6d0310a6cab9805d89f4d8ec8d5ce2114e408c6c&v=4");
        userInfo.setPersonalWebsite("https://www.chenzujie.com");
        mViewModel.setUIData(userInfo);
    }

    @Override
    public void onDestroy() {

    }
}
