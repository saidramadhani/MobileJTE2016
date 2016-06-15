package com.example.acer.menuselforder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClickButton (View view) {
        final Intent pesan = new Intent(getApplicationContext(), activity_kedua.class);

        final TextView t1 = (TextView) findViewById(R.id.t1);
        final TextView t2 = (TextView) findViewById(R.id.t2);
        final TextView t3 = (TextView) findViewById(R.id.t3);
        final TextView t4 = (TextView) findViewById(R.id.t4);
        final TextView t5 = (TextView) findViewById(R.id.t5);
        final TextView t6 = (TextView) findViewById(R.id.t6);
        final TextView t7 = (TextView) findViewById(R.id.t7);
        final TextView t8 = (TextView) findViewById(R.id.t8);
        final TextView t9 = (TextView) findViewById(R.id.t9);
        final TextView t10 = (TextView) findViewById(R.id.t10);


        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn1_1 = (Button) findViewById(R.id.btn1_1);

        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn2_1 = (Button) findViewById(R.id.btn2_1);

        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn3_1 = (Button) findViewById(R.id.btn3_1);

        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn4_1 = (Button) findViewById(R.id.btn4_1);

        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn6_1 = (Button) findViewById(R.id.btn6_1);

        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn7_1 = (Button) findViewById(R.id.btn7_1);

        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn5_1 = (Button) findViewById(R.id.btn5_1);

        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn8_1 = (Button) findViewById(R.id.btn8_1);

        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn9_1 = (Button) findViewById(R.id.btn9_1);

        Button btn10 = (Button) findViewById(R.id.btn10);
        Button btn10_1 = (Button) findViewById(R.id.btn10_1);

        Button btnSelesai = (Button) findViewById(R.id.btnSelesai);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                t1.setText((String.valueOf(a)));
                pesan.putExtra("var1", "Asam Keueung");
                pesan.putExtra("var2", (String.valueOf(a)));
            }
        });

        btn1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a--;
                t1.setText((String.valueOf(a)));

                if (a <= 0) {

                    a = 0;
                    t1.setText((String.valueOf(a)));

                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                t2.setText((String.valueOf(b)));
                pesan.putExtra("var3", "Asam Sunti");
                pesan.putExtra("var4", (String.valueOf(b)));
            }
        });

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b--;
                t2.setText((String.valueOf(b)));

                if (a <= 0) {

                    a = 0;
                    t2.setText((String.valueOf(b)));

                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                t3.setText((String.valueOf(c)));
                pesan.putExtra("var5", "Ayam Tangkap");
                pesan.putExtra("var6", (String.valueOf(c)));
            }
        });

        btn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c--;
                t3.setText((String.valueOf(c)));

                if (c <= 0) {

                    c = 0;
                    t3.setText((String.valueOf(c)));

                }
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d++;
                t4.setText((String.valueOf(d)));
                pesan.putExtra("var7", "Kari Kambing");
                pesan.putExtra("var8", (String.valueOf(d)));
            }
        });

        btn4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d--;
                t4.setText((String.valueOf(d)));

                if (d <= 0) {

                    d = 0;
                    t4.setText((String.valueOf(d)));

                }
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e++;
                t5.setText((String.valueOf(e)));
                pesan.putExtra("var9", "Keumamah");
                pesan.putExtra("var10", (String.valueOf(e)));
            }
        });

        btn6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e--;
                t5.setText((String.valueOf(e)));

                if (e <= 0) {

                    e = 0;
                    t5.setText((String.valueOf(e)));

                }
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                t6.setText((String.valueOf(f)));
                pesan.putExtra("var11", "Kopi Tubruk");
                pesan.putExtra("var12", (String.valueOf(f)));
            }
        });

        btn7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f--;
                t6.setText((String.valueOf(f)));

                if (f <= 0) {

                    f = 0;
                    t6.setText((String.valueOf(f)));

                }
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g++;
                t7.setText((String.valueOf(g)));
                pesan.putExtra("var13", "Kuah Beulangong");
                pesan.putExtra("var14", (String.valueOf(g)));
            }
        });

        btn5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g--;
                t7.setText((String.valueOf(g)));

                if (g <= 0) {

                    g = 0;
                    t7.setText((String.valueOf(g)));

                }
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h++;
                t8.setText((String.valueOf(h)));
                pesan.putExtra("var15", "Gulee Pliek Ue");
                pesan.putExtra("var16", (String.valueOf(h)));
            }
        });

        btn8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h--;
                t8.setText((String.valueOf(h)));

                if (h <= 0) {

                    h = 0;
                    t8.setText((String.valueOf(h)));

                }
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                t9.setText((String.valueOf(i)));
                pesan.putExtra("var17", "Soto Aceh");
                pesan.putExtra("var18", (String.valueOf(i)));

            }
        });

        btn9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                t9.setText((String.valueOf(i)));

                if (i <= 0) {

                    i = 0;
                    t9.setText((String.valueOf(i)));

                }
            }
        });


        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j++;
                t10.setText((String.valueOf(j)));
                pesan.putExtra("var19", "Sambai Oen Peugaga");
                pesan.putExtra("var20", (String.valueOf(j)));
            }
        });

        btn10_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j--;
                t10.setText((String.valueOf(j)));

                if (j <= 0) {

                    j = 0;
                    t10.setText((String.valueOf(j)));

                }
            }
        });

        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(pesan);
            }
        });
    }

    int a=0;
    int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        int j=0;
}


