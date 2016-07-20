package com.huijimuhe.commonlayout.xc.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.xcFeedListAdapter;
import com.huijimuhe.commonlayout.adapter.xcJxListAdapter;
import com.huijimuhe.commonlayout.data.xc.source.IxcDataSource;
import com.huijimuhe.commonlayout.data.xc.source.xcFeedListRepository;
import com.huijimuhe.commonlayout.data.xc.source.xcFxListRepository;
import com.huijimuhe.commonlayout.data.xc.source.xcJxListRepository;
import com.huijimuhe.commonlayout.data.xc.xcArticleGroup;
import com.huijimuhe.commonlayout.data.xc.xcFeed;
import com.huijimuhe.commonlayout.data.xc.xcFeedResponse;
import com.huijimuhe.commonlayout.data.xc.xcFxResponse;
import com.huijimuhe.commonlayout.presenter.xc.xcJXListPresenter;
import com.huijimuhe.commonlayout.ui.base.xcAbLceListFragment;
import com.huijimuhe.commonlayout.widget.SwitchTabView;

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
public class xcFeedListFragment extends xcAbLceListFragment {

    public static xcFeedListFragment newInstance() {
        xcFeedListFragment fragment = new xcFeedListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showContentView();
    }

    @Override
    public void onResume() {
        super.onResume();
        loadData();
    }

    @Override
    public AbstractRenderAdapter getRecyclerAdapter() {
        return new xcFeedListAdapter(new ArrayList<xcFeed>());
    }

    @Override
    public void loadData() {
        showSwipeView(true);
        new xcFeedListRepository().load(getActivity(), new IxcDataSource.FeedListLoadCallBack() {
            @Override
            public void onSuccess(xcFeedResponse response) {
                mAdapter.replace(response.getContents());
                showSwipeView(false);
            }

            @Override
            public void onError(String msg) {
                showSwipeView(false);
            }
        });
    }

    @Override
    public void addHeaderView(View root) {

    }

    @Override
    public void onItemNormalClick(View view, int postion) {

    }

    @Override
    public void onItemFunctionClick(View view, int postion, int type) {

    }
}
