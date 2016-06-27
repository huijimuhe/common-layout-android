package com.huijimuhe.commonlayout.adapter;

import android.annotation.TargetApi;
import android.view.ViewGroup;

import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.render.xcFoodRender;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;

import java.util.List;

public class xcArticleAdapter extends AbstractRenderAdapter<xcIndexResponse> {
    public static final int TYPE_SUBJECTS = 1;
    public static final int TYPE_FOOD = 1 << 1;
    public static final int TYPE_PLAY = 1 << 2;
    private int mViewType;
    private xcIndexResponse mResponse;

    public xcArticleAdapter(xcIndexResponse data, int type) {

        this.mViewType = type;
    }

    @Override
    public int getItemCount() {

        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void replace(List<xcIndexResponse> data) {
        super.replace(data);
    }

    @Override
    public void remove(xcIndexResponse data) {
        super.remove(data);
    }

    @Override
    public void addAll(List<xcIndexResponse> data) {
        super.addAll(data);
    }

    @Override
    public xcIndexResponse getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public List<xcIndexResponse> getList() {
        return super.getList();
    }

    @TargetApi(4)
    public AbstractViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        //header view 的判断
        AbstractViewHolder holder = super.onCreateViewHolder(viewGroup, viewType);
        if (holder != null) {
            return holder;
        }

        xcFoodRender miss = new xcFoodRender(viewGroup, this);
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
