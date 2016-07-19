package com.huijimuhe.commonlayout.adapter.render;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.huijimuhe.commonlayout.AppContext;
import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.xcSectionAdapter;
import com.huijimuhe.commonlayout.data.xc.xcSection;
import com.huijimuhe.commonlayout.utils.ViewUtility;

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
public class xcSectionImageRender extends AbstractRender {
    private ViewHolder mHolder;
    private xcSectionAdapter mAdapter;

    public xcSectionImageRender(ViewGroup parent, xcSectionAdapter adapter) {
        this.mAdapter = adapter;
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_layout_section_image, parent, false);
        this.mHolder = new ViewHolder(v, adapter);
    }


    @Override
    public void bindData(int position) {
        xcSection.xcImage data=(xcSection.xcImage)mAdapter.getParagraph(position);
        mHolder.mTvText.setText(data.getText());
        Glide.with(AppContext.getInstance().getApplicationContext()).load(data.getUrl()).into(mHolder.mIvBanner);
    }

    @Override
    public AbstractViewHolder getReusableComponent() {
        return this.mHolder;
    }

    public class ViewHolder extends AbstractViewHolder {
        public TextView mTvText;
        public ImageView mIvBanner;
        public ViewHolder(View v, final AbstractRenderAdapter adapter) {
            super(v);
            mTvText=(TextView)v.findViewById(R.id.card_image_text);
            mIvBanner= ViewUtility.findViewById(v,R.id.card_image);
        }
    }
}
