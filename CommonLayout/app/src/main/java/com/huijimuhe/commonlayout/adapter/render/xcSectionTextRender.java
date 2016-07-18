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
import com.huijimuhe.commonlayout.data.xc.xcArticle;
import com.huijimuhe.commonlayout.data.xc.xcSection;
import com.huijimuhe.commonlayout.widget.LikeButtonList;


/**
 * Created by Huijimuhe on 2016/6/11.
 * This is a part of Homedev
 * enjoy
 */
public class xcSectionTextRender extends AbstractRender {
    private ViewHolder mHolder;
    private AbstractRenderAdapter mAdapter;

    public xcSectionTextRender(ViewGroup parent, AbstractRenderAdapter adapter) {
        this.mAdapter = adapter;
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_listitem_article, parent, false);
        this.mHolder = new ViewHolder(v, adapter);
    }


    @Override
    public void bindData(int position) {
        xcSection<xcSection.xcText> data=(xcSection)mAdapter.getItem(position);
        mHolder.mTvText.setText(data.getContentArray().get(position).getText());
    }

    @Override
    public AbstractViewHolder getReusableComponent() {
        return this.mHolder;
    }

    public class ViewHolder extends AbstractViewHolder {
        public TextView mTvText;

        public ViewHolder(View v, final AbstractRenderAdapter adapter) {
            super(v);
            mTvText=(TextView)v.findViewById(R.id.article_title);

        }
    }
}
