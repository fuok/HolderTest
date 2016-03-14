package com.example.holdertest.staticholder;

import com.example.holdertest.R;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StaticAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Context context;
    String[] data = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii", "jjj", "kkk", "lll", "mmm", "nnn", "ooo", "ppp"};

    public StaticAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    @TargetApi(21)
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            Log.w("liuy", "convertView == null");
            convertView = inflater.inflate(R.layout.item_list, parent, false);
        } else {
            Log.w("liuy", "convertView exist");
        }

        ImageView iv = ViewHolder.get(convertView, R.id.iv_item);
        TextView tv = ViewHolder.get(convertView, R.id.tv_item);

        tv.setText(data[position]);
        iv.setImageDrawable(context.getDrawable(R.drawable.ic_launcher));

        return convertView;
    }

}
