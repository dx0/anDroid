package com.example.dx.secondhomework;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    String[] data = {"Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App"};

    GridView gvMain;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        adapter = new ArrayAdapter<String>(this, R.layout.grid_content, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.grid);
        gvMain.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar grid_content clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//        startActivity(intent);

        //noinspection SimplifiableIfStatement

        Intent startAndroidSettingIntent = new Intent(Settings.ACTION_SETTINGS);
        startActivity(startAndroidSettingIntent);
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickCall(View view) {
        Intent callIntent = new Intent(Intent.ACTION_CALL_BUTTON);
        startActivity(callIntent);
    }

    public void onClickSms(View view) {
        Intent smsIntent = new Intent(Intent.ACTION_VIEW);
        smsIntent.putExtra("sms_body", "");
        smsIntent.setType("vnd.android-dir/mms-sms");
        startActivity(smsIntent);
    }
    public void clicAllApps(View view){

    }

}

