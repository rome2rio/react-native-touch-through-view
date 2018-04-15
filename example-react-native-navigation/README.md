# Example for react-native-navigation

This example is copied from https://github.com/wix/react-native-navigation/tree/master/example

It shows how to implement react-native-navigation for android

## Javascript

An example for the javascript part is under the "Push" section and in the file: src/screens/types/Push.js

## Android

### Implementation Details

Use TouchThroughActivity from `android/app/src/main/java/com/example/TouchThroughActivity.java` as implementation for the `TouchThroughTouchHandlerInterface` interface

Add `<activity android:name=".TouchThroughActivity" />` to `AndroidManifest.xml`

Override `startActivity` in NavigationApplication

```java
@Override
public void startActivity(Intent intent) {
    intent.setClass(NavigationApplication.instance, TouchThroughActivity.class);

    super.startActivity(intent);
}
```