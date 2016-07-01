package com.huijimuhe.commonlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huijimuhe.commonlayout.R;

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
public class TabItem extends RelativeLayout {

    TextView mTvTitle;
    ImageView mIvDvider;
    String mTitle;
    float mNormalTextSize;
    float mSelectedTextSize;

    public TabItem(Context context) {
        super(context);
        init(context, null);
    }

    public TabItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public TabItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(context,R.layout.xc_layout_tab_item,this);
        mTvTitle =(TextView) findViewById(R.id.tab_text);
        mIvDvider=(ImageView)findViewById(R.id.tab_line);

        if (attrs == null)
            return;
        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs,
                R.styleable.TabItem, 0, 0);
        try {
            mTitle = a.getString(R.styleable.TabItem_titleTabText);
            mNormalTextSize = a.getDimension(R.styleable.TabItem_titleNormalTextSize, 0);
            mSelectedTextSize = a.getDimension(R.styleable.TabItem_titleSelectedTextSize, 0);
            mIvDvider.setBackgroundResource(a.getResourceId(R.styleable.TabItem_titleDivider,0));
            mIvDvider.getLayoutParams().height=4;
            mTvTitle.setText(mTitle);
            mTvTitle.setTextColor(a.getColorStateList(R.styleable.TabItem_titleColor));
        } finally {
            a.recycle();
        }

    }

    public void setSelected(boolean active) {
        mTvTitle.setSelected(active);
        if (active) {
            mTvTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX,mSelectedTextSize);
        } else {
            mTvTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX,mNormalTextSize);
        }
    }
}
