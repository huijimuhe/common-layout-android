package com.huijimuhe.commonlayout.adapter.render;

import android.view.View;

import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;


/**
 * Created by Huijimuhe on 2016/6/11.
 * This is a part of Homedev
 * enjoy
 */
public class HeaderRender extends AbstractRender {
    private ViewHolder mHolder;

    public HeaderRender(View parent) {
        this.mHolder = new ViewHolder(parent);
    }


    @Override
    public void bindData(int position) {
    }

    @Override
    public AbstractViewHolder getReusableComponent() {
        return this.mHolder;
    }

    public class ViewHolder extends AbstractViewHolder {
        public ViewHolder(View v) {
            super(v);
        }
    }
}
