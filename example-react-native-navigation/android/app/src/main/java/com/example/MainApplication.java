package com.example;

import android.content.Intent;
import android.support.annotation.Nullable;

import com.facebook.react.ReactPackage;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.controllers.NavigationActivity;
import com.rome2rio.android.reactnativetouchthroughview.TouchThroughViewPackage;

import java.util.List;
import java.util.Arrays;

public class MainApplication extends NavigationApplication {
    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    @Nullable
    @Override
    public List<ReactPackage> createAdditionalReactPackages() {
        return Arrays.<ReactPackage>asList(new TouchThroughViewPackage());
    }

    @Nullable
    @Override
    public String getJSMainModuleName() {
        return "index";
    }

    @Override
    public void startActivity(Intent intent) {
        intent.setClass(NavigationApplication.instance, TouchThroughActivity.class);

        super.startActivity(intent);
    }
}
