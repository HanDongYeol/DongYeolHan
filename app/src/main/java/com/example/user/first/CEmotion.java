package com.example.user.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by USER on 2016-06-26.
 */
public class CEmotion extends AppCompatActivity {

    TextView BtnHappy,BtnSad,BtnPanic,BtnAnger,BtnDisGust;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emotion);

        //타이틀 삭제 시작
        Window win = getWindow();
        win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //타이틀 삭제 끝

        BtnHappy = (TextView)findViewById(R.id.Happy);
        BtnSad = (TextView)findViewById(R.id.Sad);
        BtnPanic = (TextView)findViewById(R.id.Panic);
        BtnAnger = (TextView)findViewById(R.id.Anger);
        BtnDisGust = (TextView)findViewById(R.id.DisGust);

        BtnHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CHappy.class);
                startActivity(intent);
            }
        });

        BtnSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CSad.class);
                startActivity(intent);
            }
        });

        BtnPanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CPanic.class);
                startActivity(intent);
            }
        });

        BtnAnger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CAnger.class);
                startActivity(intent);
            }
        });

        BtnDisGust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CDisGust.class);
                startActivity(intent);
            }
        });
    }
}
