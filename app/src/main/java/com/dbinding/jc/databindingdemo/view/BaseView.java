package com.dbinding.jc.databindingdemo.view;

import android.app.Activity;

import com.dbinding.jc.databindingdemo.presenter.IPresenter;

/**
 * Created by chenzujie on 2020/8/30.
 */

public abstract class BaseView<P extends IPresenter> implements IView<P>{

    protected P mPresenter;
    protected Activity mActivity;

    public BaseView(Activity activity){
        mActivity = activity;
    }

    @Override
    public void attachPresenter(P presenter) {
        mPresenter = presenter;
    }

    public void onDestroy() {
        mActivity = null;
        mPresenter = null;
    }
}
