package com.huijimuhe.commonlayout;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.huijimuhe.commonlayout.adapter.base.AbstractAdapter;
import com.huijimuhe.commonlayout.adapter.xcSaleAdapter;
import com.huijimuhe.commonlayout.adapter.xcWeekAdapter;
import com.huijimuhe.commonlayout.data.xc.source.IxcDataSource;
import com.huijimuhe.commonlayout.data.xc.source.xcRepository;
import com.huijimuhe.commonlayout.data.xc.xcIndexResponse;
import com.huijimuhe.commonlayout.utils.ToastUtils;
import com.huijimuhe.commonlayout.widget.BannerView;
import com.huijimuhe.commonlayout.widget.NoScrollRecyclerView;
import com.huijimuhe.commonlayout.widget.SwitchTabView;

import org.jetbrains.annotations.NotNull;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //Dummy data
        xcRepository repository = new xcRepository();
        repository.load(this, new IxcDataSource.LoadCallBack() {
            @Override
            public void onSuccess(xcIndexResponse response) {
                initUI(response);
            }

            @Override
            public void onError(String msg) {

            }
        });

    }

    private void initUI(xcIndexResponse dummy) {

        /**SwipeRefresh*/
        final SwipeRefreshLayout swipeRefreshLayout=(SwipeRefreshLayout) findViewById(R.id.swipe_container);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.darker_gray);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                ToastUtils.show(TestActivity.this,"onRefresh");
                swipeRefreshLayout.setRefreshing(false);
            }
        });

        /**Banner*/
        BannerView banner = (BannerView) findViewById(R.id.advertise_banner);
        banner.initBanners(dummy.getAds_top());
        banner.setOnBannerClickListener(new BannerView.BannerClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        /**Sale list*/
        NoScrollRecyclerView saleList = (NoScrollRecyclerView) findViewById(R.id.sale_list);
        LinearLayoutManager saleManager = new LinearLayoutManager(this);
        saleManager.setOrientation(LinearLayoutManager.VERTICAL);
        saleList.setLayoutManager(saleManager);

        xcSaleAdapter saleAdapter = new xcSaleAdapter(dummy.getSales(),this);
        saleAdapter.setOnItemClickListener(new AbstractAdapter.onItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

            }
        });
        saleList.setAdapter(saleAdapter);

        /**Week list*/
        RecyclerView weekList = (RecyclerView) findViewById(R.id.week_list);
        LinearLayoutManager weekManager = new LinearLayoutManager(this);
        weekManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        weekList.setLayoutManager(weekManager);

        xcWeekAdapter weekAdapter = new xcWeekAdapter(dummy.getWeek_praise(),this);
        weekAdapter.setOnItemClickListener(new AbstractAdapter.onItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

            }
        });
        weekList.setAdapter(weekAdapter);
        /**tab items*/
        SwitchTabView tab = (SwitchTabView) findViewById(R.id.handpick_tab);
        tab.setOnTabSelectedListener(new SwitchTabView.TabSelectedListener() {
            @Override
            public void onIndexChange(int original, int current) {
                Log.d("TEST", "clicked:" + String.valueOf(current));
            }

            @Override
            public void onItemChange(View item, int index) {
                Log.d("TEST", "clicked:" + String.valueOf(index));
            }
        });
    }
}
