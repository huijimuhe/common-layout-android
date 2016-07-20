package com.huijimuhe.commonlayout.presenter.xc;


import android.content.Context;

import com.huijimuhe.commonlayout.data.xc.xcArticleGroup;
import com.huijimuhe.commonlayout.data.xc.xcJxResponse;
import com.huijimuhe.commonlayout.presenter.BasePresenter;
import com.huijimuhe.commonlayout.presenter.BaseView;

import java.util.List;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcJXListContract {

    public interface View extends BaseView<Presenter> {
        void showSwipe(boolean isActive);

        void showContainer();

        void updateHeader(xcJxResponse response);

        void updateList(List<xcArticleGroup> list, boolean isSectionHeaderShown);

        void switchListAdapter(int index);
    }

    public interface Presenter extends BasePresenter {
        void load(Context context);

        void switchAdapter(int index);
    }
}
