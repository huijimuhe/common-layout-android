package com.huijimuhe.commonlayout.adapter;

import android.annotation.TargetApi;
import android.support.v4.util.ArrayMap;
import android.view.ViewGroup;

import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.render.xcArticleSectionImageRender;
import com.huijimuhe.commonlayout.adapter.render.xcArticleSectionTextRender;
import com.huijimuhe.commonlayout.data.xc.xcArticleSection;

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
public class xcArticleSectionAdapter extends AbstractRenderAdapter<xcArticleSection> {
    public static final int TYPE_TEXT = 1 << 1;
    public static final int TYPE_IMAGE = 1 << 2;

    private ArrayMap<Integer, Integer> mSection;

    public xcArticleSectionAdapter(List<xcArticleSection> data) {
        this.mDataset = data;
        mSection = new ArrayMap<>();
    }

    @Override
    public int getItemCount() {
        int size = 0;

        //list头
        if (hasHeaderView()) {
            size++;
        }
        mSection.clear();
        for (int i = 0; i < mDataset.size(); i++) {

            switch (mDataset.get(i).getType()) {
                case 2:
                case 3:
                    size += mDataset.get(i).getContentArray().size();
                    break;
                default:
                    size++;
                    break;
            }
            //分段，根据position知道是第几个section
            mSection.put(size, i);
        }

        return size;
    }

    /**
     * 根据列表实际位置计算是第几个section
     *
     * @param position
     * @return
     */
    @Override
    public int getRealPosition(int position) {
        synchronized (mSection) {
            //去掉头的影响
            if (hasHeaderView() && position != 0) {
                position -= 1;
            }

            //根据列表实际位置计算是第几个section
            int relativePos = 0;
            for (Integer sectionSize : mSection.keySet()) {
                if (position < sectionSize) {
                    relativePos = sectionSize;
                    break;
                }
            }
            int testRes = mSection.get(relativePos);
            return mSection.get(relativePos);
        }
    }

    /**
     * 根据列表实际位置计算在section中的相对位置
     *
     * @param position
     * @return
     */
    public int getParagraphPosition(int position) {
        synchronized (mSection) {
            //去掉头的影响
            if (hasHeaderView() && position != 0) {
                position -= 1;
            }

            //根据列表实际位置计算在section中的相对位置
            if (position == 0) {
                return position;
            }
            int relativePos = mSection.keyAt(getRealPosition(position) - 1);
            return position - relativePos;
        }
    }

    public xcArticleSection.IParagraph getParagraph(int position) {
        xcArticleSection section = getItem(position);
        if (section.getType() == 1) {
            return section.getContentObject();
        }
        int relative = getParagraphPosition(position);
        xcArticleSection.IParagraph qq = (xcArticleSection.IParagraph) section.getContentArray().get(relative);

        return (xcArticleSection.IParagraph) section.getContentArray().get(getParagraphPosition(position));
    }

    @Override
    public int getItemViewType(int position) {
        if (super.getItemViewType(position) == RENDER_TYPE_HEADER) {
            return super.getItemViewType(position);
        }
        xcArticleSection section = getItem(position);
        switch (section.getType()) {
            case 2:
                return TYPE_TEXT;
            case 3:
                return TYPE_IMAGE;
            default:
                return 4;
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
            case TYPE_TEXT:
                xcArticleSectionTextRender text = new xcArticleSectionTextRender(viewGroup, this);
                AbstractViewHolder textholder = text.getReusableComponent();
                textholder.itemView.setTag(android.support.design.R.id.list_item, text);
                return textholder;
            case TYPE_IMAGE:
                xcArticleSectionImageRender image = new xcArticleSectionImageRender(viewGroup, this);
                AbstractViewHolder imgHolder = image.getReusableComponent();
                imgHolder.itemView.setTag(android.support.design.R.id.list_item, image);
                return imgHolder;
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