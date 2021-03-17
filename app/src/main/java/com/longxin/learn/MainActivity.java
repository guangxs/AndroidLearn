package com.longxin.learn;

import android.os.Bundle;
import com.longxin.learn.menu.MyMenu;

public class MainActivity extends MyMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}