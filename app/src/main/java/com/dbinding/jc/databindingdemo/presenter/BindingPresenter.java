package com.dbinding.jc.databindingdemo.presenter;

import android.app.Activity;
import android.util.Log;

import com.dbinding.jc.databindingdemo.model.UserInfo;
import com.dbinding.jc.databindingdemo.view.BindingView;

/**
 * Created by chenzujie on 2020/8/30.
 */

public class BindingPresenter extends BasePresenter<BindingView> implements IBindingPresenter<BindingView>{

    private UserInfo mUserInfo;

    public BindingPresenter(Activity activity) {
        super(activity);
    }

    @Override
    public void addAge() {
        Log.d("Test", "addAge");
        int age = mUserInfo.getAge();
        mUserInfo.setAge(++age);
    }

    @Override
    public void onCreate() {
        mUserInfo = new UserInfo();
        mUserInfo.setName("T Cheng Z");
        mUserInfo.setAge(20);
        mUserInfo.setSex("男");
        mUserInfo.setJob("软件工程师");
        mUserInfo.setAvatar("https://avatars1.githubusercontent.com/u/2180654?s=400&u=6d0310a6cab9805d89f4d8ec8d5ce2114e408c6c&v=4");
        mUserInfo.setPersonalWebsite("https://www.chenzujie.com");
        mViewModel.setUIData(mUserInfo);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUserInfo = null;
    }
}
