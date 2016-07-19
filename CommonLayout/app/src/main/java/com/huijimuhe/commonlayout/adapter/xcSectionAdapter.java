package com.huijimuhe.commonlayout.adapter;

import android.annotation.TargetApi;
import android.support.v4.util.ArrayMap;
import android.view.ViewGroup;

import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.render.xcSectionImageRender;
import com.huijimuhe.commonlayout.adapter.render.xcSectionTextRender;
import com.huijimuhe.commonlayout.data.xc.xcSection;

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

    private ArrayMap<Integer, Integer> mSection;

    public xcSectionAdapter(List<xcSection> data) {
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

    public xcSection.IParagraph getParagraph(int position) {
        xcSection section = getItem(position);
        if (section.getType() == 1) {
            return section.getContentObject();
        }
        int relative = getParagraphPosition(position);
        xcSection.IParagraph qq = (xcSection.IParagraph) section.getContentArray().get(relative);

        return (xcSection.IParagraph) section.getContentArray().get(getParagraphPosition(position));
    }

    @Override
    public int getItemViewType(int position) {
        if (super.getItemViewType(position) == RENDER_TYPE_HEADER) {
            return super.getItemViewType(position);
        }
        xcSection section = getItem(position);
        switch (section.getType()) {
            case 2:
                return 2;
            case 3:
                return 3;
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
            case 2:
                xcSectionTextRender text = new xcSectionTextRender(viewGroup, this);
                AbstractViewHolder textholder = text.getReusableComponent();
                textholder.itemView.setTag(android.support.design.R.id.list_item, text);
                return textholder;
            case 3:
                xcSectionImageRender image = new xcSectionImageRender(viewGroup, this);
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