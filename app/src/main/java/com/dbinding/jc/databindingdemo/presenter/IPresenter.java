package com.dbinding.jc.databindingdemo.presenter;

import com.dbinding.jc.databindingdemo.view.IView;

/**
 * Created by chenzujie on 2020/8/29.
 */

public interface IPresenter<V extends IView> {

    void onCreate();

    void onDestroy();

    void attachView(V viewModel);
}
