package com.huijimuhe.commonlayout.adapter.render;

import android.view.View;
import android.widget.TextView;

import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * <p/>
 * Contact: 20903213@qq.com Zengweizhou
 * <p/>
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
public class xcWeekRender extends AbstractRender {

    private ViewHolder mHolder;
    private AbstractRenderAdapter mAdapter;

    @Override
    public AbstractViewHolder getReusableComponent() {
        return null;
    }

    @Override
    public void bindData(int position) {

    }

    public class ViewHolder extends AbstractViewHolder {
        public TextView mTvMAC;
        public TextView mTvDeviceNum;

        public ViewHolder(View v, final AbstractRenderAdapter adapter) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapter.mOnItemClickListener.onItemClick(v, getLayoutPosition());
                }
            });
        }
    }
}
