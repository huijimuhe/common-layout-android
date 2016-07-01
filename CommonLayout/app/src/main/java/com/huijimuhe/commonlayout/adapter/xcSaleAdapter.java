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
import com.huijimuhe.commonlayout.data.xc.xcSale;

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
public class xcSaleAdapter extends AbstractAdapter<xcSaleAdapter.ViewHolder> {
    private List<xcSale> mDataset;
    private Context mContext;

    public xcSaleAdapter(List<xcSale> data,Context context) {
        mDataset = data;
        mContext=context;
    }

    @Override
    public xcSaleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_listitem_sale, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTvTitle.setText(mDataset.get(position).getTitle());
        Glide.with(mContext).load(mDataset.get(position).getImage()).into(holder.mIvBanner);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void replace(List<xcSale> data){
        mDataset=data;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTvTitle;
        public ImageView mIvBanner;

        public ViewHolder(View v) {
            super(v);
            mTvTitle = (TextView) v.findViewById(R.id.sale_title);
            mIvBanner=(ImageView)v.findViewById(R.id.sale_image);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(v, getLayoutPosition());
                }
            });
        }
    }
}
