package com.reversi.admin.reversi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class name3player extends AppCompatActivity {

    EditText p1,p2,p3;
    Button startgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name3player);
        p1=(EditText)findViewById(R.id.textp31);
        p2=(EditText)findViewById(R.id.textp32);
        p3=(EditText)findViewById(R.id.textp33);
        startgame=(Button)findViewById(R.id.buttonstart);

        startgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strp1 = p1.getText().toString();
                String strp2 = p2.getText().toString();
                String strp3 = p3.getText().toString();

                Intent intent = new Intent(getApplicationContext(), game3player.class);
                intent.putExtra("message1", strp1);
                intent.putExtra("message2", strp2);
                intent.putExtra("message3", strp3);
                startActivity(intent);
            }
        });

    }
}
