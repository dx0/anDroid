package com.example.dx.firsthomework;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] stringArray = getResources().getStringArray(R.array.textArray);

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);
        LayoutInflater layInflater = getLayoutInflater();

        int sizeOfArray = stringArray.length;
        for (int i = 0; i < sizeOfArray; i++) {
            Log.d("My log", "i = " + i);
            View item = layInflater.inflate(R.layout.item, linLayout, false);
            TextView line1 = (TextView) item.findViewById(R.id.textLine1);
            line1.setText(stringArray[i]);
            TextView line2 = (TextView) item.findViewById(R.id.textLine2);
            line2.setText("Line number: " + (i + 1));
            item.getLayoutParams().width = ActionBar.LayoutParams.MATCH_PARENT;
            linLayout.addView(item);


        }

    }
}
