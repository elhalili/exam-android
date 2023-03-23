package com.elhalili.exam_android;

import android.app.Application;

import com.elhalili.exam_android.business.DefaultServices;
import com.elhalili.exam_android.business.Services;

public class MyContext extends Application {
    private Services services;
    @Override
    public void onCreate() {
        super.onCreate();
        services = DefaultServices.getInstance();
    }

    public Services getServices() {
        return services;
    }
}
