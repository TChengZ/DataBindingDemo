package com.dbinding.jc.databindingdemo.presenter;

import android.app.Activity;

import com.dbinding.jc.databindingdemo.R;
import com.dbinding.jc.databindingdemo.view.ListDataView;

/**
 * Created by chenzujie on 2020/9/13.
 */

public class ListDataPresenter extends BasePresenter<ListDataView> implements IListDataPresenter<ListDataView> {

    public ListDataPresenter(Activity activity) {
        super(activity);
    }

    @Override
    public void onCreate() {

    }
}
