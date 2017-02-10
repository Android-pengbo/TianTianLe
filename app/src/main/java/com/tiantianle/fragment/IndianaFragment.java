package com.tiantianle.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.tiantianle.R;
import com.tiantianle.activity.IndianaRember;
import com.tiantianle.adapter.IndianaAdapter;
import com.tiantianle.intface.MyInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyj on 2017/1/22.
 * 夺宝系统
 */

public class IndianaFragment extends Fragment implements View.OnClickListener {
    protected View rootView;
    protected TextView mTextIndiana;
    protected ImageView mBighMenu;
    protected TextView mBighText;
    protected TextView mTextIndianaRecord;
    protected SlidingMenu mMenu;
    protected GridView mGridFramIndiana;
    private IndianaAdapter mIndianaAdapter;
    private int[] img = {R.mipmap.modou1,R.mipmap.modou2,R.mipmap.modou3,R.mipmap.modou4};
    private List<Integer> mList;
    private PopupWindow mPopupWindow;
    private Button  mButtonAdd;
    private Button  mButtonRed;
    private EditText mEditTextNum;
    private  Button mFive;
    private Button mTwenty;
    private Button mFifty;
    private Button  mHundred;
    private int amount = 1; //购买数量
    private int goods_storage = 200; //商品库存
    private Button mQueren;
    private ImageView mCloss;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.item_fram_indiana, null, false);
        mMenu = (SlidingMenu) getActivity().findViewById(R.id.activity_main);
        initView(rootView);
        addImgs();
        return rootView;
    }

    //添加图片
    private void addImgs() {

        mList = new ArrayList<>();
        for (int i = 0; i < img.length; i++) {
            mList.add(img[i]);
        }
        mIndianaAdapter = new IndianaAdapter(mList, getContext(), this.getActivity(), new MyInterface() {
            @Override
            public void showPopuwindow() {
                showpopuWindow();
            }
        });
        mGridFramIndiana.setAdapter(mIndianaAdapter);
        mIndianaAdapter.notifyDataSetChanged();

    }
        private void showpopuWindow() {
            mPopupWindow = new PopupWindow();
            View inflate1 = View.inflate(getContext(), R.layout.item_popu_indinan_buy, null);
            mPopupWindow.setContentView(inflate1);
            mButtonAdd= (Button) inflate1.findViewById(R.id.btn_popu_indina_buy_add);
            mButtonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    amount = Integer.parseInt( mEditTextNum.getText().toString());
                    if (amount < goods_storage) {
                        amount++;
                        mEditTextNum.setText(amount + "");
                    }

                }
            });
            mButtonRed= (Button) inflate1.findViewById(R.id.btn_popu_indina_buy_red);
            mButtonRed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    amount = Integer.parseInt( mEditTextNum.getText().toString());
                    if (amount > 1) {
                        amount--;
                        mEditTextNum.setText(amount + "");
                    }
                }
            });
            mEditTextNum= (EditText) inflate1.findViewById(R.id.eid_popu_indinan_buy);

            /**
             * private  Button mFive;
             private Button mTwenty;
             private Button mFifty;
             private Button  mHundred;
             */
            mFive= (Button) inflate1.findViewById(R.id.btn_popu_indina_but_5);
            mFive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    amount=5;
                    mEditTextNum.setText("5");
                }
            });
            mTwenty= (Button) inflate1.findViewById(R.id.btn_popu_indina_but_20);
            mTwenty.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    amount=20;
                    mEditTextNum.setText(amount+"");
                }
            });
            mFifty= (Button) inflate1.findViewById(R.id.btn_popu_indina_but_50);
            mFifty.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    amount=50;
                    mEditTextNum.setText(amount+"");
                }
            });
            mHundred= (Button) inflate1.findViewById(R.id.btn_popu_indina_but_100);
            mHundred.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    amount=100;
                    mEditTextNum.setText(amount+"");
                }
            });
            mQueren= (Button) inflate1.findViewById(R.id.btn_queren_popu_indina);
            mQueren.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getContext(),"购买了"+amount+"个商品",Toast.LENGTH_SHORT).show();
                }
            });
            mCloss= (ImageView) inflate1.findViewById(R.id.img_popu_indina_buy_closs);
            mCloss.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mPopupWindow.dismiss();
                }
            });
            mPopupWindow.setHeight(WindowManager.LayoutParams.MATCH_PARENT);
            mPopupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
            mPopupWindow.setTouchable(true);
            mPopupWindow.setOutsideTouchable(true);
            mPopupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));
            LinearLayout viewById = (LinearLayout) inflate1.findViewById(R.id.ll_diss);
            viewById.setBackgroundColor(Color.BLACK);
            viewById.setAlpha(0.6F);
            viewById.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPopupWindow.dismiss();
                }
            });
            mPopupWindow.showAtLocation(getActivity().findViewById(R.id.radiob_trend_main), Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL,0,0);
        }


    private void initView(View rootView) {

        mBighMenu = (ImageView) rootView.findViewById(R.id.bigh_menu);
        mBighMenu.setOnClickListener(IndianaFragment.this);
        mBighText = (TextView) rootView.findViewById(R.id.bigh_text);
        mTextIndianaRecord = (TextView) rootView.findViewById(R.id.text_indiana_record);
        mTextIndianaRecord.setOnClickListener(IndianaFragment.this);
        mGridFramIndiana = (GridView) rootView.findViewById(R.id.grid_fram_indiana);

    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bigh_menu) {
            mMenu.showMenu();
        } else if (view.getId() == R.id.text_indiana_record) {
            Intent intent=new Intent(getContext(), IndianaRember.class);
            startActivity(intent);
        }
    }

}
