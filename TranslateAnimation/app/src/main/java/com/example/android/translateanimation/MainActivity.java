package com.example.android.translateanimation;


import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout l;Button change;
    TextView stone1, stone2, stone3, stone4, stone5, stone6;
    int cnt = 0;int i=0;int k=0;int w;
    int x1=0;int x2=0;int x3=0;int x4=0;int x5=0;int x6=0;
    TextView[] b = new TextView[5];TextView ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stone1 = (TextView) findViewById(R.id.stone1);
        stone2 = (TextView) findViewById(R.id.stone2);
        stone3 = (TextView) findViewById(R.id.stone3);
        stone4 = (TextView) findViewById(R.id.stone4);
        stone5 = (TextView) findViewById(R.id.stone5);
        stone6 = (TextView) findViewById(R.id.stone6);
        l = (LinearLayout) findViewById(R.id.layout);
        change=(Button) findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stone1.setVisibility(View.VISIBLE);
                stone2.setVisibility(View.VISIBLE);
                stone3.setVisibility(View.VISIBLE);
                stone4.setVisibility(View.VISIBLE);
                stone5.setVisibility(View.VISIBLE);
                stone6.setVisibility(View.VISIBLE);

                if(i>0&&i<5&&k==1)
                { int diff=5-i+1;
                    for(;diff>0;diff--)
                    { createrandom(i);}
                }
                if(i==0)   {   for( w=0;w<5;w++)
                {createrandom(w);}
                }
                if(x1==0)
        {stone1.setVisibility(View.GONE);}
        if(x2==0)
        {stone2.setVisibility(View.GONE);}
        if(x3==0)
        {stone3.setVisibility(View.GONE);}
        if(x4==0)
        {stone4.setVisibility(View.GONE);}
        if(x5==0)
        {stone5.setVisibility(View.GONE);}
        if(x6==0)
        {stone6.setVisibility(View.GONE);}
                i=0;x1=0;x2=0;x3=0;x4=0;x5=0;x6=0;}
        });
        l.setOnClickListener(new View.OnClickListener() {

                                 @Override
                                 public void onClick(View v) {
                                     int val = 1;

                                     if(cnt==0) {
                                         val = randomfn();
                                         if (val == 1) {
                                             ball = b[0];
                                         }
                                         if (val == 2) {
                                             ball = b[1];
                                         }
                                         if (val == 3) {
                                             ball = b[2];
                                         }
                                         if (val == 4) {
                                             ball = b[3];
                                         }
                                         if (val == 5) {
                                             ball = b[4];
                                         }
                                     }
                                     ObjectAnimator animatorY;
                                     if (cnt == 0) {
                                         animatorY = ObjectAnimator.ofFloat(ball, "y", 2000f);
                                         cnt = 1;
                                     } else {
                                         animatorY = ObjectAnimator.ofFloat(ball, "y", 0.0f);
                                         cnt = 0;
                                     }
                                     animatorY.setDuration(2000);
                                     AnimatorSet animatorSet = new AnimatorSet();
                                     animatorSet.playTogether(animatorY);
                                     animatorSet.start();


                                 }
                             }
        );
    }

    private int randomfn()
    { int random = 1 + (int) (Math.random() * ((5 - 1) + 1));
      return (random); }

    public  void choose(View view) {k=1;
            if(i<5) {
                if (view.getId() == R.id.stone1) {
                    final int finalI = i;
                    if (x1 == 0) {
                        b[finalI] = stone1;
                        x1 = 1;
                        i++;
                    } else {
                        Toast.makeText(this, "Already chosen", Toast.LENGTH_SHORT).show();
                    }
                }

                if (view.getId() == R.id.stone2) {
                    final int finalI = i;
                    if (x2 == 0) {
                        b[finalI] = stone2;
                        x2 = 1;
                        i++;
                    } else
                        Toast.makeText(this, "Already chosen", Toast.LENGTH_SHORT);
                }
                if (view.getId() == R.id.stone3) {
                    final int finalI = i;
                    if (x3 == 0) {
                        b[finalI] = stone3;
                        x3 = 1;
                        i++;
                    } else {
                        Toast.makeText(this, "Already chosen", Toast.LENGTH_SHORT);
                    }
                }
                if (view.getId() == R.id.stone4) {
                    final int finalI = i;
                    if (x4 == 0) {
                        b[finalI] = stone4;
                        x4 = 1;

                        i++;
                    } else {
                        Toast.makeText(this, "Already chosen", Toast.LENGTH_SHORT);
                    }
                }

                if (view.getId() == R.id.stone5) {
                    final int finalI = i;
                    if (x5 == 0) {
                        b[finalI] = stone5;
                        x5 = 1;
                        i++;
                    } else {
                        Toast.makeText(this, "Already chosen", Toast.LENGTH_SHORT);
                    }
                }
                if (view.getId() == R.id.stone6) {
                    final int finalI = i;
                    if (x6 == 0) {
                        b[finalI] = stone6;
                        x6 = 1;
                        i++;
                    } else {
                        Toast.makeText(this, "Already chosen", Toast.LENGTH_SHORT);
                    }
                }

            }
            else{Toast.makeText(this,"Five already chosen..Press Choose to select again",Toast.LENGTH_LONG).show();}
    }
private void createrandom(int j)
   { int random = 1 + (int) (Math.random() * ((6 - 1) + 1));
    if(random==1){if(x1==0){b[j]=stone1;x1=1;}else{--w;return;}}
    if(random==2){if(x2==0){b[j]=stone2;x2=1;}else{--w;return;}}
    if(random==3){if(x3==0){b[j]=stone3;x3=1;}else{--w;return;}}
    if(random==4){if(x4==0){b[j]=stone4;x4=1;}else{--w;return;}}
    if(random==5){if(x5==0){b[j]=stone5;x5=1;}else{--w;return;}}
    if(random==6){if(x6==0){b[j]=stone6;x6=1;}else{--w;return;}}

       }
public void reset(View view)
{recreate();

}


}