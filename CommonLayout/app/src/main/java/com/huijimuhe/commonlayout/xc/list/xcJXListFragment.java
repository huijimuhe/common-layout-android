package com.huijimuhe.commonlayout.xc.list;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.xcJxListAdapter;
import com.huijimuhe.commonlayout.adapter.xcJxHeaderSaleAdapter;
import com.huijimuhe.commonlayout.adapter.xcJxHeaderWeekAdapter;
import com.huijimuhe.commonlayout.data.xc.source.xcListRepository;
import com.huijimuhe.commonlayout.data.xc.xcArticle;
import com.huijimuhe.commonlayout.data.xc.xcArticleGroup;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;
import com.huijimuhe.commonlayout.data.xc.xcSale;
import com.huijimuhe.commonlayout.presenter.xc.xcJXListContract;
import com.huijimuhe.commonlayout.presenter.xc.xcJXListPresenter;
import com.huijimuhe.commonlayout.ui.base.xcAbLceListFragment;
import com.huijimuhe.commonlayout.xc.detail.xcDetailActivity;
import com.huijimuhe.commonlayout.widget.BannerView;
import com.huijimuhe.commonlayout.widget.NoScrollRecyclerView;
import com.huijimuhe.commonlayout.widget.SwitchTabView;

import java.util.ArrayList;
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
public class xcJXListFragment extends xcAbLceListFragment implements xcJXListContract.View {

    private xcJXListPresenter mPresenter;
    private HeaderViewWrapper mHeaderView;

    public static xcJXListFragment newInstance() {
        xcJXListFragment fragment = new xcJXListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPresenter = new xcJXListPresenter(this, new xcListRepository());
        mPresenter.start();

        mTabView.setOnTabSelectedListener(new SwitchTabView.TabSelectedListener() {
            @Override
            public void onIndexChange(int original, int current) {
                mPresenter.switchAdapter(current);
                mHeaderView.tabView.setSelected(current);
            }

            @Override
            public void onItemChange(View item, int index) {

            }
        });

        loadData();
    }

    @Override
    public AbstractRenderAdapter getRecyclerAdapter() {
        return new xcJxListAdapter(new ArrayList<xcArticleGroup>());
    }

    @Override
    public void loadData() {
        mPresenter.load(getActivity());
    }

    @Override
    public void addHeaderView(View root) {
        mHeaderView = new HeaderViewWrapper(getActivity());
        mHeaderView.setOnHeaderViewWrapperClickListener(new HeaderViewWrapperClickListener() {
            @Override
            public void onTabChange(int index) {
                mTabView.setSelected(index);
                mPresenter.switchAdapter(index);
            }

            @Override
            public void onSaleClick(View view) {

            }

            @Override
            public void onArticleClick(View view) {
                getActivity().startActivity(xcDetailActivity.newIntent());
            }
        });
        mAdapter.setHeaderView(mHeaderView.getRoot());
    }

    @Override
    public void onItemNormalClick(View view, int postion) {
        getActivity().startActivity(xcDetailActivity.newIntent());
    }

    @Override
    public void onItemFunctionClick(View view, int postion, int type) {

    }

    @Override
    public void updateHeader(xcIndexResponse response) {
        mHeaderView.update(response);
    }

    @Override
    public void updateList(List<xcArticleGroup> list, boolean isSectionHeaderShown) {
        mAdapter.replace(list,isSectionHeaderShown);
    }

    @Override
    public void showSwipe(boolean isActive) {
        showSwipeView(isActive);
    }

    @Override
    public void showLoading(boolean isActive) {
        showLoadingView();
    }

    @Override
    public void showError() {
        showEmptyView();
    }

    @Override
    public void showContainer() {
        showContentView();
    }

    @Override
    public void switchListAdapter(int index) {

    }

    private class HeaderViewWrapper {
        private BannerView banner;
        private NoScrollRecyclerView saleList;
        private RecyclerView weekList;
        private SwitchTabView tabView;
        private xcJxHeaderSaleAdapter saleAdapter;
        private xcJxHeaderWeekAdapter weekAdapter;
        private HeaderViewWrapperClickListener l;
        private LinearLayout root;

        public HeaderViewWrapper(Context context) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.xc_listheader_jx_list, mRecyclerView, false);
            initUI(root, context);
        }

        public void setOnHeaderViewWrapperClickListener(HeaderViewWrapperClickListener l) {
            this.l = l;
        }

        public View getRoot() {
            return root;
        }

        public void initUI(View view, Context context) {

            /**Banner*/
            banner = (BannerView) view.findViewById(R.id.advertise_banner);
            banner.setOnBannerClickListener(new BannerView.BannerClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            /**Sale list*/
            saleList = (NoScrollRecyclerView) view.findViewById(R.id.sale_list);
            LinearLayoutManager saleManager = new LinearLayoutManager(context);
            saleManager.setOrientation(LinearLayoutManager.VERTICAL);
            saleList.setLayoutManager(saleManager);

            saleAdapter = new xcJxHeaderSaleAdapter(new ArrayList<xcSale>(), context);
            saleAdapter.setOnItemClickListener(new AbstractAdapter.onItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    l.onSaleClick(view);
                }
            });
            saleList.setAdapter(saleAdapter);

            /**Week list*/
            weekList = (RecyclerView) view.findViewById(R.id.week_list);
            LinearLayoutManager weekManager = new LinearLayoutManager(context);
            weekManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            weekList.setLayoutManager(weekManager);

            weekAdapter = new xcJxHeaderWeekAdapter(new ArrayList<xcArticle>(), context);
            weekAdapter.setOnItemClickListener(new AbstractAdapter.onItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    l.onArticleClick(view);
                }
            });
            weekList.setAdapter(weekAdapter);

            /**tab items*/
            tabView = (SwitchTabView) view.findViewById(R.id.handpick_tab);
            tabView.setOnTabSelectedListener(new SwitchTabView.TabSelectedListener() {
                @Override
                public void onIndexChange(int original, int current) {
                    if (original != current)
                        l.onTabChange(current);
                }

                @Override
                public void onItemChange(View item, int index) {
                    Log.d("TEST", "clicked:" + String.valueOf(index));
                }
            });
        }

        public void update(xcIndexResponse dummy) {
            /**Banner*/
            banner.initBanners(dummy.getAds_top());
            /**Sale list*/
            saleAdapter.replace(dummy.getSales());
            /**Week list*/
            weekAdapter.replace(dummy.getWeek_praise());
        }
    }

    public interface HeaderViewWrapperClickListener {
        void onTabChange(int index);

        void onSaleClick(View view);

        void onArticleClick(View view);
    }
}
