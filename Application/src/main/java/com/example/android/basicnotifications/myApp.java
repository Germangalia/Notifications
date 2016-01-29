package com.example.android.basicnotifications;

/**
 * Created by ggalia84 on 29/01/16.
 */
import android.app.Application;
import com.onesignal.OneSignal;

public class myApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this).init();
    }
}