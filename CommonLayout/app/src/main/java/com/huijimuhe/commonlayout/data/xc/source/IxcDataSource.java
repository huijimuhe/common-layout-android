package com.huijimuhe.commonlayout.data.xc.source;


import com.huijimuhe.commonlayout.data.xc.xcDetailResponse;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public interface IxcDataSource {

    interface ListLoadCallBack {
        void onSuccess(xcIndexResponse response);

        void onError(String msg);
    }

    interface DetailLoadCallBack {
        void onSuccess(xcDetailResponse response);

        void onError(String msg);
    }
}

