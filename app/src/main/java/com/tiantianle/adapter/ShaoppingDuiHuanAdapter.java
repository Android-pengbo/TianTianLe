package com.tiantianle.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.allen.library.SuperTextView;
import com.tiantianle.R;

import java.util.List;

/**
 * Created by PengBo  on 2017/2/6.
 */

public class ShaoppingDuiHuanAdapter extends BaseAdapter {
    private List<String> mList;

    public void setList(List<String> list) {
        mList = list;
    }

    @Override
    public int getCount() {
        return mList==null?0:mList.size();
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
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder = null;
        if (view == null || !(view.getTag() instanceof ViewHolder)) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shaoppingduihuan_listview_adapter, null, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        String s = mList.get(i);
        viewHolder.mSuptertextShaoppduihuaJilu.setLeftString(s);
        return view;
    }

    static class ViewHolder {
        protected SuperTextView mSuptertextShaoppduihuaJilu;

        ViewHolder(View rootView) {
            initView(rootView);
        }

        private void initView(View rootView) {
            mSuptertextShaoppduihuaJilu = (SuperTextView) rootView.findViewById(R.id.suptertext_shaoppduihua_jilu);
        }
    }
}
