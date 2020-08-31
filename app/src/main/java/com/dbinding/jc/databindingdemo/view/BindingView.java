package com.dbinding.jc.databindingdemo.view;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.dbinding.jc.databindingdemo.R;
import com.dbinding.jc.databindingdemo.model.UserInfo;
import com.dbinding.jc.databindingdemo.presenter.BindingPresenter;

/**
 * Created by chenzujie on 2020/8/30.
 */

public class BindingView extends BaseView<BindingPresenter> implements IBindingView<BindingPresenter>{

    private com.dbinding.jc.databindingdemo.binding.UserInfoBinding mUserInfoBinding = null;

    public BindingView(Activity activity) {
        super(activity);
        mUserInfoBinding = DataBindingUtil.setContentView(activity, R.layout.activity_binding);
    }

    @Override
    public void onCreate() {

    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUserInfoBinding = null;
    }

    @Override
    public void setUIData(UserInfo userInfo) {
        mUserInfoBinding.setUserInfo(userInfo);
        mUserInfoBinding.setTitle("个人介绍");
        mUserInfoBinding.setPresenter(mPresenter);
    }
}
