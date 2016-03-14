package com.example.holdertest.standardholder;

import com.example.holdertest.R;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StandardAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Context context;
    String[] data = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii", "jjj", "kkk", "lll", "mmm", "nnn", "ooo", "ppp"};

    public StandardAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
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
        ViewHolder holder;
        if (convertView == null) {
            Log.w("liuy", "convertView == null");
            convertView = inflater.inflate(R.layout.item_list, parent, false);
            holder = new ViewHolder();
            holder.iv = (ImageView) convertView.findViewById(R.id.iv_item);
            holder.tv = (TextView) convertView.findViewById(R.id.tv_item);
            convertView.setTag(holder);
        } else {
            Log.w("liuy", "convertView exist");
            holder = (ViewHolder) convertView.getTag();
        }

        // fuzhi
        holder.tv.setText(data[position]);
        holder.iv.setImageDrawable(context.getDrawable(R.drawable.ic_launcher));

        return convertView;
    }

    class ViewHolder {
        ImageView iv;
        TextView tv;
    }

}
