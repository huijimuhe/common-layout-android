package com.huijimuhe.commonlayout.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractAdapter;
import com.huijimuhe.commonlayout.data.xc.xcArticle;
import com.huijimuhe.commonlayout.data.xc.xcFeature;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * Contact: 20903213@qq.com Zengweizhou
 */
public class xcFxListAdapter extends AbstractAdapter<xcFxListAdapter.ViewHolder> {
    private List<xcFeature> mDataset;
    private Context mContext;

    public xcFxListAdapter(List<xcFeature> data, Context context) {
        mDataset = data;
        mContext = context;
    }

    @Override
    public xcFxListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_listitem_feature, parent, false);
        return new ViewHolder(v, mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTvTitle.setText(mDataset.get(position).getTitle());
        holder.mAdapter.replace(mDataset.get(position).getArticles());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void replace(List<xcFeature> data) {
        mDataset = data;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTvTitle;
        public RecyclerView mList;
        private xcJxHeaderWeekAdapter mAdapter;

        public ViewHolder(View v, Context context) {
            super(v);
            mTvTitle = (TextView) v.findViewById(R.id.subject_item_title);

            mList = (RecyclerView) v.findViewById(R.id.feature_list);
            LinearLayoutManager weekManager = new LinearLayoutManager(context);
            weekManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            mList.setLayoutManager(weekManager);

            mAdapter = new xcJxHeaderWeekAdapter(new ArrayList<xcArticle>(), context);
            mAdapter.setOnItemClickListener(new AbstractAdapter.onItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
//                    mOnItemClickListener.onItemClick(view, position);
                }
            });
            mList.setAdapter(mAdapter);
        }
    }
}
