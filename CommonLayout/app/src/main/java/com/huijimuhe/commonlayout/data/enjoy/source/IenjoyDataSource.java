package com.huijimuhe.commonlayout.data.enjoy.source;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public interface IenjoyDataSource {

    interface LoadCallBack{
        void onSuccess();
        void onError(String msg);
    }
}
