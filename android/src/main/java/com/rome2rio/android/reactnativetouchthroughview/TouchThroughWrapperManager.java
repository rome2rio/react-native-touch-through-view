package com.rome2rio.android.reactnativetouchthroughview;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;


public class TouchThroughWrapperManager
        extends ViewGroupManager<TouchThroughWrapper> {

    public static final String REACT_CLASS = "R2RTouchThroughWrapper";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public TouchThroughWrapper createViewInstance(ThemedReactContext context) {
        TouchThroughWrapper view = new TouchThroughWrapper(context);
        view.addActivityListener();
        return view;
    }

    @Override
    public void onDropViewInstance(TouchThroughWrapper view) {
        view.removeActivityListener();
    }
}
