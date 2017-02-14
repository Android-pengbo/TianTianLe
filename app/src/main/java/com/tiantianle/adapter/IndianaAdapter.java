package com.tiantianle.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
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
    private List<Integer> mList;
    private PopupWindow mPopupWindow;
    private LocalBroadcastManager mLocalBroadcastManager;
    private UserPopuwindow mUserPopuwindow;
    public IndianaAdapter(List<Integer>list, Context context, Activity activity, MyInterface myInterface){
        super();
        this.mContext=context;
        this.mList=list;
        this.activity=activity;
        mUserPopuwindow=new UserPopuwindow();
        mUserPopuwindow.setMyInterface(myInterface);
    }

    public void setList(List<Integer> list) {
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
        Integer integer = mList.get(i);
        Glide.with(parent.getContext()).load(integer).into(viewHolder.mImgAdapterIndiana);
       viewHolder.mBtnAdapterIndinanBuy.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               mUserPopuwindow.userPopu();


           }
       });
        return view;
    }


   /* //测试用的
    public void shuopopu(){
        mPopupWindow = new PopupWindow();
        View inflate1 = View.inflate(mContext, R.layout.item_popu_indinan_buy, null);
        mPopupWindow.setContentView(inflate1);
        mPopupWindow.setHeight(WindowManager.LayoutParams.MATCH_PARENT);
        mPopupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.showAtLocation(activity.findViewById(R.id.radiob_trend_main),Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL,0,0);
    }*/
    static class ViewHolder {
        protected ImageView mImgAdapterIndiana;
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
