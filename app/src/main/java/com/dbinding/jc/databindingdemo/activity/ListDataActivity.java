package com.dbinding.jc.databindingdemo.activity;

import android.app.Activity;

import com.dbinding.jc.databindingdemo.presenter.IPresenter;
import com.dbinding.jc.databindingdemo.presenter.ListDataPresenter;
import com.dbinding.jc.databindingdemo.view.IView;
import com.dbinding.jc.databindingdemo.view.ListDataView;

/**
 * Created by chenzujie on 2020/9/13.
 */

public class ListDataActivity extends BaseActivity{
    @Override
    protected IView createViewModel(Activity activity) {
        return new ListDataView(activity);
    }

    @Override
    protected IPresenter createPresenter(Activity activity) {
        return new ListDataPresenter(activity);
    }
}
