package com.huijimuhe.commonlayout.adapter.base;

import android.annotation.TargetApi;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;


import com.huijimuhe.commonlayout.adapter.render.HeaderRender;

import java.util.List;

public abstract class AbstractRenderAdapter<T> extends RecyclerView.Adapter<AbstractViewHolder> {

    public static final int RENDER_TYPE_HEADER = 110 << 1;
    public static final int RENDER_TYPE_NORMAL = 110 << 2;
    public List<T> mDataset;

    public onItemClickListener mOnItemClickListener;
    public onItemFunctionClickListener mOnItemFunctionClickListener;

    private View mHeaderView;
    public boolean mIsSectionHeadShown;

    @Override
    public int getItemViewType(int position) {
        if (position == 0 && mHeaderView != null) {
            return RENDER_TYPE_HEADER;
        }
        return RENDER_TYPE_NORMAL;
    }

    @TargetApi(4)
    public AbstractViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        switch (viewType) {
            case RENDER_TYPE_HEADER: {
                HeaderRender head = new HeaderRender(mHeaderView);
                AbstractViewHolder headHolder = head.getReusableComponent();
                headHolder.itemView.setTag(android.support.design.R.id.list_item, head);
                return headHolder;
            }
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return hasHeaderView() ? mDataset.size() + 1 : mDataset.size();
    }

    public void replace(List<T> data) {
        this.mDataset = data;
        notifyDataSetChanged();
    }

    public void replace(List<T> data, boolean isSectionHeadShown) {
        this.mDataset = data;
        this.mIsSectionHeadShown = isSectionHeadShown;
        notifyDataSetChanged();
    }

    public void remove(T data) {
        this.mDataset.remove(data);
        notifyDataSetChanged();
    }

    public void addAll(List<T> data) {
        this.mDataset.addAll(data);
        notifyDataSetChanged();
    }

    public List<T> getList() {
        return this.mDataset;
    }

    public int getRealPosition(int position) {
        return hasHeaderView() && position != 0 ? position - 1 : position;
    }

    public T getItem(int position) {
        return mDataset.get(getRealPosition(position));
    }


    public boolean hasHeaderView() {
        return mHeaderView != null;
    }

    public void setHeaderView(View view) {
        mHeaderView = view;
    }

    public void setOnItemClickListener(onItemClickListener l) {
        mOnItemClickListener = l;
    }

    public void setOnItemFunctionClickListener(onItemFunctionClickListener l) {
        mOnItemFunctionClickListener = l;
    }

    public interface onItemClickListener {
        void onItemClick(View view, int postion);
    }

    public interface onItemFunctionClickListener {
        void onClick(View view, int postion, int type);
    }
}
