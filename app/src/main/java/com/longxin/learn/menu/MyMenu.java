package com.longxin.learn.menu;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.longxin.learn.MainActivity;
import com.longxin.learn.R;
import com.longxin.learn.sy.sy1.Sy1Activity;
import com.longxin.learn.sy.sy2.Sy2Activity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Long
 * @version 1.0
 * @description:
 * @remarks:
 * @title Menu
 * @date 2021/3/17 13:13
 */
public class MyMenu extends AppCompatActivity {
    private static final Map<Integer, Class<?>> menuMap = new HashMap<>();

    static {
        menuMap.put(R.id.main, MainActivity.class);
        menuMap.put(R.id.exit, MyMenu.class);
        menuMap.put(R.id.sy1, Sy1Activity.class);
        menuMap.put(R.id.sy2, Sy2Activity.class);
    }


    // 菜单的监听方法
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Class<?> clazz = menuMap.get(item.getItemId());
        if (clazz == null) {
            return false;
        }
        if (clazz == MyMenu.class) {
            finish();
        }
        finish();
        Intent intent = new Intent(this, clazz);
        startActivityForResult(intent, 1);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;
    }

}
