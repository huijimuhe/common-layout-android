package com.huijimuhe.commonlayout.ui.detail;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.huijimuhe.commonlayout.AppContext;
import com.huijimuhe.commonlayout.R;

public class xcDetailActivity extends AppCompatActivity {

    private static final String TAG_LOADING = "loading";
    private static final String TAG_CONTAINER = "container";

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

    }

    @Override
    protected void onResume() {
        super.onResume();
        switchFragment(TAG_LOADING);
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
}
