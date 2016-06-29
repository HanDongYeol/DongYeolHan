package com.example.user.first;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.TabActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

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

        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpecInner = tabHost.newTabSpec("INNER").setIndicator("내적");
        tabSpecInner.setContent(R.id.inner);
        tabHost.addTab(tabSpecInner);

        TabHost.TabSpec tabSpecExternal = tabHost.newTabSpec("EXTERNAL").setIndicator("외적");
        tabSpecExternal.setContent(R.id.external);
        tabHost.addTab(tabSpecExternal);
    }
}
