package com.huijimuhe.commonlayout.data.xc.source;

import android.content.Context;

import com.google.gson.Gson;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcListRepository {

    public void load(Context context, final IxcDataSource.ListLoadCallBack callback){
        String dummy=readDummy(context);
        try {
            JSONObject json=new JSONObject(dummy);
            callback.onSuccess(new Gson().fromJson(json.getString("data"),xcIndexResponse.class));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String readDummy(Context context){
        try {
            InputStreamReader inputReader = new InputStreamReader(context.getAssets().open("xc_list_dummy.txt"));
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
