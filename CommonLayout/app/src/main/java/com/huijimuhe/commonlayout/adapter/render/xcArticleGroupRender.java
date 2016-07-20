package com.huijimuhe.commonlayout.adapter.render;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.data.xc.xcArticleGroup;
import com.huijimuhe.commonlayout.data.xc.xcArticleSection;


/**
 * Created by Huijimuhe on 2016/6/11.
 * enjoy
 */
public class xcArticleGroupRender extends AbstractRender {
    private ViewHolder mHolder;
    private AbstractRenderAdapter mAdapter;

    public xcArticleGroupRender(ViewGroup parent, AbstractRenderAdapter adapter) {
        this.mAdapter = adapter;
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_listitem_subject, parent, false);
        this.mHolder = new ViewHolder(v, adapter);
    }


    @Override
    public void bindData(int position) {
        xcArticleGroup data=(xcArticleGroup)mAdapter.getItem(position);
        mHolder.mTvTitle.setText(data.getTitle());
        mHolder.mTvSubTitle.setText(data.getSub_title());
    }

    @Override
    public AbstractViewHolder getReusableComponent() {
        return this.mHolder;
    }

    public class ViewHolder extends AbstractViewHolder {
        public TextView mTvTitle;
        public TextView mTvSubTitle;

        public ViewHolder(View v, final AbstractRenderAdapter adapter) {
            super(v);
            mTvTitle=(TextView)v.findViewById(R.id.subject_item_title);
            mTvSubTitle=(TextView)v.findViewById(R.id.subject_item_subtitle);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapter.mOnItemClickListener.onItemClick(v, getLayoutPosition());
                }
            });
        }
    }
}
