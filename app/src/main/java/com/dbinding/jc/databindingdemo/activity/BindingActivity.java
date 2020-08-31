package com.dbinding.jc.databindingdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import com.dbinding.jc.databindingdemo.presenter.BindingPresenter;
import com.dbinding.jc.databindingdemo.view.BindingView;

public class BindingActivity extends BaseActivity<BindingPresenter, BindingView> {


    protected BindingView createViewModel(Activity activity){
        return new BindingView(activity);
    }

    protected BindingPresenter createPresenter(Activity activity){
        return new BindingPresenter(activity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
