package com.huijimuhe.commonlayout.ui.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.xcArticleAdapter;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.data.xc.source.xcRepository;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;
import com.huijimuhe.commonlayout.presenter.xc.xcContract;
import com.huijimuhe.commonlayout.presenter.xc.xcPresenter;
import com.huijimuhe.commonlayout.ui.base.abLceListFragment;

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
public class XCListFragment extends abLceListFragment implements xcContract.View {

    private xcPresenter mPresenter;

    public static XCListFragment newInstance() {
        XCListFragment fragment = new XCListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPresenter=new xcPresenter(this,new xcRepository());
        mPresenter.start();
    }

    @Override
    public AbstractRenderAdapter getRecyclerAdapter() {
        return new xcArticleAdapter(new xcIndexResponse(), xcArticleAdapter.TYPE_SUBJECTS);
    }

    @Override
    public void loadData() {
        mPresenter.load(getActivity());
    }

    @Override
    public void addHeaderView(View root) {
      View v=  LayoutInflater.from(getActivity()).inflate(R.layout.listheader_xc,mRecyclerView,false);
    }

    @Override
    public void onItemNormalClick(View view, int postion) {

    }

    @Override
    public void onItemFunctionClick(View view, int postion, int type) {

    }

    @Override
    public void showList(xcIndexResponse response) {

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
    public void showContent() {
        showContent();
    }
}
