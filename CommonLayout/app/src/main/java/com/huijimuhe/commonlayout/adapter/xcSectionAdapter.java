package com.huijimuhe.commonlayout.adapter;

import android.annotation.TargetApi;
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
import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.render.xcArticleRender;
import com.huijimuhe.commonlayout.adapter.render.xcSectionImageRender;
import com.huijimuhe.commonlayout.adapter.render.xcSectionTextRender;
import com.huijimuhe.commonlayout.data.xc.xcSale;
import com.huijimuhe.commonlayout.data.xc.xcSection;

import java.security.PublicKey;
import java.util.List;

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
public class xcSectionAdapter extends AbstractRenderAdapter<xcSection> {
    public static int TYPE_TEXT = 1 << 1;
    public static int TYPE_IMAGE = 1 << 2;

    public xcSectionAdapter(List<xcSection> data) {
        this.mDataset = data;
    }

    @Override
    public int getItemViewType(int position) {
        if (super.getItemViewType(position) == RENDER_TYPE_HEADER) {
            return super.getItemViewType(position);
        }
        xcSection section = getItem(position);
        switch (section.getType()) {
            case 2:
                return TYPE_TEXT;
            case 3:
                return TYPE_IMAGE;
            default:
                return RENDER_TYPE_NORMAL;
        }
    }

    @TargetApi(4)
    public AbstractViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        //header view 的判断
        AbstractViewHolder holder = super.onCreateViewHolder(viewGroup, viewType);
        if (holder != null) {
            return holder;
        }
        switch (viewType) {
            case 2:
                xcSectionTextRender text = new xcSectionTextRender(viewGroup, this);
                AbstractViewHolder textholder = text.getReusableComponent();
                textholder.itemView.setTag(android.support.design.R.id.list_item, text);
                return textholder;
            case 3:
//                xcSectionImageRender image = new xcSectionImageRender(viewGroup, this);
//                AbstractViewHolder imgHolder = image.getReusableComponent();
//                imgHolder.itemView.setTag(android.support.design.R.id.list_item, image);
//                return imgHolder;
            default:
                return null;
        }

    }

    @TargetApi(4)
    public void onBindViewHolder(AbstractViewHolder holder, int position) {
        AbstractRender render = (AbstractRender) holder.itemView.getTag(android.support.design.R.id.list_item);
        render.bindData(position);
    }
}