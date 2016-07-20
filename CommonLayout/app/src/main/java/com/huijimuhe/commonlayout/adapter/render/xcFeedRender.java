package com.huijimuhe.commonlayout.adapter.render;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.huijimuhe.commonlayout.AppContext;
import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.data.xc.xcComment;
import com.huijimuhe.commonlayout.data.xc.xcFeed;
import com.huijimuhe.commonlayout.utils.ViewUtility;
import com.huijimuhe.commonlayout.widget.NineGridLayout;


/**
 * Created by Huijimuhe on 2016/6/11.
 * This is a part of Homedev
 * enjoy
 */
public class xcFeedRender extends AbstractRender {
    private ViewHolder mHolder;
    private AbstractRenderAdapter mAdapter;

    public xcFeedRender(ViewGroup parent, AbstractRenderAdapter adapter) {
        this.mAdapter = adapter;
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_listitem_feed, parent, false);
        this.mHolder = new ViewHolder(v, adapter);
    }


    @Override
    public void bindData(int position) {
        xcFeed data = (xcFeed) mAdapter.getItem(position);
        mHolder.mTvName.setText(data.getAccount().getNickname());
        mHolder.mTvBody.setText(data.getContent());
        mHolder.mTvTime.setText(data.getCreate_time());
        mHolder.mImgGrid.setList(data.getImageUrlList());
        Glide.with(AppContext.getInstance().getApplicationContext()).load(data.getAccount().getImage()).into(mHolder.mIvAvatar);
    }

    @Override
    public AbstractViewHolder getReusableComponent() {
        return this.mHolder;
    }

    public class ViewHolder extends AbstractViewHolder {
        public TextView mTvName;
        public TextView mTvTime;
        public ImageView mIvAvatar;
        public TextView mTvBody;
        public NineGridLayout mImgGrid;

        public ViewHolder(View v, final AbstractRenderAdapter adapter) {
            super(v);
            mTvName = ViewUtility.findViewById(v, R.id.feed_list_author_name);
            mTvTime = ViewUtility.findViewById(v, R.id.feed_list_author_time);
            mImgGrid = ViewUtility.findViewById(v, R.id.feed_list_grid_layout);
            mTvBody = ViewUtility.findViewById(v, R.id.feed_list_text);
            mIvAvatar = ViewUtility.findViewById(v, R.id.feed_list_author_header);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapter.mOnItemClickListener.onItemClick(v, getLayoutPosition());
                }
            });
            mImgGrid.setOnItemClickListener(new NineGridLayout.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {

                }
            });
        }
    }
}
