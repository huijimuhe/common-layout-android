package com.huijimuhe.commonlayout.adapter;

import android.annotation.TargetApi;
import android.view.ViewGroup;

import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.render.xcCommentRender;
import com.huijimuhe.commonlayout.data.xc.xcComment;

import java.util.List;

public class xcCommentAdapter extends AbstractRenderAdapter<xcComment> {

    public xcCommentAdapter(List<xcComment> data) {
        this.mDataset=data;
    }

    @TargetApi(4)
    public AbstractViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        //header view 的判断
        AbstractViewHolder holder = super.onCreateViewHolder(viewGroup, viewType);
        if (holder != null) {
            return holder;
        }

        xcCommentRender render = new xcCommentRender(viewGroup, this);
        AbstractViewHolder renderHolder = render.getReusableComponent();
        renderHolder.itemView.setTag(android.support.design.R.id.list_item, render);
        return renderHolder;
    }

    @TargetApi(4)
    public void onBindViewHolder(AbstractViewHolder holder, int position) {
        AbstractRender render = (AbstractRender) holder.itemView.getTag(android.support.design.R.id.list_item);
        render.bindData(position);
    }

}
