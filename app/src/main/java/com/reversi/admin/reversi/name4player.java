package com.reversi.admin.reversi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class name4player extends AppCompatActivity {

    EditText p1,p2,p3,p4;
    Button startgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name4player);
        p1=(EditText)findViewById(R.id.textp41);
        p2=(EditText)findViewById(R.id.textp42);
        p3=(EditText)findViewById(R.id.textp43);
        p4=(EditText)findViewById(R.id.textp44);
        startgame=(Button)findViewById(R.id.buttonstart);

        startgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strp1 = p1.getText().toString();
                String strp2 = p2.getText().toString();
                String strp3 = p3.getText().toString();
                String strp4 = p4.getText().toString();

                Intent intent = new Intent(getApplicationContext(), game4player.class);
                intent.putExtra("message1", strp1);
                intent.putExtra("message2", strp2);
                intent.putExtra("message3", strp3);
                intent.putExtra("message4", strp4);
                startActivity(intent);
            }
        });

    }
}
