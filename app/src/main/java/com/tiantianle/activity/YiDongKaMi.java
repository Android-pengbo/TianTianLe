package com.tiantianle.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.tiantianle.R;

import java.util.List;

public class YiDongKaMi extends AppCompatActivity implements View.OnClickListener {

    protected ImageView mImgYidongkamiBack;
    protected RadioButton mRadbtnYidongkami10;
    protected RadioButton mRadbtnYidongkami20;
    protected RadioButton mRadbtnYidongkami50;
    protected RadioButton mRadbtnYidongkami100;
    protected RadioButton mRadbtnYidongkami200;
    protected RadioButton mRadbtnYidongkami300;
    protected TextView mTextSuoXuModouYidongkami;
    protected EditText mEdittextYidongkami;
    protected Button mBtnQuerenYidongkami;
    protected ListView mListviewYidongkami;
    protected LinearLayout mActivityYiDongKaMi;
    private List<String> mList;
    private String userid[] = {"1105", "1103", "1103", "1103", "1103", "1103", "1103", "1103"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_yi_dong_ka_mi);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img_yidongkami_back) {
            finish();
        } else if (view.getId() == R.id.radbtn_yidongkami_10) {

        } else if (view.getId() == R.id.radbtn_yidongkami_20) {

        } else if (view.getId() == R.id.radbtn_yidongkami_50) {

        } else if (view.getId() == R.id.radbtn_yidongkami_100) {

        } else if (view.getId() == R.id.radbtn_yidongkami_200) {

        } else if (view.getId() == R.id.radbtn_yidongkami_300) {

        } else if (view.getId() == R.id.btn_queren_yidongkami) {

        }
    }

    private void initView() {
        mImgYidongkamiBack = (ImageView) findViewById(R.id.img_yidongkami_back);
        mImgYidongkamiBack.setOnClickListener(YiDongKaMi.this);
        mRadbtnYidongkami10 = (RadioButton) findViewById(R.id.radbtn_yidongkami_10);
        mRadbtnYidongkami10.setOnClickListener(YiDongKaMi.this);
        mRadbtnYidongkami20 = (RadioButton) findViewById(R.id.radbtn_yidongkami_20);
        mRadbtnYidongkami20.setOnClickListener(YiDongKaMi.this);
        mRadbtnYidongkami50 = (RadioButton) findViewById(R.id.radbtn_yidongkami_50);
        mRadbtnYidongkami50.setOnClickListener(YiDongKaMi.this);
        mRadbtnYidongkami100 = (RadioButton) findViewById(R.id.radbtn_yidongkami_100);
        mRadbtnYidongkami100.setOnClickListener(YiDongKaMi.this);
        mRadbtnYidongkami200 = (RadioButton) findViewById(R.id.radbtn_yidongkami_200);
        mRadbtnYidongkami200.setOnClickListener(YiDongKaMi.this);
        mRadbtnYidongkami300 = (RadioButton) findViewById(R.id.radbtn_yidongkami_300);
        mRadbtnYidongkami300.setOnClickListener(YiDongKaMi.this);
        mTextSuoXuModouYidongkami = (TextView) findViewById(R.id.text_suoXu_modou_yidongkami);
        mEdittextYidongkami = (EditText) findViewById(R.id.edittext_yidongkami);
        mBtnQuerenYidongkami = (Button) findViewById(R.id.btn_queren_yidongkami);
        mBtnQuerenYidongkami.setOnClickListener(YiDongKaMi.this);
        mListviewYidongkami = (ListView) findViewById(R.id.listview_yidongkami);
        mActivityYiDongKaMi = (LinearLayout) findViewById(R.id.activity_yi_dong_ka_mi);
    }
}
