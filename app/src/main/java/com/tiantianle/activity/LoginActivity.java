package com.tiantianle.activity;

import android.os.Bundle;

import com.tiantianle.BaseActivity;
import com.tiantianle.R;

/**
 * Created by Administrator on 2017/2/14.
 * 登录界面
 */
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        InitView();
        HttpData();
    }

    private void HttpData() {
    }

    private void InitView() {
    }
}
