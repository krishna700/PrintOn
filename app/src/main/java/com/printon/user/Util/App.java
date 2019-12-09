package com.printon.user.Util;

import android.app.Application;
import android.content.Context;

import com.google.firebase.FirebaseApp;

public class App extends Application {
    private static App instance;

    private Context context;
    private static AppPreferences appPreference;
    private static Singleton singleton;

    public static App getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
        context = this;
        appPreference = AppPreferences.init(context);
        singleton = new Singleton();
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static AppPreferences getAppPreference() {
        return appPreference;
    }
}
