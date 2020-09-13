package com.dbinding.jc.databindingdemo.presenter;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.dbinding.jc.databindingdemo.R;
import com.dbinding.jc.databindingdemo.model.UserInfo;
import com.dbinding.jc.databindingdemo.view.BindingView;
import com.dbinding.jc.databindingdemo.activity.ListDataActivity;

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
        int age = mUserInfo.getAge();
        mUserInfo.setAge(++age);
    }

    @Override
    public void listPage() {
        Intent i = new Intent(this.mActivity, ListDataActivity.class);
        this.mActivity.startActivity(i);
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
        mUserInfo.setWebsiteSymbol(String.valueOf(R.drawable.website));
        mViewModel.setUIData(mUserInfo);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUserInfo = null;
    }
}
