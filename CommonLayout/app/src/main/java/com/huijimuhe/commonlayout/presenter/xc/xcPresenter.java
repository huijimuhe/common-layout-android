package com.huijimuhe.commonlayout.presenter.xc;

import android.content.Context;

import com.huijimuhe.commonlayout.data.xc.source.IxcDataSource;
import com.huijimuhe.commonlayout.data.xc.source.xcRepository;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcPresenter implements xcContract.Presenter {

    private xcRepository mRepo;
    private xcContract.View mView;

    public xcPresenter(xcContract.View view, xcRepository repo) {
        this.mView=view;
        this.mRepo = repo;
    }

    @Override
    public void start() {
        mView.showContainer();
    }

    @Override
    public void load(Context context) {
        mView.showSwipe(true);
        mRepo.load(context, new IxcDataSource.LoadCallBack() {
            @Override
            public void onSuccess(xcIndexResponse response) {
                mView.showSwipe(false);
                mView.updateList(response);
            }

            @Override
            public void onError(String msg) {
                mView.showSwipe(false);
            }
        });
    }

    @Override
    public void switchAdapter(int index) {

    }
}
