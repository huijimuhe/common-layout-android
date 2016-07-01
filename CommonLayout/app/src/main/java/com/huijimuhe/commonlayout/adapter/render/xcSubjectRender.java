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
import com.huijimuhe.commonlayout.widget.LikeButtonList;


/**
 * Created by Huijimuhe on 2016/6/11.
 * This is a part of Homedev
 * enjoy
 */
public class xcSubjectRender extends AbstractRender {
    private ViewHolder mHolder;
    private AbstractRenderAdapter mAdapter;

    public xcSubjectRender(ViewGroup parent, AbstractRenderAdapter adapter) {
        this.mAdapter = adapter;
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_listitem_article, parent, false);
        this.mHolder = new ViewHolder(v, adapter);
    }


    @Override
    public void bindData(int position) {
        xcArticle data=(xcArticle)mAdapter.getItem(position);
        mHolder.mTvTitle.setText(data.getTitle());
        mHolder.mTvSubTitle.setText(String.format("距离-%s",data.getSub_title()));
        mHolder.mLikeList.setText(String.valueOf(data.getPraise_count()));
        Glide.with(AppContext.getInstance().getApplicationContext()).load(data.getFull_image()).into(mHolder.mIvBanner);
    }

    @Override
    public AbstractViewHolder getReusableComponent() {
        return this.mHolder;
    }

    public class ViewHolder extends AbstractViewHolder {
        public TextView mTvTitle;
        public TextView mTvSubTitle;
        public ImageView mIvBanner;
        public LikeButtonList mLikeList;

        public ViewHolder(View v, final AbstractRenderAdapter adapter) {
            super(v);
            mTvTitle=(TextView)v.findViewById(R.id.article_title);
            mTvSubTitle=(TextView)v.findViewById(R.id.article_sub_title);
            mLikeList=(LikeButtonList)v.findViewById(R.id.article_praise);
            mIvBanner=(ImageView)v.findViewById(R.id.article_image);
            mLikeList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //  adapter.mOnItemFunctionClickListener.onClick(view,getLayoutPosition());
                }
            });
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapter.mOnItemClickListener.onItemClick(v, getLayoutPosition());
                }
            });
        }
    }
}
