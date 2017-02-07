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
import com.tiantianle.adapter.JingDongEKaListAdapter;

import java.util.ArrayList;
import java.util.List;

public class JingDongEka extends AppCompatActivity implements View.OnClickListener {

    protected ImageView mImgJingdongEkaBack;
    protected RadioButton mRadbtnJindongEka10;
    protected RadioButton mRadbtnJindongEka20;
    protected RadioButton mRadbtnJindongEka50;
    protected RadioButton mRadbtnJindongEka100;
    protected RadioButton mRadbtnJindongEka200;
    protected RadioButton mRadbtnJindongEka300;
    protected TextView mTextSuoXuModouJingdongeka;
    protected ListView mListviewJingdongeka;
    protected LinearLayout mActivityJingDongEka;
    protected EditText mEdittextJingdongeka;
    protected Button mBtnQuerenJingdongeka;
    private JingDongEKaListAdapter mJingDongEKaListAdapter;
    private List<String> mList;
    private String userid[] = {"1105", "1103", "1103", "1103", "1103", "1103", "1103", "1103"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_jing_dong_eka);
        initView();
        initdate();
    }

    private void initdate() {
        mList = new ArrayList<>();
        mJingDongEKaListAdapter = new JingDongEKaListAdapter();
        for (int i = 0; i < userid.length; i++) {
            mList.add(userid[i]);
        }
        mJingDongEKaListAdapter.setList(mList);
        mListviewJingdongeka.setAdapter(mJingDongEKaListAdapter);
        mJingDongEKaListAdapter.notifyDataSetChanged();


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img_jingdongEka_back) {
            finish();
        } else if (view.getId() == R.id.radbtn_jindongEka_10) {

        } else if (view.getId() == R.id.radbtn_jindongEka_20) {

        } else if (view.getId() == R.id.radbtn_jindongEka_50) {

        } else if (view.getId() == R.id.radbtn_jindongEka_100) {

        } else if (view.getId() == R.id.radbtn_jindongEka_200) {

        } else if (view.getId() == R.id.radbtn_jindongEka_300) {

        } else if (view.getId() == R.id.btn_queren_jingdongeka) {

        }
    }

    private void initView() {
        mImgJingdongEkaBack = (ImageView) findViewById(R.id.img_jingdongEka_back);
        mImgJingdongEkaBack.setOnClickListener(JingDongEka.this);
        mRadbtnJindongEka10 = (RadioButton) findViewById(R.id.radbtn_jindongEka_10);
        mRadbtnJindongEka10.setOnClickListener(JingDongEka.this);
        mRadbtnJindongEka20 = (RadioButton) findViewById(R.id.radbtn_jindongEka_20);
        mRadbtnJindongEka20.setOnClickListener(JingDongEka.this);
        mRadbtnJindongEka50 = (RadioButton) findViewById(R.id.radbtn_jindongEka_50);
        mRadbtnJindongEka50.setOnClickListener(JingDongEka.this);
        mRadbtnJindongEka100 = (RadioButton) findViewById(R.id.radbtn_jindongEka_100);
        mRadbtnJindongEka100.setOnClickListener(JingDongEka.this);
        mRadbtnJindongEka200 = (RadioButton) findViewById(R.id.radbtn_jindongEka_200);
        mRadbtnJindongEka200.setOnClickListener(JingDongEka.this);
        mRadbtnJindongEka300 = (RadioButton) findViewById(R.id.radbtn_jindongEka_300);
        mRadbtnJindongEka300.setOnClickListener(JingDongEka.this);
        mTextSuoXuModouJingdongeka = (TextView) findViewById(R.id.text_suoXu_modou_jingdongeka);
        mListviewJingdongeka = (ListView) findViewById(R.id.listview_jingdongeka);
        mActivityJingDongEka = (LinearLayout) findViewById(R.id.activity_jing_dong_eka);
        mEdittextJingdongeka = (EditText) findViewById(R.id.edittext_jingdongeka);
        mEdittextJingdongeka.setOnClickListener(JingDongEka.this);
        mBtnQuerenJingdongeka = (Button) findViewById(R.id.btn_queren_jingdongeka);
        mBtnQuerenJingdongeka.setOnClickListener(JingDongEka.this);
    }
}
