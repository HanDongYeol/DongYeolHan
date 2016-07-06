package com.example.user.first.Story;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.user.first.List.CStory_Data;
import com.example.user.first.List.CStory_List;
import com.example.user.first.R;

import java.util.ArrayList;

/**
 * Created by KICT-15 on 2016-07-06.
 */
public class CStory_Layout extends AppCompatActivity {

    Button btnAll, btnInner, btnEx;
    ScrollView scrollView;
    ListView listView;

    ArrayList<String> items;
    CStory_List adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //타이틀 삭제 시작
        Window win = getWindow();
        win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //타이틀 삭제 끝

        setContentView(R.layout.story_layout);

        items = new ArrayList<String>();
        adapter = new CStory_List();

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /* TODO */

            }
        });
    }
}
