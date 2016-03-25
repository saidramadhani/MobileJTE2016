package com.example.acer.tugas10_usernamepassword;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

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
    public void onClickBtnLogin (View view){
        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword.PREF_BERSAMA", Context.MODE_PRIVATE);
        String userPref = sharedPreferences.getString("user", "admin");
        String passPref = sharedPreferences.getString("pass", "1234");

        EditText inputUsername = (EditText) findViewById(R.id.inputUsername);
        String usernameStr = inputUsername.getText().toString();
        EditText inputPassword = (EditText) findViewById(R.id.inputPassword);
        String passwordStr = inputPassword.getText().toString();

        if(usernameStr.equals(userPref)){
            if(passwordStr.equals(passPref)) {
                Intent pesan = new Intent(getApplicationContext(), ActivityHalamanUtama.class);
                pesan.putExtra("var1", "Peu Haba "+userPref);
                startActivity(pesan);
            }else{
                Toast toast = Toast.makeText(this, "Password Salah!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }

        }else{
            Toast toast = Toast.makeText(this, "Username Tidak Ada!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
}