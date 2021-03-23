package com.longxin.learn.sy.sy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.longxin.learn.R;
import com.longxin.learn.menu.MyMenu;
import com.longxin.learn.sy.sy2.adapter.PhoneAdapter;
import com.longxin.learn.sy.sy2.core.PhoneUtil;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class Sy2ListActivity extends MyMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sy2_activity_sy2_list);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS) != PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CONTACTS}, 1);
        }else {
            Toast.makeText(this,"您已经申请了权限!", Toast.LENGTH_SHORT).show();
        }

        //得到ListView对象
        ListView ls = findViewById(R.id.sy2_sy2_list);
        //得到适配器对象
        PhoneAdapter adapter = new PhoneAdapter(this, PhoneUtil.getPhoneDTO(this));
        //为listView设置适配器
        ls.setAdapter(adapter);
    }

}