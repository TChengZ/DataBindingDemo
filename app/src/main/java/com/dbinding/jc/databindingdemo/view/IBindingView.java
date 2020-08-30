package com.dbinding.jc.databindingdemo.view;

import android.app.Activity;

import com.dbinding.jc.databindingdemo.model.UserInfo;
import com.dbinding.jc.databindingdemo.presenter.IPresenter;

/**
 * Created by chenzujie on 2020/8/30.
 */

public interface IBindingView<P extends IPresenter> extends IView<P>{

    void setUIData(UserInfo userInfo);
}
