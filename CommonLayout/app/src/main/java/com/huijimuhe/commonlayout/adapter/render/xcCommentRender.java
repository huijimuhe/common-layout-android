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
import com.huijimuhe.commonlayout.data.xc.xcArticle;
import com.huijimuhe.commonlayout.data.xc.xcComment;
import com.huijimuhe.commonlayout.utils.ViewUtility;
import com.huijimuhe.commonlayout.widget.LikeButtonList;


/**
 * Created by Huijimuhe on 2016/6/11.
 * This is a part of Homedev
 * enjoy
 */
public class xcCommentRender extends AbstractRender {
    private ViewHolder mHolder;
    private AbstractRenderAdapter mAdapter;

    public xcCommentRender(ViewGroup parent, AbstractRenderAdapter adapter) {
        this.mAdapter = adapter;
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.xc_listitem_comment, parent, false);
        this.mHolder = new ViewHolder(v, adapter);
    }


    @Override
    public void bindData(int position) {
        xcComment data = (xcComment) mAdapter.getItem(position);
        if(position==1){
            mHolder.mTitleLayout.setVisibility(View.VISIBLE);
        }
        mHolder.mTvName.setText(data.getAccount().getNickname());
        mHolder.mTvBody.setText(data.getComment());
        mHolder.mTvTime.setText(data.getCreate_time());
        mHolder.mTvFloor.setText(String.valueOf(position));
        Glide.with(AppContext.getInstance().getApplicationContext()).load(data.getAccount().getImage()).into(mHolder.mIvAvatar);
    }

    @Override
    public AbstractViewHolder getReusableComponent() {
        return this.mHolder;
    }

    public class ViewHolder extends AbstractViewHolder {
        public TextView mTvName;
        public TextView mTvTime;
        public TextView mTvFloor;
        public TextView mTvBody;
        public ImageView mIvAvatar;
        public LinearLayout mTitleLayout;

        public ViewHolder(View v, final AbstractRenderAdapter adapter) {
            super(v);
            mTitleLayout=ViewUtility.findViewById(v,R.id.comment_title);
            mTvName = ViewUtility.findViewById(v, R.id.user_name);
            mTvTime = ViewUtility.findViewById(v, R.id.create_time);
            mTvFloor = ViewUtility.findViewById(v, R.id.floor_count);
            mTvBody = ViewUtility.findViewById(v, R.id.comment_content);
            mIvAvatar = ViewUtility.findViewById(v, R.id.comment_author_header);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapter.mOnItemClickListener.onItemClick(v, getLayoutPosition());
                }
            });
        }
    }
}
