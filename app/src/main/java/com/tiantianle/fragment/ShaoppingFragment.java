package com.tiantianle.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.allen.library.SuperTextView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.tiantianle.R;
import com.tiantianle.activity.JingDongEka;
import com.tiantianle.activity.ShaoppingDuiHuanJiLu;
import com.tiantianle.adapter.JingDongEKaListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyj on 2017/1/22.
 * 兑换商城
 */

public class ShaoppingFragment extends Fragment implements View.OnClickListener {
    protected View rootView;
    protected TextView mTextShaopping;
    protected TextView mTextExchangeRecord;
    protected SuperTextView mSuptertextYidongkami;
    protected SuperTextView mSuptertextJingdongkami;
    protected SuperTextView mSuptertextShihuayoukami;
    private SlidingMenu menu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.item_fram_shaoppinng, null, false);
        initView(rootView);
        FragmentActivity activity = getActivity();
        menu = (SlidingMenu) activity.findViewById(R.id.activity_main);
        return rootView;
    }


    private void initView(View rootView) {
        mTextShaopping = (TextView) rootView.findViewById(R.id.text_shaopping);
        mTextExchangeRecord = (TextView) rootView.findViewById(R.id.text_exchange_record);
        mTextExchangeRecord.setOnClickListener(ShaoppingFragment.this);
        mSuptertextYidongkami = (SuperTextView) rootView.findViewById(R.id.suptertext_yidongkami);
        mSuptertextYidongkami.setOnClickListener(ShaoppingFragment.this);
        mSuptertextJingdongkami = (SuperTextView) rootView.findViewById(R.id.suptertext_jingdongkami);
        mSuptertextJingdongkami.setOnClickListener(ShaoppingFragment.this);
        mSuptertextShihuayoukami = (SuperTextView) rootView.findViewById(R.id.suptertext_shihuayoukami);
        mSuptertextShihuayoukami.setOnClickListener(ShaoppingFragment.this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.text_exchange_record) {
            Intent intent=new Intent(getContext(), ShaoppingDuiHuanJiLu.class);
            startActivity(intent);
        } else if (view.getId() == R.id.suptertext_yidongkami) {

        } else if (view.getId() == R.id.suptertext_jingdongkami) {

            Intent intent=new Intent(getContext(), JingDongEka.class);
            startActivity(intent);
        } else if (view.getId() == R.id.suptertext_shihuayoukami) {

        }
    }
}
