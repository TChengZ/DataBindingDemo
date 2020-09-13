package com.dbinding.jc.databindingdemo.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import com.dbinding.jc.databindingdemo.model.Article;
import com.dbinding.jc.databindingdemo.presenter.ListDataPresenter;
import com.dbinding.jc.databindingdemo.R;
import java.util.List;

/**
 * Created by chenzujie on 2020/9/13.
 */

public class ListDataView extends BaseView<ListDataPresenter> implements IListDataView<ListDataPresenter> {

    public ListDataView(Activity activity) {
        super(activity);
        DataBindingUtil.setContentView(activity, R.layout.activity_list);
    }

    @Override
    public void setListData(List<Article> articleList) {

    }

    @Override
    public void onCreate() {

    }
}
