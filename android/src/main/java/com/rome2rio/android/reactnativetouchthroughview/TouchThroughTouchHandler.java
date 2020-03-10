package com.rome2rio.android.reactnativetouchthroughview;

import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;

public class TouchThroughTouchHandler {

    private List<TouchThroughTouchHandlerListener> listeners = new ArrayList();

    public void addListener(TouchThroughTouchHandlerListener listener) {
        listeners.add(listener);
    }

    public void removeListener(TouchThroughTouchHandlerListener listener) {
        listeners.remove(listener);
    }

    public void handleTouchEvent(MotionEvent ev) {
        for (TouchThroughTouchHandlerListener listener : listeners) {
            listener.handleTouch(ev);
        }
    }
}
