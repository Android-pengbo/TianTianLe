package com.tiantianle.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.allen.library.SuperTextView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.tiantianle.R;

/**
 * Created by wyj on 2017/1/22.
 */

public class MyFragment extends Fragment implements View.OnClickListener {
    protected View rootView;
    protected ImageView mImgMyUserHeard;
    protected TextView mTextMyVip;
    protected TextView mTextMyVipnum;
    protected Button mBtnBack;
    protected SuperTextView mSuptertextMagicBean;
    protected SuperTextView mSupertextMessage;
    protected SuperTextView mSupertextPassword;
    protected SuperTextView mSuptertextRecharges;
    protected SuperTextView mSuptertextAbout;
    private SlidingMenu menu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.item_fram_my, null, false);
        initView(rootView);
        FragmentActivity activity = getActivity();
        menu = (SlidingMenu) activity.findViewById(R.id.activity_main);
        menu.setSelected(false);
        return rootView;
    }

    private void initView(View rootView) {
        mImgMyUserHeard = (ImageView) rootView.findViewById(R.id.img_my_userHeard);
        mImgMyUserHeard.setOnClickListener(MyFragment.this);
        mTextMyVip = (TextView) rootView.findViewById(R.id.text_my_vip);
        mTextMyVipnum = (TextView) rootView.findViewById(R.id.text_my_vipnum);
        mBtnBack = (Button) rootView.findViewById(R.id.btn_back);
        mBtnBack.setOnClickListener(MyFragment.this);
        mSuptertextMagicBean = (SuperTextView) rootView.findViewById(R.id.suptertext_magicBean);
        mSuptertextMagicBean.setOnClickListener(MyFragment.this);
        mSupertextMessage = (SuperTextView) rootView.findViewById(R.id.supertext_message);
        mSupertextMessage.setOnClickListener(MyFragment.this);
        mSupertextPassword = (SuperTextView) rootView.findViewById(R.id.supertext_password);
        mSupertextPassword.setOnClickListener(MyFragment.this);
        mSuptertextRecharges = (SuperTextView) rootView.findViewById(R.id.suptertext_recharges);
        mSuptertextRecharges.setOnClickListener(MyFragment.this);
        mSuptertextAbout = (SuperTextView) rootView.findViewById(R.id.suptertext_about);
        mSuptertextAbout.setOnClickListener(MyFragment.this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.suptertext_magicBean) {

        } else if (view.getId() == R.id.supertext_message) {

        } else if (view.getId() == R.id.supertext_password) {

        } else if (view.getId() == R.id.suptertext_recharges) {

        } else if (view.getId() == R.id.suptertext_about) {

        }
    }
}
