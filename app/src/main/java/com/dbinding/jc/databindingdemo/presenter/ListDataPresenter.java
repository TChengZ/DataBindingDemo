package com.dbinding.jc.databindingdemo.presenter;

import android.app.Activity;

import com.dbinding.jc.databindingdemo.R;
import com.dbinding.jc.databindingdemo.model.Article;
import com.dbinding.jc.databindingdemo.view.ListDataView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenzujie on 2020/9/13.
 */

public class ListDataPresenter extends BasePresenter<ListDataView> implements IListDataPresenter<ListDataView> {

    public ListDataPresenter(Activity activity) {
        super(activity);
    }

    @Override
    public void onCreate() {
        List<Article> list = new ArrayList<>();
        Article article1 = new Article();
        article1.setTitle("SKETCH插件开发入门");
        article1.setTime("2020年8月15日");
        article1.setUrl("https://www.chenzujie.com/sketch-introduce-code.html");
        list.add(article1);
        Article article2 = new Article();
        article2.setTitle("yoga-像写网页一样写客户端界面");
        article2.setTime("2020年6月21日");
        article2.setUrl("https://www.chenzujie.com/yoga-android-demo.html");
        list.add(article2);
        Article article3 = new Article();
        article3.setTitle("Android Ui卡顿检测");
        article3.setTime("2020年6月20日");
        article3.setUrl("https://www.chenzujie.com/andorid-ui-caton.html");
        list.add(article3);
        Article article4 = new Article();
        article4.setTitle("阿里云ECS+wordpress构建个人网站");
        article4.setTime("2020年6月4日");
        article4.setUrl("https://www.chenzujie.com/aliyunecs-wordpress.html");
        list.add(article4);
        mViewModel.setListData(list);
    }
}
