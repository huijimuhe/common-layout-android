package com.huijimuhe.commonlayout.presenter.xc;

import android.content.Context;

import com.huijimuhe.commonlayout.data.xc.source.IxcDataSource;
import com.huijimuhe.commonlayout.data.xc.source.xcListRepository;
import com.huijimuhe.commonlayout.data.xc.xcArticleGroup;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcJXListPresenter implements xcJXListContract.Presenter {

    private xcListRepository mRepo;
    private xcJXListContract.View mView;
    private int mTabIndex = 0;
    private xcIndexResponse mData;

    public xcJXListPresenter(xcJXListContract.View view, xcListRepository repo) {
        this.mView = view;
        this.mRepo = repo;
    }

    @Override
    public void start() {
        mView.showContainer();
    }

    @Override
    public void load(Context context) {
        mView.showSwipe(true);
        mRepo.load(context, new IxcDataSource.ListLoadCallBack() {
            @Override
            public void onSuccess(xcIndexResponse response) {
                mData = response;
                switchAdapter(mTabIndex);
                mView.updateHeader(mData);
                mView.showSwipe(false);
            }

            @Override
            public void onError(String msg) {
                mView.showSwipe(false);
            }
        });
    }

    @Override
    public void switchAdapter(int index) {

        mTabIndex = index;
        List<xcArticleGroup> data = new ArrayList<>();
        switch (mTabIndex) {
            case 0:
                data = mData.getSubjects();
                mView.updateList(data, true);
                break;
            case 1:
                xcArticleGroup group = new xcArticleGroup();
                group.setArticles(mData.getFoods());
                data.add(group);
                mView.updateList(data, false);
                break;
            case 2:
                xcArticleGroup group2 = new xcArticleGroup();
                group2.setArticles(mData.getPlays());
                data.add(group2);
                mView.updateList(data, false);
                break;
        }
    }
}
