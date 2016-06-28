package com.huijimuhe.commonlayout.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractAdapter;

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
public class xcSubjectAdapter extends AbstractAdapter {
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
