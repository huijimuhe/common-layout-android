package com.huijimuhe.commonlayout.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * <p>
 * Contact: 20903213@qq.com Zengweizhou
 * <p>
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
public abstract class abLceListFragment extends Fragment {

    private View mContentView;
    private View mErrorView;
    private View mLoadingView;
    protected SwipeRefreshLayout mSwipeRefreshLayout;
    protected RecyclerView mRecyclerView;
    protected AbstractRenderAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_list,null);

        //Lce
        mContentView=v.findViewById(R.id.contentview);
        mErrorView=v.findViewById(R.id.emptyview);
        mLoadingView=v.findViewById(R.id.loadingview);

        //swipe refresh layout
        mSwipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.swipe_container);
        mSwipeRefreshLayout.setColorSchemeResources(android.R.color.darker_gray);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadData();
            }
        });

        //recycler view
        mRecyclerView = (RecyclerView)v.findViewById(R.id.listview);
        LinearLayoutManager  mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //set adapter
        mAdapter = getRecyclerAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new AbstractRenderAdapter.onItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                onItemNormalClick(view, postion);
            }
        });
        mAdapter.setOnItemFunctionClickListener(new AbstractRenderAdapter.onItemFunctionClickListener() {
            @Override
            public void onClick(View view, int postion, int type) {
                onItemFunctionClick(view, postion, type);
            }
        });

        addHeaderView(v);
        return v;
    }


    @UiThread
    protected void showLoadingView(){
        mContentView.setVisibility(View.GONE);
        mErrorView.setVisibility(View.GONE);
        mLoadingView.setVisibility(View.VISIBLE);
    }

    @UiThread
    protected void showSwipeView(final boolean active){
        mSwipeRefreshLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                mSwipeRefreshLayout.setRefreshing(active);
                mSwipeRefreshLayout.setEnabled(!active);
            }
        }, 500);
    }
    @UiThread
    protected void showEmptyView(){
        mContentView.setVisibility(View.VISIBLE);
        mErrorView.setVisibility(View.GONE);
        mLoadingView.setVisibility(View.GONE);
    }

    @UiThread
    protected void showContentView(){
        mContentView.setVisibility(View.GONE);
        mErrorView.setVisibility(View.VISIBLE);
        mLoadingView.setVisibility(View.GONE);
    }

    public abstract AbstractRenderAdapter getRecyclerAdapter();

    public abstract void loadData();

    public abstract void addHeaderView(View root);

    public abstract void onItemNormalClick(View view, int postion);

    public abstract void onItemFunctionClick(View view, int postion, int type);

}
