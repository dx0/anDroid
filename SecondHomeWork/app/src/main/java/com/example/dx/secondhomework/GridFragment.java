package com.example.dx.secondhomework;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * Created by Sergio on 24-Dec-15.
 */
public class GridFragment extends Fragment {

    String[] data = {"Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App", "Some App"};
    ArrayAdapter<String> adapter;
    GridView gvMain;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.icon_table,container,false);

    }
}
