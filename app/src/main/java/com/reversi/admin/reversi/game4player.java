package com.reversi.admin.reversi;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.reversi.admin.reversi.R.layout.activity_game4player;

public class game4player extends AppCompatActivity {
    int i,j,m,n,s,t,u,v,c=0,k=1,done=0,sum=16,black=0,white=0,blue=0,yellow=0;
    int p,r;
    ImageButton b[][] = new ImageButton[11][11];
    Button ok,home;
    TextView turn,settextp1,settextp2,settextp3,settextp4;
    int a[][] = new int[11][11];
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(activity_game4player);

        settextp1 = (TextView)findViewById(R.id.setp41text);
        settextp2 = (TextView)findViewById(R.id.setp42text);
        settextp3 = (TextView)findViewById(R.id.setp43text);
        settextp4 = (TextView)findViewById(R.id.setp44text);
        Intent intent = getIntent();
        String str1 = intent.getStringExtra("message1");
        String str2 = intent.getStringExtra("message2");
        String str3 = intent.getStringExtra("message3");
        String str4 = intent.getStringExtra("message4");
        settextp1.setText(str1);
        settextp2.setText(str2);
        settextp3.setText(str3);
        settextp4.setText(str4);

        for(m=0;m<11;m++)
        {
            for(n=0;n<11;n++)
            {
                a[m][n]=0;
            }
        }
        a[3][3]=1;
        a[4][3]=2;
        a[5][3]=3;
        a[6][3]=4;
        a[3][4]=2;
        a[4][4]=3;
        a[5][4]=4;
        a[6][4]=1;
        a[3][5]=3;
        a[4][5]=4;
        a[5][5]=1;
        a[6][5]=2;
        a[3][6]=4;
        a[4][6]=1;
        a[5][6]=2;
        a[6][6]=3;
        ok = (Button)findViewById(R.id.ok);
        home=(Button)findViewById(R.id.home);
        ok.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });
        home.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHome();
            }
        });
        b[0][0] = (ImageButton)findViewById(R.id.b10);
        b[0][1] = (ImageButton)findViewById(R.id.b11);
        b[0][2] = (ImageButton)findViewById(R.id.b12);
        b[0][3] = (ImageButton)findViewById(R.id.b13);
        b[0][4] = (ImageButton)findViewById(R.id.b14);
        b[0][5] = (ImageButton)findViewById(R.id.b15);
        b[0][6] = (ImageButton)findViewById(R.id.b16);
        b[0][7] = (ImageButton)findViewById(R.id.b17);
        b[0][8] = (ImageButton)findViewById(R.id.b18);
        b[0][9] = (ImageButton)findViewById(R.id.b19);
        b[1][0] = (ImageButton)findViewById(R.id.b20);
        b[1][1] = (ImageButton)findViewById(R.id.b21);
        b[1][2] = (ImageButton)findViewById(R.id.b22);
        b[1][3] = (ImageButton)findViewById(R.id.b23);
        b[1][4] = (ImageButton)findViewById(R.id.b24);
        b[1][5] = (ImageButton)findViewById(R.id.b25);
        b[1][6] = (ImageButton)findViewById(R.id.b26);
        b[1][7] = (ImageButton)findViewById(R.id.b27);
        b[1][8] = (ImageButton)findViewById(R.id.b28);
        b[1][9] = (ImageButton)findViewById(R.id.b29);
        b[2][0] = (ImageButton)findViewById(R.id.b30);
        b[2][1] = (ImageButton)findViewById(R.id.b31);
        b[2][2] = (ImageButton)findViewById(R.id.b32);
        b[2][3] = (ImageButton)findViewById(R.id.b33);
        b[2][4] = (ImageButton)findViewById(R.id.b34);
        b[2][5] = (ImageButton)findViewById(R.id.b35);
        b[2][6] = (ImageButton)findViewById(R.id.b36);
        b[2][7] = (ImageButton)findViewById(R.id.b37);
        b[2][8] = (ImageButton)findViewById(R.id.b38);
        b[2][9] = (ImageButton)findViewById(R.id.b39);
        b[3][0] = (ImageButton)findViewById(R.id.b40);
        b[3][1] = (ImageButton)findViewById(R.id.b41);
        b[3][2] = (ImageButton)findViewById(R.id.b42);
        b[3][3] = (ImageButton)findViewById(R.id.b43);
        b[3][4] = (ImageButton)findViewById(R.id.b44);
        b[3][5] = (ImageButton)findViewById(R.id.b45);
        b[3][6] = (ImageButton)findViewById(R.id.b46);
        b[3][7] = (ImageButton)findViewById(R.id.b47);
        b[3][8] = (ImageButton)findViewById(R.id.b48);
        b[3][9] = (ImageButton)findViewById(R.id.b49);
        b[4][0] = (ImageButton)findViewById(R.id.b50);
        b[4][1] = (ImageButton)findViewById(R.id.b51);
        b[4][2] = (ImageButton)findViewById(R.id.b52);
        b[4][3] = (ImageButton)findViewById(R.id.b53);
        b[4][4] = (ImageButton)findViewById(R.id.b54);
        b[4][5] = (ImageButton)findViewById(R.id.b55);
        b[4][6] = (ImageButton)findViewById(R.id.b56);
        b[4][7] = (ImageButton)findViewById(R.id.b57);
        b[4][8] = (ImageButton)findViewById(R.id.b58);
        b[4][9] = (ImageButton)findViewById(R.id.b59);
        b[5][0] = (ImageButton)findViewById(R.id.b60);
        b[5][1] = (ImageButton)findViewById(R.id.b61);
        b[5][2] = (ImageButton)findViewById(R.id.b62);
        b[5][3] = (ImageButton)findViewById(R.id.b63);
        b[5][4] = (ImageButton)findViewById(R.id.b64);
        b[5][5] = (ImageButton)findViewById(R.id.b65);
        b[5][6] = (ImageButton)findViewById(R.id.b66);
        b[5][7] = (ImageButton)findViewById(R.id.b67);
        b[5][8] = (ImageButton)findViewById(R.id.b68);
        b[5][9] = (ImageButton)findViewById(R.id.b69);
        b[6][0] = (ImageButton)findViewById(R.id.b70);
        b[6][1] = (ImageButton)findViewById(R.id.b71);
        b[6][2] = (ImageButton)findViewById(R.id.b72);
        b[6][3] = (ImageButton)findViewById(R.id.b73);
        b[6][4] = (ImageButton)findViewById(R.id.b74);
        b[6][5] = (ImageButton)findViewById(R.id.b75);
        b[6][6] = (ImageButton)findViewById(R.id.b76);
        b[6][7] = (ImageButton)findViewById(R.id.b77);
        b[6][8] = (ImageButton)findViewById(R.id.b78);
        b[6][9] = (ImageButton)findViewById(R.id.b79);
        b[7][0] = (ImageButton)findViewById(R.id.b80);
        b[7][1] = (ImageButton)findViewById(R.id.b81);
        b[7][2] = (ImageButton)findViewById(R.id.b82);
        b[7][3] = (ImageButton)findViewById(R.id.b83);
        b[7][4] = (ImageButton)findViewById(R.id.b84);
        b[7][5] = (ImageButton)findViewById(R.id.b85);
        b[7][6] = (ImageButton)findViewById(R.id.b86);
        b[7][7] = (ImageButton)findViewById(R.id.b87);
        b[7][8] = (ImageButton)findViewById(R.id.b88);
        b[7][9] = (ImageButton)findViewById(R.id.b89);
        b[8][0] = (ImageButton)findViewById(R.id.b90);
        b[8][1] = (ImageButton)findViewById(R.id.b91);
        b[8][2] = (ImageButton)findViewById(R.id.b92);
        b[8][3] = (ImageButton)findViewById(R.id.b93);
        b[8][4] = (ImageButton)findViewById(R.id.b94);
        b[8][5] = (ImageButton)findViewById(R.id.b95);
        b[8][6] = (ImageButton)findViewById(R.id.b96);
        b[8][7] = (ImageButton)findViewById(R.id.b97);
        b[8][8] = (ImageButton)findViewById(R.id.b98);
        b[8][9] = (ImageButton)findViewById(R.id.b99);
        b[9][0] = (ImageButton)findViewById(R.id.b100);
        b[9][1] = (ImageButton)findViewById(R.id.b101);
        b[9][2] = (ImageButton)findViewById(R.id.b102);
        b[9][3] = (ImageButton)findViewById(R.id.b103);
        b[9][4] = (ImageButton)findViewById(R.id.b104);
        b[9][5] = (ImageButton)findViewById(R.id.b105);
        b[9][6] = (ImageButton)findViewById(R.id.b106);
        b[9][7] = (ImageButton)findViewById(R.id.b107);
        b[9][8] = (ImageButton)findViewById(R.id.b108);
        b[9][9] = (ImageButton)findViewById(R.id.b109);

        b[3][3].setImageResource(R.drawable.black);
        b[4][3].setImageResource(R.drawable.white);
        b[5][3].setImageResource(R.drawable.blue);
        b[6][3].setImageResource(R.drawable.yellow);

        b[3][4].setImageResource(R.drawable.white);
        b[4][4].setImageResource(R.drawable.blue);
        b[5][4].setImageResource(R.drawable.yellow);
        b[6][4].setImageResource(R.drawable.black);

        b[3][5].setImageResource(R.drawable.blue);
        b[4][5].setImageResource(R.drawable.yellow);
        b[5][5].setImageResource(R.drawable.black);
        b[6][5].setImageResource(R.drawable.white);

        b[3][6].setImageResource(R.drawable.yellow);
        b[4][6].setImageResource(R.drawable.black);
        b[5][6].setImageResource(R.drawable.white);
        b[6][6].setImageResource(R.drawable.blue);
        try
        {
            for(i=0;i<10;i++)
            {
                final int fi=i;
                for(j=0;j<10;j++)
                {
                    if(sum==16)
                    {
                        k=1;
                    }
                    final int fj=j;

                    TextView myText5 = (TextView) findViewById(R.id.setp41text );
                    Animation anim5 = new AlphaAnimation(0.0f, 1.0f);
                    anim5.setDuration(50);
                    anim5.setStartOffset(20);
                    anim5.setRepeatMode(Animation.REVERSE);
                    anim5.setRepeatCount(Animation.INFINITE);
                    myText5.startAnimation(anim5);

                    b[i][j].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(a[fi][fj]==0)
                            {
                                done=0;
                                for (u = 0, s = fi - 1, t = fj - 1; s >= 0 && t >= 0; s--, t--, u++) {
                                    if (k == 1) {
                                        if (a[s][t] != 2 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 1 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 1) {
                                            c = 1;
                                            break;
                                        }
                                    } else if (k == 2) {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 2 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 2) {
                                            c = 2;
                                            break;
                                        }
                                    } else if (k == 3) {
                                        if (a[s][t] != 1 && a[s][t] != 2 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 3 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 3) {
                                            c = 3;
                                            break;
                                        }
                                    } else {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 2) {
                                            if (a[s][t] == 0 || (a[s][t] == 4 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 4) {
                                            c = 4;
                                            break;
                                        }
                                    }
                                }
                                if(c==1)
                                {
                                    for(s=fi-1,t=fj-1,v=0;v<u;s--,t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.black);
                                        a[s][t]=1;
                                    }
                                    done=1;
                                }
                                else if(c==2)
                                {
                                    for(s=fi-1,t=fj-1,v=0;v<u;s--,t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.white);
                                        a[s][t]=2;
                                    }
                                    done=1;
                                }
                                else if(c==3)
                                {
                                    for(s=fi-1,t=fj-1,v=0;v<u;s--,t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.blue);
                                        a[s][t]=3;
                                    }
                                    done=1;
                                }
                                else if(c==4)
                                {
                                    for(s=fi-1,t=fj-1,v=0;v<u;s--,t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.yellow);
                                        a[s][t]=4;
                                    }
                                    done=1;
                                }

                                /**/
                                for (u = 0, s = fi - 1, t = fj; s >= 0; s--, u++) {
                                    if (k == 1) {
                                        if (a[s][t] != 2 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 1 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 1) {
                                            c = 1;
                                            break;
                                        }
                                    } else if (k == 2) {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 2 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 2) {
                                            c = 2;
                                            break;
                                        }
                                    } else if (k == 3) {
                                        if (a[s][t] != 1 && a[s][t] != 2 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 3 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 3) {
                                            c = 3;
                                            break;
                                        }
                                    } else {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 2) {
                                            if (a[s][t] == 0 || (a[s][t] == 4 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 4) {
                                            c = 4;
                                            break;
                                        }
                                    }
                                }
                                if(c==1)
                                {
                                    for(s=fi-1,t=fj,v=0;v<u;s--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.black);
                                        a[s][t]=1;
                                    }
                                    done=1;
                                }
                                else if(c==2)
                                {
                                    for(s=fi-1,t=fj,v=0;v<u;s--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.white);
                                        a[s][t]=2;
                                    }
                                    done=1;
                                }
                                else if(c==3)
                                {
                                    for(s=fi-1,t=fj,v=0;v<u;s--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.blue);
                                        a[s][t]=3;
                                    }
                                    done=1;
                                }
                                else if(c==4)
                                {
                                    for(s=fi-1,t=fj,v=0;v<u;s--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.yellow);
                                        a[s][t]=4;
                                    }
                                    done=1;
                                }

                                /**/
                                for (u = 0, s = fi - 1, t = fj + 1; s >= 0 && t <= 9; s--, t++, u++) {
                                    if (k == 1) {
                                        if (a[s][t] != 2 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 1 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 1) {
                                            c = 1;
                                            break;
                                        }
                                    } else if (k == 2) {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 2 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 2) {
                                            c = 2;
                                            break;
                                        }
                                    } else if (k == 3) {
                                        if (a[s][t] != 1 && a[s][t] != 2 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 3 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 3) {
                                            c = 3;
                                            break;
                                        }
                                    } else {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 2) {
                                            if (a[s][t] == 0 || (a[s][t] == 4 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 4) {
                                            c = 4;
                                            break;
                                        }
                                    }
                                }
                                if(c==1)
                                {
                                    for(s=fi-1,t=fj+1,v=0;v<u;s--,t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.black);
                                        a[s][t]=1;
                                    }
                                    done=1;
                                }
                                else if(c==2)
                                {
                                    for(s=fi-1,t=fj+1,v=0;v<u;s--,t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.white);
                                        a[s][t]=2;
                                    }
                                    done=1;
                                }
                                else if(c==3)
                                {
                                    for(s=fi-1,t=fj+1,v=0;v<u;s--,t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.blue);
                                        a[s][t]=3;
                                    }
                                    done=1;
                                }
                                else if(c==4)
                                {
                                    for(s=fi-1,t=fj+1,v=0;v<u;s--,t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.yellow);
                                        a[s][t]=4;
                                    }
                                    done=1;
                                }

                                /**/
                                for (u = 0, s = fi, t = fj + 1; t <= 9; t++, u++) {
                                    if (k == 1) {
                                        if (a[s][t] != 2 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 1 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 1) {
                                            c = 1;
                                            break;
                                        }
                                    } else if (k == 2) {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 2 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 2) {
                                            c = 2;
                                            break;
                                        }
                                    } else if (k == 3) {
                                        if (a[s][t] != 1 && a[s][t] != 2 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 3 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 3) {
                                            c = 3;
                                            break;
                                        }
                                    } else {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 2) {
                                            if (a[s][t] == 0 || (a[s][t] == 4 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 4) {
                                            c = 4;
                                            break;
                                        }
                                    }
                                }
                                if(c==1)
                                {
                                    for(s=fi,t=fj+1,v=0;v<u;t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.black);
                                        a[s][t]=1;
                                    }
                                    done=1;
                                }
                                else if(c==2)
                                {
                                    for(s=fi,t=fj+1,v=0;v<u;t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.white);
                                        a[s][t]=2;
                                    }
                                    done=1;
                                }
                                else if(c==3)
                                {
                                    for(s=fi,t=fj+1,v=0;v<u;t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.blue);
                                        a[s][t]=3;
                                    }
                                    done=1;
                                }
                                else if(c==4)
                                {
                                    for(s=fi,t=fj+1,v=0;v<u;t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.yellow);
                                        a[s][t]=4;
                                    }
                                    done=1;
                                }

                                /**/
                                for (u = 0, s = fi + 1, t = fj + 1; s <= 9 && t <= 9; s++, t++, u++) {
                                    if (k == 1) {
                                        if (a[s][t] != 2 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 1 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 1) {
                                            c = 1;
                                            break;
                                        }
                                    } else if (k == 2) {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 2 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 2) {
                                            c = 2;
                                            break;
                                        }
                                    } else if (k == 3) {
                                        if (a[s][t] != 1 && a[s][t] != 2 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 3 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 3) {
                                            c = 3;
                                            break;
                                        }
                                    } else {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 2) {
                                            if (a[s][t] == 0 || (a[s][t] == 4 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 4) {
                                            c = 4;
                                            break;
                                        }
                                    }
                                }
                                if(c==1)
                                {
                                    for(s=fi+1,t=fj+1,v=0;v<u;s++,t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.black);
                                        a[s][t]=1;
                                    }
                                    done=1;
                                }
                                else if(c==2)
                                {
                                    for(s=fi+1,t=fj+1,v=0;v<u;s++,t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.white);
                                        a[s][t]=2;
                                    }
                                    done=1;
                                }
                                else if(c==3)
                                {
                                    for(s=fi+1,t=fj+1,v=0;v<u;s++,t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.blue);
                                        a[s][t]=3;
                                    }
                                    done=1;
                                }
                                else if(c==4)
                                {
                                    for(s=fi+1,t=fj+1,v=0;v<u;s++,t++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.yellow);
                                        a[s][t]=4;
                                    }
                                    done=1;
                                }

                                /**/
                                for (u = 0, s = fi + 1, t = fj; s <= 9; s++, u++) {
                                    if (k == 1) {
                                        if (a[s][t] != 2 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 1 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 1) {
                                            c = 1;
                                            break;
                                        }
                                    } else if (k == 2) {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 2 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 2) {
                                            c = 2;
                                            break;
                                        }
                                    } else if (k == 3) {
                                        if (a[s][t] != 1 && a[s][t] != 2 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 3 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 3) {
                                            c = 3;
                                            break;
                                        }
                                    } else {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 2) {
                                            if (a[s][t] == 0 || (a[s][t] == 4 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 4) {
                                            c = 4;
                                            break;
                                        }
                                    }
                                }
                                if(c==1)
                                {
                                    for(s=fi+1,t=fj,v=0;v<u;s++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.black);
                                        a[s][t]=1;
                                    }
                                    done=1;
                                }
                                else if(c==2)
                                {
                                    for(s=fi+1,t=fj,v=0;v<u;s++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.white);
                                        a[s][t]=2;
                                    }
                                    done=1;
                                }
                                else if(c==3)
                                {
                                    for(s=fi+1,t=fj,v=0;v<u;s++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.blue);
                                        a[s][t]=3;
                                    }
                                    done=1;
                                }
                                else if(c==4)
                                {
                                    for(s=fi+1,t=fj,v=0;v<u;s++,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.yellow);
                                        a[s][t]=4;
                                    }
                                    done=1;
                                }

                                /**/
                                for (u = 0, s = fi + 1, t = fj - 1; s <= 9 && t >= 0; s++, t--, u++) {
                                    if (k == 1) {
                                        if (a[s][t] != 2 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 1 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 1) {
                                            c = 1;
                                            break;
                                        }
                                    } else if (k == 2) {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 2 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 2) {
                                            c = 2;
                                            break;
                                        }
                                    } else if (k == 3) {
                                        if (a[s][t] != 1 && a[s][t] != 2 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 3 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 3) {
                                            c = 3;
                                            break;
                                        }
                                    } else {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 2) {
                                            if (a[s][t] == 0 || (a[s][t] == 4 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 4) {
                                            c = 4;
                                            break;
                                        }
                                    }
                                }
                                if(c==1)
                                {
                                    for(s=fi+1,t=fj-1,v=0;v<u;s++,t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.black);
                                        a[s][t]=1;
                                    }
                                    done=1;
                                }
                                else if(c==2)
                                {
                                    for(s=fi+1,t=fj-1,v=0;v<u;s++,t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.white);
                                        a[s][t]=2;
                                    }
                                    done=1;
                                }
                                else if(c==3)
                                {
                                    for(s=fi+1,t=fj-1,v=0;v<u;s++,t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.blue);
                                        a[s][t]=3;
                                    }
                                    done=1;
                                }
                                else if(c==4)
                                {
                                    for(s=fi+1,t=fj-1,v=0;v<u;s++,t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.yellow);
                                        a[s][t]=4;
                                    }
                                    done=1;
                                }

                                /**/
                                for (u = 0, s = fi, t = fj - 1; t >= 0; t--, u++) {
                                    if (k == 1) {
                                        if (a[s][t] != 2 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 1 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 1) {
                                            c = 1;
                                            break;
                                        }
                                    } else if (k == 2) {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 2 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 2) {
                                            c = 2;
                                            break;
                                        }
                                    } else if (k == 3) {
                                        if (a[s][t] != 1 && a[s][t] != 2 && a[s][t] != 4) {
                                            if (a[s][t] == 0 || (a[s][t] == 3 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 3) {
                                            c = 3;
                                            break;
                                        }
                                    } else {
                                        if (a[s][t] != 1 && a[s][t] != 3 && a[s][t] != 2) {
                                            if (a[s][t] == 0 || (a[s][t] == 4 && u == 0)) {
                                                c = 0;
                                                break;
                                            }
                                        }
                                        if (a[s][t] == 4) {
                                            c = 4;
                                            break;
                                        }
                                    }
                                }
                                if(c==1)
                                {
                                    for(s=fi,t=fj-1,v=0;v<u;t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.black);
                                        a[s][t]=1;
                                    }
                                    done=1;
                                }
                                else if(c==2)
                                {
                                    for(s=fi,t=fj-1,v=0;v<u;t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.white);
                                        a[s][t]=2;
                                    }
                                    done=1;
                                }
                                else if(c==3)
                                {
                                    for(s=fi,t=fj-1,v=0;v<u;t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.blue);
                                        a[s][t]=3;
                                    }
                                    done=1;
                                }
                                else if(c==4)
                                {
                                    for(s=fi,t=fj-1,v=0;v<u;t--,v++)
                                    {
                                        b[s][t].setImageResource(R.drawable.yellow);
                                        a[s][t]=4;
                                    }
                                    done=1;
                                }

                                /**/
                                if(done==1)
                                {
                                    int p1=0,p2=0,p3=0,p4=0;
                                    if(k==1)
                                    {
                                        b[fi][fj].setImageResource(R.drawable.black);
                                        a[fi][fj] = 1;
                                        for(p=0;p<10;p++){
                                            for(r=0;r<10;r++){
                                                if(a[p][r]==1){
                                                    p1++;
                                                }
                                                if(a[p][r]==2){
                                                    p2++;
                                                }
                                                if(a[p][r]==3){
                                                    p3++;
                                                }
                                                if(a[p][r]==4){
                                                    p4++;
                                                }
                                            }
                                        }
                                        if(p2>0) {
                                            k = 2;
                                            blink(k);
                                            //turn.setText("Turn:Player-2 (White)");
                                        }
                                        else if(p3>0) {
                                            k = 3;
                                            blink(k);
                                            //turn.setText("Turn:Player-3 (Blue)");
                                        }
                                        else if(p4>0) {
                                            k = 4;
                                            //turn.setText("Turn:Player-4 (Yellow)");
                                        }

                                    }
                                    else if(k==2)
                                    {
                                        b[fi][fj].setImageResource(R.drawable.white);
                                        a[fi][fj] = 2;
                                        for(p=0;p<10;p++){
                                            for(r=0;r<10;r++){
                                                if(a[p][r]==1){
                                                    p1++;
                                                }
                                                if(a[p][r]==2){
                                                    p2++;
                                                }
                                                if(a[p][r]==3){
                                                    p3++;
                                                }
                                                if(a[p][r]==4){
                                                    p4++;
                                                }
                                            }
                                        }
                                        if(p3>0) {
                                            k = 3;
                                            blink(k);
                                            //turn.setText("Turn:Player-3 (Blue)");
                                        }
                                        else if(p4>0) {
                                            k = 4;
                                            blink(k);
                                            //turn.setText("Turn:Player-4 (Yellow)");
                                        }
                                        else if(p1>0) {
                                            k = 1;
                                            blink(k);
                                            //turn.setText("Turn:Player-1 (Black)");
                                        }
                                    }
                                    else if(k==3)
                                    {
                                        b[fi][fj].setImageResource(R.drawable.blue);
                                        a[fi][fj]=3;
                                        for(p=0;p<10;p++){
                                            for(r=0;r<10;r++){
                                                if(a[p][r]==1){
                                                    p1++;
                                                }
                                                if(a[p][r]==2){
                                                    p2++;
                                                }
                                                if(a[p][r]==3){
                                                    p3++;
                                                }
                                                if(a[p][r]==4){
                                                    p4++;
                                                }
                                            }
                                        }
                                        if(p4>0) {
                                            k = 4;
                                            blink(k);
                                            //turn.setText("Turn:Player-4 (Yellow)");
                                        }
                                        else if(p1>0) {
                                            k = 1;
                                            blink(k);
                                            //turn.setText("Turn:Player-1 (Black)");
                                        }
                                        else if(p2>0) {
                                            k = 2;
                                            blink(k);
                                            //turn.setText("Turn:Player-2 (White)");
                                        }
                                    }
                                    else if(k==4)
                                    {
                                        b[fi][fj].setImageResource(R.drawable.yellow);
                                        a[fi][fj]=4;
                                        for(p=0;p<10;p++){
                                            for(r=0;r<10;r++){
                                                if(a[p][r]==1){
                                                    p1++;
                                                }
                                                if(a[p][r]==2){
                                                    p2++;
                                                }
                                                if(a[p][r]==3){
                                                    p3++;
                                                }
                                                if(a[p][r]==4){
                                                    p4++;
                                                }
                                            }
                                        }
                                        if(p1>0) {
                                            k = 1;
                                            blink(k);
                                            //turn.setText("Turn:Player-1 (Black)");
                                        }
                                        else if(p2>0) {
                                            k = 2;
                                            blink(k);
                                            //turn.setText("Turn:Player-2 (White)");
                                        }
                                        else if(p3>0) {
                                            k = 3;
                                            blink(k);
                                            //turn.setText("Turn:Player-3 (Blue)");
                                        }
                                    }
                                    sum+=1;
                                    if(sum==100)
                                    {
                                        int e,f;
                                        for(e=0;e<10;e++)
                                        {
                                            for(f=0;f<10;f++)
                                            {
                                                if(a[e][f]==1)
                                                {
                                                    black+=1;
                                                }
                                                if(a[e][f]==2)
                                                {
                                                    white+=1;
                                                }
                                                if(a[e][f]==3)
                                                {
                                                    blue+=1;
                                                }
                                                if(a[e][f]==4)
                                                {
                                                    yellow+=1;
                                                }
                                            }
                                        }
                                        if(black>white && black>blue && black>yellow)
                                        {
                                            //turn.setText("Game Over! Player-1 Won.");
                                            String strwin="Game Over! Player-1 Won.";
                                            gamefinish(strwin);
                                        }
                                        else if(white>black && white>blue && white>yellow)
                                        {
                                            //turn.setText("Game Over! Player-2 won.");
                                            String strwin="Game Over! Player-2 Won.";
                                            gamefinish(strwin);
                                        }
                                        else if(blue>black && blue>white && blue>yellow)
                                        {
                                            //turn.setText("Game Over! Player-3 won.");
                                            String strwin="Game Over! Player-3 Won.";
                                            gamefinish(strwin);
                                        }
                                        else if(yellow>black && yellow>blue && yellow>white)
                                        {
                                            //turn.setText("Game Over! Player-4 won.");
                                            String strwin="Game Over! Player-1 Won.";
                                            gamefinish(strwin);
                                        }
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }
        catch(Exception ignored)
        {
        }
    }

    private void gamefinish(String strwin) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        AlertDialog.Builder builder1 = builder.setMessage(strwin+" You Want to Restart Game?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(game4player.this,choisemode.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

    void restart()
    {
        //Intent i = new Intent(this,game2player.class);
        //startActivity(i);
        //this.finish();
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        AlertDialog.Builder builder1 = builder.setMessage("Are You Sure You Want to Restart?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
    void goHome()
    {
        //this.finish();
        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        AlertDialog.Builder builder1 = builder.setMessage("Are You Sure You Want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(game4player.this,MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        AlertDialog.Builder builder1 = builder.setMessage("Are You Sure You Want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(game4player.this,choisemode.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
    public void blink(int var){
        TextView myText1 = (TextView) findViewById(R.id.setp41text);
        TextView myText2 = (TextView) findViewById(R.id.setp42text);
        TextView myText3 = (TextView) findViewById(R.id.setp43text);
        TextView myText4 = (TextView) findViewById(R.id.setp44text);
        if(var==1) {
            Animation anim1 = new AlphaAnimation(0.0f, 1.0f);
            anim1.setDuration(50);
            anim1.setStartOffset(20);
            anim1.setRepeatMode(Animation.REVERSE);
            anim1.setRepeatCount(Animation.INFINITE);
            myText2.clearAnimation();
            myText3.clearAnimation();
            myText4.clearAnimation();
            myText1.startAnimation(anim1);
        }
        else if(var==2){
            Animation anim2 = new AlphaAnimation(0.0f, 1.0f);
            anim2.setDuration(50);
            anim2.setStartOffset(20);
            anim2.setRepeatMode(Animation.REVERSE);
            anim2.setRepeatCount(Animation.INFINITE);
            myText1.clearAnimation();
            myText3.clearAnimation();
            myText4.clearAnimation();
            myText2.startAnimation(anim2);
        }
        else if(var==3){
            Animation anim3 = new AlphaAnimation(0.0f, 1.0f);
            anim3.setDuration(50);
            anim3.setStartOffset(20);
            anim3.setRepeatMode(Animation.REVERSE);
            anim3.setRepeatCount(Animation.INFINITE);
            myText1.clearAnimation();
            myText2.clearAnimation();
            myText4.clearAnimation();
            myText3.startAnimation(anim3);
        }
        else{
            Animation anim4 = new AlphaAnimation(0.0f, 1.0f);
            anim4.setDuration(50);
            anim4.setStartOffset(20);
            anim4.setRepeatMode(Animation.REVERSE);
            anim4.setRepeatCount(Animation.INFINITE);
            myText1.clearAnimation();
            myText2.clearAnimation();
            myText3.clearAnimation();
            myText4.startAnimation(anim4);
        }
    }

}
