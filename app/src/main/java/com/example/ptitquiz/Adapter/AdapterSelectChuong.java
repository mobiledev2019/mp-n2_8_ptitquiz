package com.example.ptitquiz.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ptitquiz.Model.SelectChuong;
import com.example.ptitquiz.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterSelectChuong extends BaseAdapter {
    Context context;
    int myLayout;
    List<SelectChuong> arrayList;

    public AdapterSelectChuong(Context context, int myLayout, List<SelectChuong> arrayList) {
        this.context = context;
        this.myLayout = myLayout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout,null);
        TextView txtChuong = (TextView) convertView.findViewById(R.id.tv_chuong_custom);
        ImageView imgChuong = (ImageView)convertView.findViewById(R.id.img_icon_select);

        txtChuong.setText(arrayList.get(position).getNameChuong());
        imgChuong.setImageResource(arrayList.get(position).getFlagImage());


        return convertView;
    }
}
