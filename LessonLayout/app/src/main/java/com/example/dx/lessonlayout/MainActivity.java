package com.example.dx.lessonlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ListView listView = (ListView) findViewById(R.id.listView1);

    String[] listElements = getResources().getStringArray(R.array.listArray);
}
