package com.huijimuhe.commonlayout.data.xc.source;

import android.content.Context;

import com.google.gson.Gson;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcRepository {

    public void load(Context context, final IxcDataSource.LoadCallBack callback){
        String dummy=readDummy(context);
        callback.onSuccess(new Gson().fromJson(dummy,xcIndexResponse.class));
    }

    private String readDummy(Context context){
        try {
            InputStreamReader inputReader = new InputStreamReader(context.getAssets().open("data.txt"));
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line="";
            String Result="";
            while((line = bufReader.readLine()) != null) {
                Result += line;
            }
            return Result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
