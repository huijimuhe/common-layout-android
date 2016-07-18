package com.huijimuhe.commonlayout.xc.detail;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.huijimuhe.commonlayout.AppContext;
import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.data.xc.source.xcDetailRepository;
import com.huijimuhe.commonlayout.data.xc.xcDetailResponse;
import com.huijimuhe.commonlayout.presenter.xc.xcDetailContract;
import com.huijimuhe.commonlayout.presenter.xc.xcDetailPresenter;
import com.huijimuhe.commonlayout.utils.ToastUtils;

public class xcDetailActivity extends AppCompatActivity implements xcDetailContract.View {

    private static final String TAG_LOADING = "loading";
    private static final String TAG_CONTAINER = "container";
    private xcDetailPresenter mPresenter;

    public static Intent newIntent() {
        Intent intent = new Intent(AppContext.getInstance(),
                xcDetailActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xc_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("详情");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initFragments();

        //mvp
        mPresenter = new xcDetailPresenter(this, new xcDetailRepository());
        mPresenter.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        showLoading(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mPresenter.load(xcDetailActivity.this);
            }
        },1500);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void initFragments() {
        //Loading Fragment
        Fragment loadingFragment = getSupportFragmentManager().findFragmentByTag(TAG_LOADING);
        if (loadingFragment == null) {
            loadingFragment = xcDetailLoadingFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, loadingFragment, TAG_LOADING)
                    .hide(loadingFragment)
                    .commit();
        }

        //Container Fragment
        Fragment containerFragment = getSupportFragmentManager().findFragmentByTag(TAG_CONTAINER);
        if (containerFragment == null) {
            containerFragment = xcDetailContainerFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, containerFragment, TAG_CONTAINER)
                    .hide(containerFragment)
                    .commit();
        }
    }

    private void switchFragment(String target) {
        String[] tags = {TAG_LOADING, TAG_CONTAINER};
        for (String tag : tags) {
            Fragment f = getSupportFragmentManager().findFragmentByTag(tag);
            getSupportFragmentManager()
                    .beginTransaction()
                    .hide(f)
                    .commit();
        }
        Fragment f = getSupportFragmentManager().findFragmentByTag(target);
        getSupportFragmentManager().beginTransaction().show(f).commit();
    }

    @Override
    public void showLoading(boolean isActive) {
        switchFragment(TAG_LOADING);
    }

    @Override
    public void showError() {
        ToastUtils.show(this,"有问题");
    }

    @Override
    public void showContainer(xcDetailResponse response) {
        switchFragment(TAG_CONTAINER);
        xcDetailContainerFragment f =(xcDetailContainerFragment) getSupportFragmentManager().findFragmentByTag(TAG_CONTAINER);
        f.load(response);
    }
}
