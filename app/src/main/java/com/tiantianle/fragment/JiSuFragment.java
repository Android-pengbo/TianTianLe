package com.tiantianle.fragment;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.tiantianle.R;

/**
 * Created by wyj on 2017/1/22.
 */

public class JiSuFragment extends Fragment implements View.OnClickListener {
    protected View rootView;
    protected TextView mTextJisu28;
    protected ImageView mBighMenu;
    protected TextView mBighText;
    protected ImageView mBighDown;
    private SlidingMenu menu;
    private PopupWindow mPopupWindow;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.item_fram_jisu, null, false);
        initView(rootView);
        FragmentActivity activity = getActivity();
        menu = (SlidingMenu) activity.findViewById(R.id.activity_main);
        return rootView;
    }

    private void initView(View rootView) {
        mTextJisu28 = (TextView) rootView.findViewById(R.id.text_jisu28);
        mBighMenu = (ImageView) rootView.findViewById(R.id.bigh_menu);
        mBighMenu.setOnClickListener(JiSuFragment.this);
        mBighText = (TextView) rootView.findViewById(R.id.bigh_text);
        mBighDown = (ImageView) rootView.findViewById(R.id.bigh_down);
        mBighDown.setOnClickListener(JiSuFragment.this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bigh_menu) {
            menu.showMenu();
        } else if (view.getId() == R.id.bigh_down) {
            showpopuWindow();
        }
    }
    private void showpopuWindow() {
        mPopupWindow = new PopupWindow();
        View inflate1 = View.inflate(getContext(), R.layout.item_popuwindow, null);
        mPopupWindow.setContentView(inflate1);
        mPopupWindow.setHeight(WindowManager.LayoutParams.MATCH_PARENT);
        mPopupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));
        LinearLayout viewById = (LinearLayout) inflate1.findViewById(R.id.ll_dimiss);
        viewById.setBackgroundColor(Color.BLACK);
        viewById.setAlpha(0.6F);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPopupWindow.dismiss();
            }
        });
        mPopupWindow.showAsDropDown(mBighDown);
    }
}
