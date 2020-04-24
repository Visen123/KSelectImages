package com.yanyiyun.kselectimages;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by KCrason on 2016/6/7.
 */
public class KApplication extends Application {


    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }
}
