package com.huijimuhe.commonlayout.xc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.xc.list.xcMeFragment;
import com.huijimuhe.commonlayout.xc.list.xcFXListFragment;
import com.huijimuhe.commonlayout.xc.list.xcJXListFragment;
import com.huijimuhe.commonlayout.xc.list.xcFeedListFragment;

import me.majiajie.pagerbottomtabstrip.Controller;
import me.majiajie.pagerbottomtabstrip.PagerBottomTabLayout;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectListener;

public class xcMainActivity extends AppCompatActivity {
    private final String TAG = xcMainActivity.class.getName();

    public static final int XC_JINGXUAN = 0x2;
    public static final int XC_FAXIAN = 0x2 << 1;
    public static final int XC_TANDIAN = 0x2 << 2;
    public static final int XC_WO = 0x2 << 3;

    private PagerBottomTabLayout mBottomBar;
    private SparseArray<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments();
        initTab();

        /**test*/
//        xcDetailRepository repo=new xcDetailRepository();
//        repo.loadBody(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    private void initFragments() {
        //set up mFragments
        mFragments = new SparseArray<>();

        //精选
        Fragment xc = getSupportFragmentManager().findFragmentByTag(String.valueOf(XC_JINGXUAN));
        if (xc == null) {
            xc = xcJXListFragment.newInstance();
        }
        mFragments.append(XC_JINGXUAN, xc);

        //发现
        Fragment enjoy = getSupportFragmentManager().findFragmentByTag(String.valueOf(XC_FAXIAN));
        if (enjoy == null) {
            enjoy = xcFXListFragment.newInstance();
        }
        mFragments.append(XC_FAXIAN, enjoy);

        //探店
        Fragment bt = getSupportFragmentManager().findFragmentByTag(String.valueOf(XC_TANDIAN));
        if (bt == null) {
            bt = xcFeedListFragment.newInstance();
        }
        mFragments.append(XC_TANDIAN, bt);

        //我
        Fragment about = getSupportFragmentManager().findFragmentByTag(String.valueOf(XC_WO));
        if (about == null) {
            about = xcMeFragment.newInstance();
        }
        mFragments.append(XC_WO, about);

        //add to activity
        for (int i = 0; i < mFragments.size(); i++) {
            Fragment f = mFragments.valueAt(i);
            if (!f.isAdded())
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, f, String.valueOf(mFragments.keyAt(i)))
                        .hide(f)
                        .commit();
        }
    }

    private void hideFragments() {
        for (int i = 0; i < mFragments.size(); i++) {
            Fragment f = mFragments.valueAt(i);
            if (f.isAdded())
                getSupportFragmentManager()
                        .beginTransaction()
                        .hide(f)
                        .commit();
        }

    }

    private void switchFragment(int position) {

        hideFragments();
        getSupportFragmentManager().beginTransaction().show(mFragments.get(position)).commit();
    }

    private void initTab() {
        mBottomBar = (PagerBottomTabLayout) findViewById(R.id.tab);
        Controller c = mBottomBar.builder()
                .addTabItem(android.R.drawable.ic_dialog_info, "精选")
                .addTabItem(android.R.drawable.ic_dialog_info, "发现")
                .addTabItem(android.R.drawable.ic_dialog_info, "探店")
                .addTabItem(android.R.drawable.ic_dialog_info, "我")
                .build();

        c.addTabItemClickListener(new OnTabItemSelectListener() {
            @Override
            public void onSelected(int index, Object tag) {
                switch (index) {
                    case 0:
                        switchFragment(XC_JINGXUAN);
                        break;
                    case 1:
                        switchFragment(XC_FAXIAN);
                        break;
                    case 2:
                        switchFragment(XC_TANDIAN);
                        break;
                    case 3:
                        switchFragment(XC_WO);
                        break;
                }
            }

            @Override
            public void onRepeatClick(int index, Object tag) {

            }
        });
    }
}
