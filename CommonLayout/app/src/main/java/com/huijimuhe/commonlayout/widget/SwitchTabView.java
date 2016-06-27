package com.huijimuhe.commonlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

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
public class SwitchTabView extends LinearLayout implements View.OnClickListener {

    /**
     * 当前位置
     */
    private int mIndex;

    private TabSelectedListener l;

    public SwitchTabView(Context context) {
        this(context, null, 0);
    }

    public SwitchTabView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SwitchTabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int d = getChildCount();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    @Override
    public void onClick(View view) {
        setSelected(indexOfChild(view), true);
    }

    private void init() {
        mIndex = 0;
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setOnClickListener(this);
        }
        setSelected(0);
    }

    public void addTab(TabItem tab) {
        super.addView(tab);
        tab.setOnClickListener(this);
    }

    public void setSelected(int index, boolean active) {
        if ((index < 0) || (index >= getChildCount()) || (mIndex == index)) {
            return;
        }
        if ((l != null) && (active)) {
            l.onIndexChange(mIndex, index);
        }
        setSelected(index);
        mIndex = index;
        if ((l != null) && (active)) {
            l.onItemChange(getChildAt(index), index);
        }
    }

    protected void setSelected(int index) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setSelected(false);
        }
        getChildAt(index).setSelected(true);
    }

    public int getCurrentIndex() {
        return mIndex;
    }

    public void setOnTabSelectedListener(TabSelectedListener l) {
        this.l = l;
    }

    public interface TabSelectedListener {
        void onIndexChange(int original, int current);

        void onItemChange(View item, int index);
    }
}
