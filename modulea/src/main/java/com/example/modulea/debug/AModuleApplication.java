package com.example.modulea.debug;

import android.app.Application;
import android.util.Log;

public class AModuleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.w("AModuleApplication", "---AModuleApplication--->>");
    }
}
