package com.example.dx.lesson03;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyFragmend extends ListFragment {



    public static Fragment getInstance(String srt) {
        Fragment f = new MyFragmend();
        Bundle bundle = new Bundle();
        bundle.putString("Key", srt);
        f.setArguments(bundle);

        return f;


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        TextView textView = new TextView(getActivity());
        textView.setText("blabla");
        return textView; //можно возвращать любую вьюху.
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyFragmend f = new MyFragmend();
        FragmentManager fn = getFragmentManager();
        fn.beginTransaction()
                .add(R.id.some_fragment, f, "Fragment")
                .commit();

        Fragment f1 = MyFragmend.getInstance("Fragment1");
        Fragment f2 = MyFragmend.getInstance("Fragment1");




    }
}
