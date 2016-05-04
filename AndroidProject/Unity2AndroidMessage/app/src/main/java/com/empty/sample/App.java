package com.empty.sample;

import android.app.Application;

/**
 * Created by mr3mpty on 03.05.2016.
 */
public class App extends Application{

    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static App getInstance() {
        return instance;
    }
}
