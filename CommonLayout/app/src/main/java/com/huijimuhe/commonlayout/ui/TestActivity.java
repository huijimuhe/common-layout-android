package com.huijimuhe.commonlayout.ui;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.huijimuhe.commonlayout.R;
import com.huijimuhe.commonlayout.adapter.base.AbstractRenderAdapter;
import com.huijimuhe.commonlayout.adapter.xcSectionAdapter;
import com.huijimuhe.commonlayout.data.xc.source.IxcDataSource;
import com.huijimuhe.commonlayout.data.xc.source.xcDetailRepository;
import com.huijimuhe.commonlayout.data.xc.xcDetailResponse;
import com.huijimuhe.commonlayout.data.xc.xcSection;
import com.huijimuhe.commonlayout.utils.ToastUtils;
import com.huijimuhe.commonlayout.widget.NoScrollRecyclerView;

import java.util.List;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //Dummy data
        final xcDetailRepository repository = new xcDetailRepository();
        repository.load(this, new IxcDataSource.DetailLoadCallBack() {
            @Override
            public void onSuccess(xcDetailResponse response) {
                initUI(response);
            }

            @Override
            public void onError(String msg) {

            }
        });

    }

    private void initUI(xcDetailResponse dummy) {

        /**SwipeRefresh*/
        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.darker_gray);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                ToastUtils.show(TestActivity.this, "onRefresh");
                swipeRefreshLayout.setRefreshing(false);
            }
        });

        /**Section list*/
        NoScrollRecyclerView saleList = (NoScrollRecyclerView) findViewById(R.id.sale_list);
        LinearLayoutManager saleManager = new LinearLayoutManager(this);
        saleManager.setOrientation(LinearLayoutManager.VERTICAL);
        saleList.setLayoutManager(saleManager);

        List<xcSection> data=dummy.getArticle().getBody();
        xcSectionAdapter saleAdapter = new xcSectionAdapter(data);
        saleAdapter.setOnItemClickListener(new AbstractRenderAdapter.onItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {

            }
        });
        saleList.setAdapter(saleAdapter);
    }
}
