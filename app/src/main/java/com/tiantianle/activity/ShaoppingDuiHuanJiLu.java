package com.tiantianle.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.tiantianle.R;
import com.tiantianle.adapter.ShaoppingDuiHuanAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 商城兑换记录
 */

public class ShaoppingDuiHuanJiLu extends AppCompatActivity implements View.OnClickListener {

    protected ImageView mImgShangchengduihuanRemberBack;
    protected ListView mListviewShangchengDuihuan;
    protected LinearLayout mActivityShaoppingDuiHuanJiLu;
    private List<String> mList;
    private ShaoppingDuiHuanAdapter mShaoppingDuiHuanAdapter;
    private String str[] = {"哈哈", "呵呵", "嗯嗯", "啦啦"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_shaopping_dui_huan_ji_lu);
        initView();
        initdate();
    }

    private void initdate() {
        mShaoppingDuiHuanAdapter = new ShaoppingDuiHuanAdapter();
        mList = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            mList.add(str[i]);

        }
        mShaoppingDuiHuanAdapter.setList(mList);
        mListviewShangchengDuihuan.setAdapter(mShaoppingDuiHuanAdapter);
        mShaoppingDuiHuanAdapter.notifyDataSetChanged();


    }

    private void initView() {
        mImgShangchengduihuanRemberBack = (ImageView) findViewById(R.id.img_shangchengduihuan_Rember_back);
        mImgShangchengduihuanRemberBack.setOnClickListener(ShaoppingDuiHuanJiLu.this);
        mListviewShangchengDuihuan = (ListView) findViewById(R.id.listview_shangcheng_Duihuan);
        mActivityShaoppingDuiHuanJiLu = (LinearLayout) findViewById(R.id.activity_shaopping_dui_huan_ji_lu);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img_shangchengduihuan_Rember_back) {
            finish();
        }
    }
}
