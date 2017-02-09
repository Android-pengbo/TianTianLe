package com.tiantianle.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.tiantianle.BaseActivity;
import com.tiantianle.R;

/**
 * Created by Administrator on 2017/2/8.
 *
 * 具体消息信息界面
 */
public class SpecificMessageActivity extends BaseActivity{

    private TextView tv_body;//内容

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specificmessage);
        InitView();
        HttpData();
    }

    private void HttpData() {
    }

    private void InitView() {


    }


}
