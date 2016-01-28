package com.example.dx.weather;

import android.app.Activity;

import android.os.Bundle;

import org.json.JSONObject;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        weatherFont = Type;


    }
    public void updateWeatherData(final String city){
        new Thread(){
            public void run(){
                final JSONObject jsonObject = Weather.getJSON(getActivity(),city);
            }
        }
    }
    public void changeCity(String city){
        WeatherFragment weatherFragment = (WeatherFragment)
    }
}
