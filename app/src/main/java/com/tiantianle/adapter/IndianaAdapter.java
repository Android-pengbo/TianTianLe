package com.tiantianle.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.tiantianle.Bean.IndinanBean;
import com.tiantianle.R;
import com.tiantianle.intface.MyInterface;
import com.tiantianle.intface.UserPopuwindow;

import java.util.List;

/**
 * Created by PengBo  on 2017/2/4.
 */

public class IndianaAdapter extends BaseAdapter {
    private Activity activity;
    private Context mContext;
    private List<IndinanBean.BizContentBean> mList;
    private UserPopuwindow mUserPopuwindow;

    public IndianaAdapter(List<IndinanBean.BizContentBean> list , MyInterface myInterface) {
        super();
        this.mList = list;

        mUserPopuwindow = new UserPopuwindow();
        mUserPopuwindow.setMyInterface(myInterface);
    }

    public void setList(List<IndinanBean.BizContentBean> list) {
        mList = list;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, final View convertView, final ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder = null;
        if (view == null || !(view.getTag() instanceof ViewHolder)) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adapter_indiana, null, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        IndinanBean.BizContentBean bizContentBean = mList.get(i);
        String specname = bizContentBean.getSpecname();
        specname = specname.substring(0, specname.length()-2);
        viewHolder.mTextSpecname0Indinan.setText(specname);
        String issuenum = bizContentBean.getIssuenum();
        String replace = issuenum.replace(bizContentBean.getSpeccode(), "");
        viewHolder.mTextIssuenumIndinana.setText(replace+"期");
        viewHolder.mTextAdapterIndianaZongxu.setText(bizContentBean.getUsernum()+"");
        viewHolder.mTextAdapterIndianaShengyv.setText(bizContentBean.getUsernum()-bizContentBean.getPlaynum()+"");
        viewHolder.mProgressBarAdapterIndiana.setMax(bizContentBean.getUsernum());
        viewHolder.mProgressBarAdapterIndiana.setProgress(30);
        viewHolder.mBtnAdapterIndinanBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mUserPopuwindow.userPopu();


            }
        });
        return view;
    }

    static class ViewHolder {
        protected ImageView mImgAdapterIndiana;
        protected TextView mTextSpecname0Indinan;
        protected TextView mTextSpecname1Indinan;
        protected TextView mTextIssuenumIndinana;
        protected ProgressBar mProgressBarAdapterIndiana;
        protected TextView mTextZongxu;
        protected TextView mTextAdapterIndianaZongxu;
        protected TextView mTextAdapterIndianaShengyv;
        protected TextView mTextShengyv;
        protected Button mBtnAdapterIndinanBuy;
        protected LinearLayout mLlWoshihaoren;

        ViewHolder(View rootView) {
            initView(rootView);
        }

        private void initView(View rootView) {
            mImgAdapterIndiana = (ImageView) rootView.findViewById(R.id.img_adapter_indiana);
            mTextSpecname0Indinan = (TextView) rootView.findViewById(R.id.text_specname0_indinan);
            mTextSpecname1Indinan = (TextView) rootView.findViewById(R.id.text_specname1_indinan);
            mTextIssuenumIndinana = (TextView) rootView.findViewById(R.id.text_issuenum_indinana);
            mProgressBarAdapterIndiana = (ProgressBar) rootView.findViewById(R.id.progressBar_adapter_indiana);
            mTextZongxu = (TextView) rootView.findViewById(R.id.text_zongxu);
            mTextAdapterIndianaZongxu = (TextView) rootView.findViewById(R.id.text_adapter_indiana_zongxu);
            mTextAdapterIndianaShengyv = (TextView) rootView.findViewById(R.id.text_adapter_indiana_shengyv);
            mTextShengyv = (TextView) rootView.findViewById(R.id.text_shengyv);
            mBtnAdapterIndinanBuy = (Button) rootView.findViewById(R.id.btn_adapter_indinan_buy);
            mLlWoshihaoren = (LinearLayout) rootView.findViewById(R.id.ll_woshihaoren);
        }
    }
}
