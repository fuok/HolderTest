package com.example.holdertest.staticholder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class StaticActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout layout = new RelativeLayout(this);
        ListView lv = new ListView(this);
        RelativeLayout.LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        layout.addView(lv, params);

        setContentView(layout, params);
        //
        StaticAdapter adapter = new StaticAdapter(this);
        lv.setAdapter(adapter);
    }
}
