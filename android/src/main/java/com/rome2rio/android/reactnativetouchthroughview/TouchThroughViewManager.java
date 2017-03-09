package com.rome2rio.android.reactnativetouchthroughview;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class TouchThroughViewManager
        extends SimpleViewManager<TouchThroughView> {

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
