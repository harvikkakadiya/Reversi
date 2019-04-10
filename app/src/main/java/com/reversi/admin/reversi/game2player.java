package com.reversi.admin.reversi;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.reversi.admin.reversi.R.layout.activity_game2player;

public class game2player extends AppCompatActivity {
    int i,j,m,n,s,t,u,v,c=0,k=1,done=0,sum=4,black=0,white=0;
    ImageButton b[][] = new ImageButton[9][9];
    Button ok,home;
    TextView turn,settextp1,settextp2;
    int a[][] = new int[9][9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(activity_game2player);

        settextp1 = (TextView)findViewById(R.id.setp1text);
        settextp2 = (TextView)findViewById(R.id.setp2text);
        Intent intent = getIntent();
        String str1 = intent.getStringExtra("message1");
        String str2 = intent.getStringExtra("message2");
        settextp1.setText(str1);
        settextp2.setText(str2);

        for(m=0;m<8;m++)
        {
            for(n=0;n<8;n++)
            {
                a[m][n]=0;
            }
        }
        a[3][3]=1;
        a[3][4]=2;
        a[4][3]=2;
        a[4][4]=1;
        //turn = (TextView)findViewById(R.id.turn);
        //turn.setText("Turn:Player-1 (Black)");
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
        b[0][0] = (ImageButton)findViewById(R.id.b11);
        b[0][1] = (ImageButton)findViewById(R.id.b12);
        b[0][2] = (ImageButton)findViewById(R.id.b13);
        b[0][3] = (ImageButton)findViewById(R.id.b14);
        b[0][4] = (ImageButton)findViewById(R.id.b15);
        b[0][5] = (ImageButton)findViewById(R.id.b16);
        b[0][6] = (ImageButton)findViewById(R.id.b17);
        b[0][7] = (ImageButton)findViewById(R.id.b18);
        b[1][0] = (ImageButton)findViewById(R.id.b21);
        b[1][1] = (ImageButton)findViewById(R.id.b22);
        b[1][2] = (ImageButton)findViewById(R.id.b23);
        b[1][3] = (ImageButton)findViewById(R.id.b24);
        b[1][4] = (ImageButton)findViewById(R.id.b25);
        b[1][5] = (ImageButton)findViewById(R.id.b26);
        b[1][6] = (ImageButton)findViewById(R.id.b27);
        b[1][7] = (ImageButton)findViewById(R.id.b28);
        b[2][0] = (ImageButton)findViewById(R.id.b31);
        b[2][1] = (ImageButton)findViewById(R.id.b32);
        b[2][2] = (ImageButton)findViewById(R.id.b33);
        b[2][3] = (ImageButton)findViewById(R.id.b34);
        b[2][4] = (ImageButton)findViewById(R.id.b35);
        b[2][5] = (ImageButton)findViewById(R.id.b36);
        b[2][6] = (ImageButton)findViewById(R.id.b37);
        b[2][7] = (ImageButton)findViewById(R.id.b38);
        b[3][0] = (ImageButton)findViewById(R.id.b41);
        b[3][1] = (ImageButton)findViewById(R.id.b42);
        b[3][2] = (ImageButton)findViewById(R.id.b43);
        b[3][3] = (ImageButton)findViewById(R.id.b44);
        b[3][4] = (ImageButton)findViewById(R.id.b45);
        b[3][5] = (ImageButton)findViewById(R.id.b46);
        b[3][6] = (ImageButton)findViewById(R.id.b47);
        b[3][7] = (ImageButton)findViewById(R.id.b48);
        b[4][0] = (ImageButton)findViewById(R.id.b51);
        b[4][1] = (ImageButton)findViewById(R.id.b52);
        b[4][2] = (ImageButton)findViewById(R.id.b53);
        b[4][3] = (ImageButton)findViewById(R.id.b54);
        b[4][4] = (ImageButton)findViewById(R.id.b55);
        b[4][5] = (ImageButton)findViewById(R.id.b56);
        b[4][6] = (ImageButton)findViewById(R.id.b57);
        b[4][7] = (ImageButton)findViewById(R.id.b58);
        b[5][0] = (ImageButton)findViewById(R.id.b61);
        b[5][1] = (ImageButton)findViewById(R.id.b62);
        b[5][2] = (ImageButton)findViewById(R.id.b63);
        b[5][3] = (ImageButton)findViewById(R.id.b64);
        b[5][4] = (ImageButton)findViewById(R.id.b65);
        b[5][5] = (ImageButton)findViewById(R.id.b66);
        b[5][6] = (ImageButton)findViewById(R.id.b67);
        b[5][7] = (ImageButton)findViewById(R.id.b68);
        b[6][0] = (ImageButton)findViewById(R.id.b71);
        b[6][1] = (ImageButton)findViewById(R.id.b72);
        b[6][2] = (ImageButton)findViewById(R.id.b73);
        b[6][3] = (ImageButton)findViewById(R.id.b74);
        b[6][4] = (ImageButton)findViewById(R.id.b75);
        b[6][5] = (ImageButton)findViewById(R.id.b76);
        b[6][6] = (ImageButton)findViewById(R.id.b77);
        b[6][7] = (ImageButton)findViewById(R.id.b78);
        b[7][0] = (ImageButton)findViewById(R.id.b81);
        b[7][1] = (ImageButton)findViewById(R.id.b82);
        b[7][2] = (ImageButton)findViewById(R.id.b83);
        b[7][3] = (ImageButton)findViewById(R.id.b84);
        b[7][4] = (ImageButton)findViewById(R.id.b85);
        b[7][5] = (ImageButton)findViewById(R.id.b86);
        b[7][6] = (ImageButton)findViewById(R.id.b87);
        b[7][7] = (ImageButton)findViewById(R.id.b88);
        b[3][3].setImageResource(R.drawable.black);
        b[3][4].setImageResource(R.drawable.white);
        b[4][3].setImageResource(R.drawable.white);
        b[4][4].setImageResource(R.drawable.black);
        try
        {
            for(i=0;i<8;i++)
            {
                final int fi=i;
                for(j=0;j<8;j++)
                {
                    if(sum==4)
                    {
                        k=1;
                    }
                    final int fj=j;

                    TextView myText2 = (TextView) findViewById(R.id.setp1text );
                    Animation anim3 = new AlphaAnimation(0.0f, 1.0f);
                    anim3.setDuration(50);
                    anim3.setStartOffset(20);
                    anim3.setRepeatMode(Animation.REVERSE);
                    anim3.setRepeatCount(Animation.INFINITE);
                    myText2.startAnimation(anim3);

                    b[i][j].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(a[fi][fj]==0)
                            {
                                done=0;
                                loop:for(u=0,s=fi-1,t=fj-1;s>=0 && t>=0;s--,t--,u++)
                                {
                                    if(k==1)
                                    {
                                        if(a[s][t]!=2)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==1 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==1)
                                        {
                                            c=1;
                                            break loop;
                                        }
                                    }
                                    else
                                    {
                                        if(a[s][t]!=1)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==2 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==2)
                                        {
                                            c=2;
                                            break loop;
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

                                /**/
                                loop:for(u=0,s=fi-1,t=fj;s>=0;s--,u++)
                                {
                                    if(k==1)
                                    {
                                        if(a[s][t]!=2)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==1 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==1)
                                        {
                                            c=1;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        if(a[s][t]!=1)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==2 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==2)
                                        {
                                            c=2;
                                            break loop;
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

                                /**/
                                loop:for(u=0,s=fi-1,t=fj+1;s>=0 && t<=7;s--,t++,u++)
                                {
                                    if(k==1)
                                    {
                                        if(a[s][t]!=2)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==1 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==1)
                                        {
                                            c=1;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        if(a[s][t]!=1)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==2 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==2)
                                        {
                                            c=2;
                                            break loop;
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

                                /**/
                                loop:for(u=0,s=fi,t=fj+1;t<=7;t++,u++)
                                {
                                    if(k==1)
                                    {
                                        if(a[s][t]!=2)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==1 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==1)
                                        {
                                            c=1;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        if(a[s][t]!=1)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==2 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==2)
                                        {
                                            c=2;
                                            break loop;
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

                                /**/
                                loop:for(u=0,s=fi+1,t=fj+1;s<=7 && t<=7;s++,t++,u++)
                                {
                                    if(k==1)
                                    {
                                        if(a[s][t]!=2)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==1 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==1)
                                        {
                                            c=1;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        if(a[s][t]!=1)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==2 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==2)
                                        {
                                            c=2;
                                            break loop;
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

                                /**/
                                loop:for(u=0,s=fi+1,t=fj;s<=7;s++,u++)
                                {
                                    if(k==1)
                                    {
                                        if(a[s][t]!=2)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==1 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==1)
                                        {
                                            c=1;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        if(a[s][t]!=1)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==2 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==2)
                                        {
                                            c=2;
                                            break loop;
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

                                /**/
                                loop:for(u=0,s=fi+1,t=fj-1;s<=7 && t>=0;s++,t--,u++)
                                {
                                    if(k==1)
                                    {
                                        if(a[s][t]!=2)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==1 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==1)
                                        {
                                            c=1;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        if(a[s][t]!=1)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==2 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==2)
                                        {
                                            c=2;
                                            break loop;
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

                                /**/
                                loop:for(u=0,s=fi,t=fj-1;t>=0;t--,u++)
                                {
                                    if(k==1)
                                    {
                                        if(a[s][t]!=2)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==1 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==1)
                                        {
                                            c=1;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        if(a[s][t]!=1)
                                        {
                                            if(a[s][t]==0 || (a[s][t]==2 && u==0))
                                            {
                                                c=0;
                                                break;
                                            }
                                        }
                                        if(a[s][t]==2)
                                        {
                                            c=2;
                                            break loop;
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
                                /**/
                                if(done==1)
                                {
                                    if(k==1)
                                    {
                                        blink(k);
                                        k=2;
                                        b[fi][fj].setImageResource(R.drawable.black);
                                        a[fi][fj]=1;
                                        //turn.setText("Turn:Player-2 (White)");
                                    }
                                    else if(k==2)
                                    {
                                        blink(k);
                                        k=1;
                                        b[fi][fj].setImageResource(R.drawable.white);
                                        a[fi][fj]=2;
                                        //turn.setText("Turn:Player-1 (Black)");
                                    }
                                    sum+=1;
                                    if(sum==64)
                                    {
                                        int e,f;
                                        for(e=0;e<8;e++)
                                        {
                                            for(f=0;f<8;f++)
                                            {
                                                if(a[e][f]==1)
                                                {
                                                    black+=1;
                                                }
                                                if(a[e][f]==2)
                                                {
                                                    white+=1;
                                                }
                                            }
                                        }
                                        if(black>white)
                                        {
                                            String strwin="Game Over! Player-1 Won.";
                                            gamefinish(strwin);
                                        }
                                        else if(black<white)
                                        {
                                            String strwin="Game Over! Player-2 won.";
                                            gamefinish(strwin);
                                        }
                                        else
                                        {
                                            String strwin="Game Over! Draw.";
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
        catch(Exception e)
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
                        dialogInterface.cancel();
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
                        Intent intent = new Intent(game2player.this,MainActivity.class);
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
                        Intent intent = new Intent(game2player.this,choisemode.class);
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
        TextView myText = (TextView) findViewById(R.id.setp1text);
        TextView myText1 = (TextView) findViewById(R.id.setp2text);
        if(var==2) {
            Animation anim1 = new AlphaAnimation(0.0f, 1.0f);
            anim1.setDuration(50);
            anim1.setStartOffset(20);
            anim1.setRepeatMode(Animation.REVERSE);
            anim1.setRepeatCount(Animation.INFINITE);
            myText1.clearAnimation();
            myText.startAnimation(anim1);
        }
        else {
            Animation anim2 = new AlphaAnimation(0.0f, 1.0f);
            anim2.setDuration(50);
            anim2.setStartOffset(20);
            anim2.setRepeatMode(Animation.REVERSE);
            anim2.setRepeatCount(Animation.INFINITE);
            myText.clearAnimation();
            myText1.startAnimation(anim2);
        }
    }
}
