package com.huijimuhe.commonlayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractAdapter;
import com.huijimuhe.commonlayout.data.xc.xcArticle;

import java.util.List;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * <p>
 * Contact: 20903213@qq.com Zengweizhou
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class xcJxHeaderWeekAdapter extends AbstractAdapter<xcJxHeaderWeekAdapter.ViewHolder> {
    private List<xcArticle> mDataset;
    private Context mContext;

    public xcJxHeaderWeekAdapter(List<xcArticle> data, Context context) {
        mDataset = data;
        mContext = context;
    }

    @Override
    public xcJxHeaderWeekAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_listitem_week, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTvTitle.setText(mDataset.get(position).getTitle());
        holder.mTvLike.setText(String.format("赞  %s", mDataset.get(position).getPraise_count()));
        Glide.with(mContext).load(mDataset.get(position).getFull_image()).into(holder.mIvBanner);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void replace(List<xcArticle> data) {
        mDataset = data;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTvTitle;
        public TextView mTvLike;
        public ImageView mIvBanner;

        public ViewHolder(View v) {
            super(v);
            mTvTitle = (TextView) v.findViewById(R.id.week_text);
            mTvLike = (TextView) v.findViewById(R.id.week_count);
            mIvBanner = (ImageView) v.findViewById(R.id.week_image);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(v, getLayoutPosition());
                }
            });
        }
    }
}
