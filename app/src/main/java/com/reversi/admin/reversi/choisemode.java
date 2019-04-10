package com.reversi.admin.reversi;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choisemode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_choisemode);
    }

    public void onPlay_2(View v)
    {
        Intent i = new Intent(this,name2player.class);
        startActivity(i);
    }
    public void onPlay_3(View v)
    {
        Intent i = new Intent(this,name3player.class);
        startActivity(i);
    }
    public void onPlay_4(View v)
    {
        Intent i = new Intent(this,name4player.class);
        startActivity(i);
    }
}
