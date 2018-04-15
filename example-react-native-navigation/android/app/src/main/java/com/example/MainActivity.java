package com.example;

import com.reactnativenavigation.controllers.SplashActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import com.rome2rio.android.reactnativetouchthroughview.TouchThroughTouchHandlerInterface; 
import com.rome2rio.android.reactnativetouchthroughview.TouchThroughTouchHandler;
import android.view.View;

public class MainActivity extends SplashActivity {
    @Override
    public View createSplashLayout() {
        return new View(this);   // <====== TO AVOID WHITE BACKGROUND
    }
}