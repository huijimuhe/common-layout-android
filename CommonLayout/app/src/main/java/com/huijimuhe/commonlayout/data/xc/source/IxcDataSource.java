package com.huijimuhe.commonlayout.data.xc.source;


import com.huijimuhe.commonlayout.data.xc.xcDetailResponse;
import com.huijimuhe.commonlayout.data.xc.xcFeedResponse;
import com.huijimuhe.commonlayout.data.xc.xcFxResponse;
import com.huijimuhe.commonlayout.data.xc.xcJxResponse;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public interface IxcDataSource {

    interface JxListLoadCallBack {
        void onSuccess(xcJxResponse response);

        void onError(String msg);
    }

    interface FxListLoadCallBack {
        void onSuccess(xcFxResponse response);

        void onError(String msg);
    }

    interface FeedListLoadCallBack {
        void onSuccess(xcFeedResponse response);

        void onError(String msg);
    }
    interface DetailLoadCallBack {
        void onSuccess(xcDetailResponse response);

        void onError(String msg);
    }
}

