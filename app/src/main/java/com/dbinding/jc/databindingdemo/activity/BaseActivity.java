package com.dbinding.jc.databindingdemo.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.dbinding.jc.databindingdemo.R;
import com.dbinding.jc.databindingdemo.presenter.IPresenter;
import com.dbinding.jc.databindingdemo.view.IView;

/**
 * Created by chenzujie on 2020/8/30.
 */

public abstract class BaseActivity<P extends IPresenter, V extends IView> extends Activity{

    protected P mPresenter;
    protected V mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = createViewModel(this);
        mPresenter = createPresenter(this);
        mViewModel.attachPresenter(mPresenter);
        mPresenter.attachView(mViewModel);
        mPresenter.onCreate();
        mViewModel.onCreate();
    }

    protected abstract V createViewModel(Activity activity);

    protected abstract P createPresenter(Activity activity);

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mPresenter.onCreate();
        mViewModel.onCreate();
    }

}
