package com.rome2rio.android.reactnativetouchthroughview;

import android.view.MotionEvent;

public class TouchThroughTouchHandler {

    private TouchThroughTouchHandlerListener listener = null;

    public void setListener(TouchThroughTouchHandlerListener listener) {
        this.listener = listener;
    }

    public void handleTouchEvent(MotionEvent ev) {
        if (listener != null) {
            listener.handleTouch(ev);
        }
    }
}
