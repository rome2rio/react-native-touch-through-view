package com.rome2rio.android.reactnativetouchthroughview;

import android.app.Activity;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TouchThroughViewPackage implements ReactPackage {
    public TouchThroughViewPackage(Activity activity) {
    } // backwards compatability

    public TouchThroughViewPackage() {
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        TouchThroughViewManager touchThroughViewManager = new TouchThroughViewManager();
        TouchThroughWrapperManager touchThroughWrapperManager = new TouchThroughWrapperManager();

        return Arrays.<ViewManager>asList(touchThroughViewManager, touchThroughWrapperManager);
    }
}
