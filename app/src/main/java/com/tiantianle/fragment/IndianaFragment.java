package com.tiantianle.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.tiantianle.R;
import com.tiantianle.activity.IndianaRember;
import com.tiantianle.adapter.IndianaAdapter;

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
    private LocalBroadcastManager mLocalBroadcastManager;
    private MytLocalBroadcast mMytLocalBroadcast;

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
        mIndianaAdapter = new IndianaAdapter(mList,getContext(),this.getActivity());
        mGridFramIndiana.setAdapter(mIndianaAdapter);
        mIndianaAdapter.notifyDataSetChanged();

    }


private void getItem(){

    mGridFramIndiana.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            if(i==0){
                mPopupWindow = new PopupWindow();
                View inflate1 = View.inflate(getContext(), R.layout.item_popu_indinan_buy, null);
                mPopupWindow.setContentView(inflate1);
                mPopupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
                mPopupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
                mPopupWindow.setTouchable(true);
                mPopupWindow.setOutsideTouchable(true);

            }
        }
    });

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
    class MytLocalBroadcast extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {

        }
    }
}
