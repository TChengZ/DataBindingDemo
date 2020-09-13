package com.dbinding.jc.databindingdemo.view;

import com.dbinding.jc.databindingdemo.model.Article;
import com.dbinding.jc.databindingdemo.presenter.IPresenter;

import java.util.List;

/**
 * Created by chenzujie on 2020/9/13.
 */

public interface IListDataView<P extends IPresenter> extends IView<P>{

    void setListData(List<Article> articleList);
}
