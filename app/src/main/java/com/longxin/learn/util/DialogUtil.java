package com.longxin.learn.util;

import android.app.AlertDialog;
import android.content.Context;

/**
 * @author Long
 * @version 1.0
 * @description:
 * @remarks:
 * @title DialogUtil
 * @date 2021/3/17 10:52
 */
public class DialogUtil {
    public static void dialog(Context context, String msg){
        new AlertDialog.Builder(context).setTitle("提示").setMessage(msg).create().show();
    }
}
