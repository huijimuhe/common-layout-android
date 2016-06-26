package com.huijimuhe.commonlayout;

import android.app.Application;

public class AppContext extends Application {
    private static AppContext INSTANCE=null;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE=this;
    }

    public static AppContext getInstance(){return INSTANCE;}
}
