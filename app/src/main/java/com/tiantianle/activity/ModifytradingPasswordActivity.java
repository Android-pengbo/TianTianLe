package com.tiantianle.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tiantianle.BaseActivity;
import com.tiantianle.R;

/**
 * Created by Administrator on 2017/2/13.
 *
 * 修改交易密码
 */
public class ModifyTradingPasswordActivity extends BaseActivity{

    private ImageView img_back_title;

    private TextView tv_title_title;

    private TextView tv_deletes_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifytradingpassword);
        InitView();
        getHttpData();
    }

    private void InitView() {

        img_back_title = (ImageView) findViewById(R.id.img_back_title);
        tv_title_title = (TextView) findViewById(R.id.tv_title_title);
        tv_deletes_title = (TextView) findViewById(R.id.tv_deletes_title);

        tv_title_title.setText("修改交易密码");

        img_back_title.setOnClickListener(new MyOnClickListener());

    }


    private void getHttpData() {

    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.img_back_title:// 返回

                    finish();
                    break;
            }

        }
    }
}
