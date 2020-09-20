package com.dbinding.jc.databindingdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.dbinding.jc.databindingdemo.R;
import com.android.databinding.library.baseAdapters.BR;
import com.dbinding.jc.databindingdemo.model.Article;
import com.dbinding.jc.databindingdemo.binding.ArticleBinding;
import java.util.List;

/**
 * Created by chenzujie on 2020/9/20.
 */

public class ListDataAdapter extends BaseAdapter{

    private List<Article> mList;
    private Context mContext;

    public ListDataAdapter(Context context, List<Article> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public int getCount() {
        return null != mList? mList.size(): 0;
    }

    @Override
    public Object getItem(int i) {
        return null != mList && mList.size() > i ? mList.get(i) : null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if(null == mList) {
            return null;
        }
        ArticleBinding articleBinding;
        if (convertView == null) {
            articleBinding = DataBindingUtil.inflate(LayoutInflater.from(this.mContext), R.layout.item_article, viewGroup, false);
            //获取convertView
            convertView = articleBinding.getRoot();
        } else {
            articleBinding = DataBindingUtil.getBinding(convertView);
        }
        Article article = mList.get(i);
        articleBinding.setVariable(BR.article, article);
        return convertView;
    }
}
