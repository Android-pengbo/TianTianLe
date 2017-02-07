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

public class JingXingFragmentIndinanremb extends Fragment {
    protected View rootView;
    protected ImageView mImgJinxingFramIndinanremb;
    protected TextView mTextQishuJinxingFramIndinanremb;
    protected TextView mTextRenciJinxingFramIndinanremb;
    protected Button mBtnAgainAllFramIndinanremb;


    public static JingXingFragmentIndinanremb newInstance() {

        Bundle args = new Bundle();

        JingXingFragmentIndinanremb fragment = new JingXingFragmentIndinanremb();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.item_jinxing_fram_indinanremb, null, false);
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {
        mImgJinxingFramIndinanremb = (ImageView) rootView.findViewById(R.id.img_jinxing_fram_indinanremb);
        mTextQishuJinxingFramIndinanremb = (TextView) rootView.findViewById(R.id.text_qishu_jinxing_fram_indinanremb);
        mTextRenciJinxingFramIndinanremb = (TextView) rootView.findViewById(R.id.text_renci_jinxing_fram_indinanremb);
        mBtnAgainAllFramIndinanremb = (Button) rootView.findViewById(R.id.btn_again_all_fram_indinanremb);

    }
}
