package com.rome2rio.android.reactnativetouchthroughview;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class TouchThroughViewManager
        extends ViewGroupManager<TouchThroughView> {

    public static final String REACT_CLASS = "R2RTouchThroughView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected TouchThroughView createViewInstance(
            ThemedReactContext reactContext) {
        return new TouchThroughView(reactContext);
    }
}
