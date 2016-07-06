package com.example.user.first.Story;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.TabActivity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TabHost;

import com.example.user.first.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 2016-06-26.
 */
@SuppressWarnings("deprecation")
public class CStory extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story);

        //타이틀 삭제 시작
        Window win = getWindow();
        win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //타이틀 삭제 끝

        /**/
        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpecAll = tabHost.newTabSpec("ALL").setIndicator("전체");
        tabSpecAll.setContent(R.id.all);
        tabHost.addTab(tabSpecAll);

        TabHost.TabSpec tabSpecInner = tabHost.newTabSpec("INNER").setIndicator("내적");
        tabSpecInner.setContent(R.id.inner);
        tabHost.addTab(tabSpecInner);

        TabHost.TabSpec tabSpecExternal = tabHost.newTabSpec("EXTERNAL").setIndicator("외적");
        tabSpecExternal.setContent(R.id.external);
        tabHost.addTab(tabSpecExternal);


    }
}
