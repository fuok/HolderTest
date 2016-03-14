package com.example.holdertest.standardholder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;


public class StandardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//		RelativeLayout layout = (RelativeLayout) getLayoutInflater().inflate(R.layout.activity_standard, null);
        RelativeLayout layout = new RelativeLayout(this);
        RelativeLayout.LayoutParams params = new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        ListView lv = new ListView(this);
        layout.addView(lv, params);

        setContentView(layout, params);

        StandardAdapter adapter = new StandardAdapter(this);
        lv.setAdapter(adapter);

    }

}
