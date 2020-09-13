package com.dbinding.jc.databindingdemo.presenter;

import com.dbinding.jc.databindingdemo.view.IView;

/**
 * Created by chenzujie on 2020/8/30.
 */

public interface IBindingPresenter<V extends IView> extends IPresenter<V>{

    void addAge();

    void listPage();
}
