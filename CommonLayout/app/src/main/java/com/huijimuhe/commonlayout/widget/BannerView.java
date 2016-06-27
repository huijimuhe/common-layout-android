package com.huijimuhe.commonlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.data.xc.xcBanner;
import com.huijimuhe.commonlayout.presenter.xc.xcContract;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * <p/>
 * Contact: 20903213@qq.com Zengweizhou
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class BannerView extends BGABanner {
    private BannerClickListener l;
    private Context mContext;

    public BannerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public BannerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mContext = context;
    }

    public void initBanners(List<xcBanner> banners) {
        List<View> views = new ArrayList<>();
        for (xcBanner banner : banners) {
            ImageView imageView =new ImageView(mContext);
            Glide.with(mContext)
                    .load(banner.getImage())
                    .centerCrop()
                    .into(imageView);
            imageView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    l.onClick(view);
                }
            });
            imageView.setTag(banner);
            views.add(imageView);
        }
        setViews(views);
    }

    public interface BannerClickListener {
        void onClick(View v);
    }

    public void setOnBannerClickListener(BannerClickListener l) {
        this.l = l;
    }
}
