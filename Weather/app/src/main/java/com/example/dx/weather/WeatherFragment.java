package com.example.dx.weather;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by Sergio on 28-Jan-16.
 */
public class WeatherFragment extends Fragment {
    Typeface weatherFont;

    TextView cityField;
    TextView updateField;
    TextView detailsField;
    TextView currentTemperatureField;
    TextView weatherIcon;

    Handler handler;


    public WeatherFragment(){
        handler=new Handler() {
            @Override
            public void close() {

            }

            @Override
            public void flush() {

            }

            @Override
            public void publish(LogRecord record) {

            }
        };

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.weather_detail,container,false);
        cityField =(TextView)rootView.findViewById(R.id.city);
        updateField =(TextView)rootView.findViewById(R.id.updated_field);
        updateField =(TextView)rootView.findViewById(R.id.updated_field);
        detailsField =(TextView)rootView.findViewById(R.id.datails);
        currentTemperatureField =(TextView)rootView.findViewById(R.id.current_temperature);
        weatherIcon = (TextView)rootView.findViewById(R.id.weather_icon);
        weatherIcon.setTypeface(weatherFont);

        return rootView;
    }
}
