package com.example.dx.weather;


import android.app.Activity;
import android.content.SharedPreferences;

public class City {
    SharedPreferences preferences;

    public City(Activity activity){
        preferences= activity.getPreferences(Activity.MODE_PRIVATE);

    }
    String getCity(){
        return preferences.getString("city","Kiev,UA");
    }

    void setCity(String city){
        preferences.edit().putString("city",city).commit();
    }
}
