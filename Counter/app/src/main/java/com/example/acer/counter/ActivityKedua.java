package com.example.acer.counter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Acer on 3/12/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanstr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.nol);
        txtLabel.setText(pesanstr);
    }
}
