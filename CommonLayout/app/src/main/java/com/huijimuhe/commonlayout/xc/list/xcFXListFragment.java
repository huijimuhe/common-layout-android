package com.huijimuhe.commonlayout.xc.list;

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
import com.huijimuhe.commonlayout.adapter.xcFxListAdapter;
import com.huijimuhe.commonlayout.data.xc.source.IxcDataSource;
import com.huijimuhe.commonlayout.data.xc.source.xcFxListRepository;
import com.huijimuhe.commonlayout.data.xc.xcFeature;
import com.huijimuhe.commonlayout.data.xc.xcFxResponse;

import java.util.ArrayList;

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
public class xcFXListFragment extends Fragment {

    protected SwipeRefreshLayout mSwipeRefreshLayout;
    protected RecyclerView mRecyclerView;
    private xcFxListAdapter mAdapter;

    public static xcFXListFragment newInstance() {
        xcFXListFragment fragment = new xcFXListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.xc_fragment_fx, null);

        //swipe refresh layout
        mSwipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.discover_pull_layout);
        mSwipeRefreshLayout.setColorSchemeResources(android.R.color.darker_gray);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                showSwipeView(false);
                //loadData();
            }
        });

        //recycler view
        mRecyclerView = (RecyclerView) v.findViewById(R.id.hot_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        //set adapter
        mAdapter = new xcFxListAdapter(new ArrayList<xcFeature>(), getActivity());
        mRecyclerView.setAdapter(mAdapter);

        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        showSwipeView(true);
        new xcFxListRepository().load(getActivity(), new IxcDataSource.FxListLoadCallBack() {
            @Override
            public void onSuccess(xcFxResponse response) {
                mAdapter.replace(response.getFeatures());
                showSwipeView(false);
            }

            @Override
            public void onError(String msg) {
                showSwipeView(false);
            }
        });
    }

    @UiThread
    protected void showSwipeView(final boolean active) {
        mSwipeRefreshLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                mSwipeRefreshLayout.setRefreshing(active);
                mSwipeRefreshLayout.setEnabled(!active);
            }
        }, 500);
    }

}
