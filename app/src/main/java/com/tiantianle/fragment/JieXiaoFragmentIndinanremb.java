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

public class JieXiaoFragmentIndinanremb extends Fragment {
    protected View rootView;
    protected ImageView mImgJiexiaoFramIndinanremb;
    protected TextView mTextQishuJiexiaoFramIndinanremb;
    protected TextView mTextRenciJiexiaoFramIndinanremb;
    protected TextView mTextRenci2JiexiaoFramIndinanremb;
    protected Button mBtnAgainJiexiaoFramIndinanremb;


    public static JieXiaoFragmentIndinanremb newInstance() {

        Bundle args = new Bundle();

        JieXiaoFragmentIndinanremb fragment = new JieXiaoFragmentIndinanremb();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.item_jiexiao_fram_indinanremb, null, false);
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {
        mImgJiexiaoFramIndinanremb = (ImageView) rootView.findViewById(R.id.img_jiexiao_fram_indinanremb);
        mTextQishuJiexiaoFramIndinanremb = (TextView) rootView.findViewById(R.id.text_qishu_jiexiao_fram_indinanremb);
        mTextRenciJiexiaoFramIndinanremb = (TextView) rootView.findViewById(R.id.text_renci_jiexiao_fram_indinanremb);
        mTextRenci2JiexiaoFramIndinanremb = (TextView) rootView.findViewById(R.id.text_renci2_jiexiao_fram_indinanremb);
        mBtnAgainJiexiaoFramIndinanremb = (Button) rootView.findViewById(R.id.btn_again_jiexiao_fram_indinanremb);

    }
}
