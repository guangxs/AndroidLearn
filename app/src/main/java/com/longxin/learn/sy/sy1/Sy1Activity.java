package com.longxin.learn.sy.sy1;

import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;

import com.longxin.learn.R;
import com.longxin.learn.menu.MyMenu;
import com.longxin.learn.util.DialogUtil;


public class Sy1Activity extends MyMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sy1_activity_main);
    }

    public void sy1Comput(View v) {
        boolean man = true;
        double height, weight, own;
        try {
            height = Double.parseDouble(((EditText) findViewById(R.id.sy1Height)).getText().toString());
        } catch (Exception e) {
            DialogUtil.dialog(this, "请输入正确的身高");
            return;
        }
        try {
            weight = Double.parseDouble(((EditText) findViewById(R.id.sy1Weight)).getText().toString());
        } catch (Exception e) {
            DialogUtil.dialog(this, "请输入正确的体重");
            return;
        }

        if (((Checkable) findViewById(R.id.sy1Man)).isChecked()) {
            own = 170 - (62 - weight) / 0.6;
        } else if (((Checkable) findViewById(R.id.sy1Wuman)).isChecked()) {
            own = 158 - (52 - weight) / 0.5;
            man = false;
        } else {
            DialogUtil.dialog(this, "请选择性别");
            return;
        }
        get(man, own, height);
    }

    private void get(boolean man, double own, double height) {
        String msg = "您的体质";
        double p = 3;
        if (man) p = 5;
        if (height <= (own + p) && height >= (own - p)) {
            msg += "正常";
        }else if (height <= (own + p)) {
            msg += "偏胖";
        }else if (height >= (own - p)) {
            msg += "偏瘦";
        }
        DialogUtil.dialog(this, msg);
    }
}