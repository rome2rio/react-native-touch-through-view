package com.example;


import android.view.MotionEvent;

import com.reactnativenavigation.controllers.NavigationActivity;
import com.rome2rio.android.reactnativetouchthroughview.TouchThroughTouchHandler;
import com.rome2rio.android.reactnativetouchthroughview.TouchThroughTouchHandlerInterface;

public class TouchThroughActivity extends NavigationActivity implements TouchThroughTouchHandlerInterface {
    private TouchThroughTouchHandler touchThroughTouchHandler = new TouchThroughTouchHandler();

    public TouchThroughTouchHandler getTouchThroughTouchHandler() {
        return touchThroughTouchHandler;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        touchThroughTouchHandler.handleTouchEvent(ev);

        return super.dispatchTouchEvent(ev);
    }
}
