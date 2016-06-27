package com.huijimuhe.commonlayout.presenter.xc;


import android.content.Context;

import com.huijimuhe.commonlayout.data.xc.source.IxcDataSource;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;
import com.huijimuhe.commonlayout.presenter.BasePresenter;
import com.huijimuhe.commonlayout.presenter.BaseView;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcContract {

    public interface View extends BaseView<Presenter> {
        void showList(xcIndexResponse response);
    }

    public interface Presenter extends BasePresenter {
        void load(Context context);
    }
}
