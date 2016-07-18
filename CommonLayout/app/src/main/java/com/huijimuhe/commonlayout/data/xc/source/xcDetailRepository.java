package com.huijimuhe.commonlayout.data.xc.source;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huijimuhe.commonlayout.data.xc.xcDetailResponse;
import com.huijimuhe.commonlayout.data.xc.xcSection;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Huijimuhe on 2016/6/26.
 * This is a part of Group
 * enjoy
 */
public class xcDetailRepository {

    public void load(Context context, final IxcDataSource.DetailLoadCallBack callback) {
        String dummy = readDummy(context);
        try {
            callback.onSuccess(new Gson().fromJson(dummy, xcDetailResponse.class));
        } catch (Exception e) {
            callback.onError("dd");
        }
    }

    public void loadBody(Context context) {
        String Result = "";
        try {
            InputStreamReader inputReader = new InputStreamReader(context.getAssets().open("xc_body_dummy.txt"));
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line = "";
            while ((line = bufReader.readLine()) != null) {
                Result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<xcSection> body = new Gson().fromJson(Result, new TypeToken<List<xcSection>>() {
        }.getType());

        int count=body.size();
    }

    private String readDummy(Context context) {
        try {
            InputStreamReader inputReader = new InputStreamReader(context.getAssets().open("xc_detail_dummy.txt"));
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
