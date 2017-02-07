package com.tiantianle.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tiantianle.R;

/**
 * Created by PengBo  on 2017/2/5.
 */

public class AllFragmentIndinanrember extends Fragment {
    protected View rootView;
    protected ImageView mImgAllFramIndinanremb;
    protected TextView mTextQishuAllFramIndinanremb;
    protected TextView mTextRenciAllFramIndinanremb;
    protected Button mBtnAgainAllFramIndinanremb;


    public static AllFragmentIndinanrember newInstance() {

        Bundle args = new Bundle();

        AllFragmentIndinanrember fragment = new AllFragmentIndinanrember();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.item_all_fram_indinanremb, null, false);
        initView(rootView);
        return rootView;

    }

    private void initView(View rootView) {
        mImgAllFramIndinanremb = (ImageView) rootView.findViewById(R.id.img_all_fram_indinanremb);
        mTextQishuAllFramIndinanremb = (TextView) rootView.findViewById(R.id.text_qishu_all_fram_indinanremb);
        mTextRenciAllFramIndinanremb = (TextView) rootView.findViewById(R.id.text_renci_all_fram_indinanremb);
        mBtnAgainAllFramIndinanremb = (Button) rootView.findViewById(R.id.btn_again_all_fram_indinanremb);

    }
}
