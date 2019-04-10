package com.reversi.admin.reversi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class name2player extends AppCompatActivity {
    EditText p1,p2;
    Button startgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name2player);
        p1=(EditText)findViewById(R.id.textp1);
        p2=(EditText)findViewById(R.id.textp2);
        startgame=(Button)findViewById(R.id.buttonstart);

        startgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strp1 = p1.getText().toString();
                String strp2 = p2.getText().toString();

                Intent intent = new Intent(getApplicationContext(), game2player.class);
                intent.putExtra("message1", strp1);
                intent.putExtra("message2", strp2);
                startActivity(intent);
            }
        });

    }
}
