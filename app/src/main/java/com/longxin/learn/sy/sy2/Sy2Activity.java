package com.longxin.learn.sy.sy2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.longxin.learn.R;
import com.longxin.learn.menu.MyMenu;


public class Sy2Activity extends MyMenu {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sy2_activity_main);

    }

    public void sy2List(View v)  {
        Intent intent = new Intent(this, Sy2ListActivity.class);
        startActivityForResult(intent, 1);
    }
    public void sy2Add(View v)  {
    }


}