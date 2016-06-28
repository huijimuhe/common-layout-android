package com.huijimuhe.commonlayout.adapter;

import android.annotation.TargetApi;
import android.view.ViewGroup;

import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.render.xcArticleRender;
import com.huijimuhe.commonlayout.data.xc.xcArticle;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;

import java.util.List;

public class xcArticleAdapter extends AbstractRenderAdapter<xcArticle> {

    public xcArticleAdapter(List<xcArticle> data) {
        this.mDataset=data;
    }

    @TargetApi(4)
    public AbstractViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        //header view 的判断
        AbstractViewHolder holder = super.onCreateViewHolder(viewGroup, viewType);
        if (holder != null) {
            return holder;
        }

        xcArticleRender miss = new xcArticleRender(viewGroup, this);
        AbstractViewHolder missHolder = miss.getReusableComponent();
        missHolder.itemView.setTag(android.support.design.R.id.list_item, miss);
        return missHolder;
    }

    @TargetApi(4)
    public void onBindViewHolder(AbstractViewHolder holder, int position) {
        AbstractRender render = (AbstractRender) holder.itemView.getTag(android.support.design.R.id.list_item);
        render.bindData(position);
    }

}
