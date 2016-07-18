package com.huijimuhe.commonlayout.presenter.xc;

import android.content.Context;

import com.huijimuhe.commonlayout.data.xc.source.IxcDataSource;
import com.huijimuhe.commonlayout.data.xc.source.xcDetailRepository;
import com.huijimuhe.commonlayout.data.xc.source.xcListRepository;
import com.huijimuhe.commonlayout.data.xc.xcDetailResponse;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcDetailPresenter implements xcDetailContract.Presenter {

    private xcDetailRepository mRepo;
    private xcDetailContract.View mView;

    public xcDetailPresenter(xcDetailContract.View view, xcDetailRepository repo) {
        this.mView = view;
        this.mRepo = repo;
    }

    @Override
    public void start() {
    }

    @Override
    public void load(Context context) {
        mRepo.load(context, new IxcDataSource.DetailLoadCallBack() {
            @Override
            public void onSuccess(xcDetailResponse response) {
                mView.showContainer(response);
            }

            @Override
            public void onError(String msg) {
                mView.showError();
            }
        });
    }

}
