package com.longxin.learn.sy.sy2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.longxin.learn.R;
import com.longxin.learn.sy.sy2.core.PhoneDTO;

import java.util.List;
import java.util.Set;

/**
 * @author Long
 * @version 1.0
 * @description:
 * @remarks:
 * @title PhoneAdapter
 * @date 2021/3/17 13:45
 */
public class PhoneAdapter extends BaseAdapter {
    private Context context;
    private LinearLayout layout;
    List<PhoneDTO> phones;

    public PhoneAdapter(Context context, List<PhoneDTO> phones) {
        this.context = context;
        this.phones = phones;
    }

    @Override
    public int getCount() {
        return phones.size();
    }

    @Override
    public Object getItem(int position) {
        return phones.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //得到布局加载器
        LayoutInflater inflater = LayoutInflater.from(context);
        //加载得到item每一项的布局
        layout = (LinearLayout) inflater.inflate(R.layout.sy2_activity_sy2_list_item, null);
//通过视图得到控件
        TextView phoneNumTv = (TextView) layout.findViewById(R.id.tx_phoneNumber);
        TextView phoneNameTv = (TextView) layout.findViewById(R.id.tx_phoneName);
        //为控件填充数据
        phoneNumTv.setText(phones.get(position).getTelPhone());
        phoneNameTv.setText(phones.get(position).getName());

        return layout;
    }
}
