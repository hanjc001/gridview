package com.example.a1027.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by 1027 on 2016-12-03.
 */

public class MyGridViewAdapter extends BaseAdapter {

    // 연관관계
    Context context;

    // 이미지 리소스 ID
    int[] posters = {
        R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
        R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
        R.drawable.mov09, R.drawable.mov10, R.drawable.mov11, R.drawable.mov12
    };

    public MyGridViewAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return posters.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
