package com.suan.example.ui.adapter.pager;

import android.content.Context;

import com.suan.common.ui.adapter.listview.BaseListAdapter;
import com.suan.example.ui.mvc.Model.ArticleModel;

/**
 * Created by suanmiao on 14/12/20.
 */
public abstract class BaseArticleListAdapter extends BaseListAdapter<ArticleModel> {

    public BaseArticleListAdapter(Context context) {
        super(context);
    }


    @Override
    public int getViewTypeCount() {
        return 2;
    }
}