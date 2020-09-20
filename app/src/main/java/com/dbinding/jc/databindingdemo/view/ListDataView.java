package com.dbinding.jc.databindingdemo.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;

import com.dbinding.jc.databindingdemo.model.Article;
import com.dbinding.jc.databindingdemo.adapter.ListDataAdapter;
import com.dbinding.jc.databindingdemo.presenter.ListDataPresenter;
import com.dbinding.jc.databindingdemo.R;

import com.dbinding.jc.databindingdemo.binding.ListDataBinding;
import java.util.List;

/**
 * Created by chenzujie on 2020/9/13.
 */

public class ListDataView extends BaseView<ListDataPresenter> implements IListDataView<ListDataPresenter> {

    private ListDataBinding mListDataBinding;
    private ListDataAdapter mListDataAdapter;

    public ListDataView(Activity activity) {
        super(activity);
        mListDataBinding = DataBindingUtil.setContentView(activity, R.layout.activity_list);
    }

    @Override
    public void setListData(List<Article> articleList) {
        mListDataAdapter = new ListDataAdapter(mActivity, articleList);
        mListDataBinding.setAdapter(mListDataAdapter);
    }

    @Override
    public void onCreate() {

    }
}
