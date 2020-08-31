package com.dbinding.jc.databindingdemo.presenter;

import android.app.Activity;

import com.dbinding.jc.databindingdemo.view.IView;
/**
 * Created by chenzujie on 2020/8/30.
 */

public abstract class BasePresenter<V extends IView> implements IPresenter<V> {

    protected Activity mActivity;
    protected V mViewModel;

    public BasePresenter(Activity activity){
        mActivity = activity;
    }

    public void attachView(V viewModel){
        mViewModel = viewModel;
    }

    public void onDestroy() {
        mActivity = null;
        mViewModel = null;
    }
}
