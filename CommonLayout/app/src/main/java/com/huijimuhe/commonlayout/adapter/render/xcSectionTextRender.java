package com.huijimuhe.commonlayout.adapter.render;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.xcSectionAdapter;
import com.huijimuhe.commonlayout.data.xc.xcSection;


/**
 * Created by Huijimuhe on 2016/6/11.
 * This is a part of Homedev
 * enjoy
 */
public class xcSectionTextRender extends AbstractRender {
    private ViewHolder mHolder;
    private xcSectionAdapter mAdapter;

    public xcSectionTextRender(ViewGroup parent, xcSectionAdapter adapter) {
        this.mAdapter = adapter;
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_layout_section_text, parent, false);
        this.mHolder = new ViewHolder(v, adapter);
    }


    @Override
    public void bindData(int position) {
        xcSection.xcText data=(xcSection.xcText)mAdapter.getParagraph(position);
        mHolder.mTvText.setText(data.getText());
    }

    @Override
    public AbstractViewHolder getReusableComponent() {
        return this.mHolder;
    }

    public class ViewHolder extends AbstractViewHolder {
        public TextView mTvText;

        public ViewHolder(View v, final AbstractRenderAdapter adapter) {
            super(v);
            mTvText=(TextView)v.findViewById(R.id.section_text);

        }
    }
}
