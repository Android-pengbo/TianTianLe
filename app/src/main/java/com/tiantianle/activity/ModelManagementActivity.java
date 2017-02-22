package com.tiantianle.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tiantianle.BaseActivity;
import com.tiantianle.R;
import com.tiantianle.view.PullToRefreshView;

/**
 * Created by Administrator on 2017/2/22.
 *
 * 模式管理
 */
public class ModelManagementActivity extends BaseActivity{

    private ImageView img_back_title;   //返回
    private TextView tv_title_title;    //title

    private Button bt_model_management; //新建模式
    private PullToRefreshView  ll_pull; //刷新框架
    private ListView lv_mode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_managemnt);
        
        InitView();
    }

    private void InitView() {

        img_back_title = (ImageView) findViewById(R.id.img_back_title);
        tv_title_title = (TextView) findViewById(R.id.tv_title_title);
        bt_model_management = (Button) findViewById(R.id.bt_model_management);
        ll_pull = (PullToRefreshView) findViewById(R.id.ll_pull);
        lv_mode = (ListView) findViewById(R.id.lv_mode);

        tv_title_title.setText("模式管理");

        img_back_title.setOnClickListener(new MyOnClickListener());

    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.img_back_title:

                    finish();
                    break;
            }
        }
    }
}
