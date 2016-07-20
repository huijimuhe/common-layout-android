package com.huijimuhe.commonlayout.presenter.xc;


import android.content.Context;

import com.huijimuhe.commonlayout.data.xc.xcDetailResponse;
import com.huijimuhe.commonlayout.presenter.BasePresenter;
import com.huijimuhe.commonlayout.presenter.BaseView;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcDetailContract {

    public interface View extends BaseView<Presenter> {
        void showContainer(xcDetailResponse response);
    }

    public interface Presenter extends BasePresenter {
        void load(Context context);
    }
}
