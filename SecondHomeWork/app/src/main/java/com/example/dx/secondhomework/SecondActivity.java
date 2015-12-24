package com.example.dx.secondhomework;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * Created by Sergio on 20-Dec-15.
 */
public class SecondActivity extends Activity {
    String[] data = {"Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App"};

    GridView gvMain;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_content_layout);
        adapter = new ArrayAdapter<String>(this, R.layout.grid_content, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.grid);
        gvMain.setAdapter(adapter);
    }
}
