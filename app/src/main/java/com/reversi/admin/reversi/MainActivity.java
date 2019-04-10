package com.reversi.admin.reversi;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
    }

    public void onChoise(View v)
    {
        Intent i = new Intent(this,choisemode.class);
        startActivity(i);
    }
    public void onHelp(View v)
    {
        Intent i = new Intent(this,Help.class);
        startActivity(i);
    }
    public void onExit(View v)
    {
        finish();
    }
}
