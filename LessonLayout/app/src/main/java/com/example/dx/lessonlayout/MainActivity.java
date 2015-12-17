package com.example.dx.lessonlayout;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //String[] listElements = getResources().getStringArray(R.array.listArray);
    //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_main,listElements);

}
