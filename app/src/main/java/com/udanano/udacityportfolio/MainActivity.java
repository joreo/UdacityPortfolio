package com.udanano.udacityportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void toastPop(View v) {
        switch(v.getId())
        {
            case R.id.button_1:
                Toast.makeText(getApplicationContext(), "This will button will launch my Spotify streamer app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_2:
                Toast.makeText(getApplicationContext(), "This will button will launch my scores app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_3:
                Toast.makeText(getApplicationContext(), "This will button will launch my library app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_4:
                Toast.makeText(getApplicationContext(), "This will button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_5:
                Toast.makeText(getApplicationContext(), "This will button will launch my xyz reader", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_6:
                Toast.makeText(getApplicationContext(), "This will button will launch my capstone app", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
