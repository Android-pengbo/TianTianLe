package com.tiantianle.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.dalong.flowlayout.Flow;
import com.dalong.flowlayout.FlowLayout;
import com.tiantianle.R;
import com.tiantianle.adapter.YiDongKaMiAdapter;
import com.tiantianle.custom.FlowEntity;

import java.util.ArrayList;
import java.util.List;

public class YiDongKaMi extends Activity implements View.OnClickListener {

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
    protected FlowLayout mMFlowLayout;
    private List<String> mList;
    private String userid[] = {"1105", "1103", "1103", "1103", "1103", "1103", "1103", "1103"};
    private YiDongKaMiAdapter mYiDongKaMiAdapter;
    private List<Flow> mFlowList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_yi_dong_ka_mi);
        initView();
        initdate();
        initDate();
    }

    private void initDate() {
        mFlowList = getPhoneList();
        mMFlowLayout.setFlowData(mFlowList);

    }
    public List<Flow> getPhoneList() {
        List<Flow> list = new ArrayList<>();
        Flow mFlow = new FlowEntity("1", "10元");
        Flow mFlow2 = new FlowEntity("2", "20元");
        Flow mFlow3 = new FlowEntity("3", "50元");
        Flow mFlow4 = new FlowEntity("4", "100元");
        Flow mFlow5 = new FlowEntity("5", "200元");
        Flow mFlow6 = new FlowEntity("6", "300元");
        list.add(mFlow);
        list.add(mFlow2);
        list.add(mFlow3);
        list.add(mFlow4);
        list.add(mFlow5);
        list.add(mFlow6);
        return list;
    }


    private void initdate() {
        mYiDongKaMiAdapter = new YiDongKaMiAdapter();
        mList = new ArrayList<>();
        for (int i = 0; i < userid.length; i++) {
            mList.add(userid[i]);
        }

        mYiDongKaMiAdapter.setList(mList);
        mListviewYidongkami.setAdapter(mYiDongKaMiAdapter);
        mYiDongKaMiAdapter.notifyDataSetChanged();

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img_yidongkami_back) {
            finish();
        }  else if (view.getId() == R.id.btn_queren_yidongkami) {

        }
    }

    private void initView() {
        mImgYidongkamiBack = (ImageView) findViewById(R.id.img_yidongkami_back);
        mImgYidongkamiBack.setOnClickListener(YiDongKaMi.this);
        mTextSuoXuModouYidongkami = (TextView) findViewById(R.id.text_suoXu_modou_yidongkami);
        mEdittextYidongkami = (EditText) findViewById(R.id.edittext_yidongkami);
        mBtnQuerenYidongkami = (Button) findViewById(R.id.btn_queren_yidongkami);
        mBtnQuerenYidongkami.setOnClickListener(YiDongKaMi.this);
        mListviewYidongkami = (ListView) findViewById(R.id.listview_yidongkami);
        mActivityYiDongKaMi = (LinearLayout) findViewById(R.id.activity_yi_dong_ka_mi);
        mMFlowLayout = (FlowLayout) findViewById(R.id.mFlowLayout);
    }
}
