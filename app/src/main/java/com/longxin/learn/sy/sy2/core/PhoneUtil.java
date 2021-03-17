package com.longxin.learn.sy.sy2.core;

import android.Manifest;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

/**
 * @author Long
 * @version 1.0
 * @description:
 * @remarks:
 * @title PhoneUtil
 * @date 2021/3/17 13:44
 */
public class PhoneUtil {
    public static List<PhoneDTO> getPhoneDTO(Context context){

        List<PhoneDTO> list = new ArrayList<>();
        Cursor cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        String phoneNumber;
        String phoneName;
        //while(cursor.moveToNext()){}这两种遍历方式一样
        for(cursor.moveToFirst();!cursor.isAfterLast();cursor.moveToNext()){
            phoneNumber = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            phoneName = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            PhoneDTO dto=new PhoneDTO(phoneName, phoneNumber);
            list.add(dto);
        }
        return list;
    }
}
