package com.dbinding.jc.databindingdemo.view;

import com.dbinding.jc.databindingdemo.presenter.IPresenter;

/**
 * Created by chenzujie on 2020/8/30.
 */

public interface IView <P extends IPresenter>{

    void attachPresenter(P presenter);

    void onCreate();

    void onDestroy();
}
