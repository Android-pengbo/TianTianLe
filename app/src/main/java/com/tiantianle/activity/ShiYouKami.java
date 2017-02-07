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

public class ShiYouKami extends AppCompatActivity implements View.OnClickListener {

    protected ImageView mImgShiyoukamiBack;
    protected RadioButton mRadbtnShiyoukami10;
    protected RadioButton mRadbtnShiyoukami20;
    protected RadioButton mRadbtnShiyoukami50;
    protected RadioButton mRadbtnShiyoukami100;
    protected RadioButton mRadbtnShiyoukami200;
    protected RadioButton mRadbtnShiyoukami300;
    protected TextView mTextSuoXuModouShiyoukami;
    protected EditText mEdittextShiyoukami;
    protected Button mBtnQuerenShiyoukami;
    protected ListView mListviewShiyoukami;
    protected LinearLayout mActivityShiYouKami;
    private List<String> mList;
    private String userid[] = {"1105", "1103", "1103", "1103", "1103", "1103", "1103", "1103"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_shi_you_kami);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img_shiyoukami_back) {
            finish();
        } else if (view.getId() == R.id.radbtn_shiyoukami_10) {

        } else if (view.getId() == R.id.radbtn_shiyoukami_20) {

        } else if (view.getId() == R.id.radbtn_shiyoukami_50) {

        } else if (view.getId() == R.id.radbtn_shiyoukami_100) {

        } else if (view.getId() == R.id.radbtn_shiyoukami_200) {

        } else if (view.getId() == R.id.radbtn_shiyoukami_300) {

        } else if (view.getId() == R.id.btn_queren_shiyoukami) {

        }
    }

    private void initView() {
        mImgShiyoukamiBack = (ImageView) findViewById(R.id.img_shiyoukami_back);
        mImgShiyoukamiBack.setOnClickListener(ShiYouKami.this);
        mRadbtnShiyoukami10 = (RadioButton) findViewById(R.id.radbtn_shiyoukami_10);
        mRadbtnShiyoukami10.setOnClickListener(ShiYouKami.this);
        mRadbtnShiyoukami20 = (RadioButton) findViewById(R.id.radbtn_shiyoukami_20);
        mRadbtnShiyoukami20.setOnClickListener(ShiYouKami.this);
        mRadbtnShiyoukami50 = (RadioButton) findViewById(R.id.radbtn_shiyoukami_50);
        mRadbtnShiyoukami50.setOnClickListener(ShiYouKami.this);
        mRadbtnShiyoukami100 = (RadioButton) findViewById(R.id.radbtn_shiyoukami_100);
        mRadbtnShiyoukami100.setOnClickListener(ShiYouKami.this);
        mRadbtnShiyoukami200 = (RadioButton) findViewById(R.id.radbtn_shiyoukami_200);
        mRadbtnShiyoukami200.setOnClickListener(ShiYouKami.this);
        mRadbtnShiyoukami300 = (RadioButton) findViewById(R.id.radbtn_shiyoukami_300);
        mRadbtnShiyoukami300.setOnClickListener(ShiYouKami.this);
        mTextSuoXuModouShiyoukami = (TextView) findViewById(R.id.text_suoXu_modou_shiyoukami);
        mEdittextShiyoukami = (EditText) findViewById(R.id.edittext_shiyoukami);
        mBtnQuerenShiyoukami = (Button) findViewById(R.id.btn_queren_shiyoukami);
        mBtnQuerenShiyoukami.setOnClickListener(ShiYouKami.this);
        mListviewShiyoukami = (ListView) findViewById(R.id.listview_shiyoukami);
        mActivityShiYouKami = (LinearLayout) findViewById(R.id.activity_shi_you_kami);
    }
}
