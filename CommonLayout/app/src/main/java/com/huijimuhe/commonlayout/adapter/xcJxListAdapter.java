package com.huijimuhe.commonlayout.adapter;

import android.annotation.TargetApi;
import android.view.ViewGroup;

import com.huijimuhe.commonlayout.adapter.base.AbstractRender;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractViewHolder;
import com.huijimuhe.commonlayout.adapter.render.xcArticleRender;
import com.huijimuhe.commonlayout.adapter.render.xcArticleGroupRender;
import com.huijimuhe.commonlayout.data.xc.xcArticle;
import com.huijimuhe.commonlayout.data.xc.xcArticleGroup;

import java.util.List;

public class xcJxListAdapter extends AbstractRenderAdapter<xcArticleGroup> {
    public static final int TYPE_SECTION = 1 << 1;
    public static final int TYPE_ARTICLE = 1 << 2;

    public xcJxListAdapter(List<xcArticleGroup> data) {
        this.mDataset = data;
    }

    public xcArticle getArticle(int position) {
        //去掉头的影响
        if (hasHeaderView() && position != 0) {
            position -= 1;
        }

        if (!mIsSectionHeadShown) {
            return mDataset.get(0).getArticles().get(position);
        } else {
            int group =(int) Math.floor(position / 5);
            int relativePos = position - 5 * group-1;
            xcArticle test = mDataset.get(group).getArticles().get(relativePos);
            return test;
        }
    }

    @Override
    public int getItemCount() {
        int size = 0;

        if (hasHeaderView()) {
            size++;
        }

        if (!mIsSectionHeadShown) {
            size = mDataset.get(0).getArticles().size();
        } else {
            for (xcArticleGroup group : mDataset) {
                size += group.getArticles().size() + 1;
            }
        }
        return size;
    }

    @Override
    public int getRealPosition(int position) {
        //去掉头的影响
        if (hasHeaderView() && position != 0) {
            position -= 1;
        }
        int pos = position % 5;
        return pos;
    }

    @Override
    public int getItemViewType(int position) {
        if (super.getItemViewType(position) == RENDER_TYPE_HEADER) {
            return super.getItemViewType(position);
        }

        int pos = getRealPosition(position);

        if (!mIsSectionHeadShown) {
            return TYPE_ARTICLE;
        } else {
            if (pos % 5 == 0) {
                return TYPE_SECTION;
            } else {
                return TYPE_ARTICLE;
            }
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
            case TYPE_SECTION:
                xcArticleGroupRender section = new xcArticleGroupRender(viewGroup, this);
                AbstractViewHolder sectionHolder = section.getReusableComponent();
                sectionHolder.itemView.setTag(android.support.design.R.id.list_item, section);
                return sectionHolder;
            case TYPE_ARTICLE:
                xcArticleRender article = new xcArticleRender(viewGroup, this);
                AbstractViewHolder articleHolder = article.getReusableComponent();
                articleHolder.itemView.setTag(android.support.design.R.id.list_item, article);
                return articleHolder;
        }
        return null;
    }

    @TargetApi(4)
    public void onBindViewHolder(AbstractViewHolder holder, int position) {
        AbstractRender render = (AbstractRender) holder.itemView.getTag(android.support.design.R.id.list_item);
        render.bindData(position);
    }

}
