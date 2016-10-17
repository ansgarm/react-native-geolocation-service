
package com.amrtns.geolocationservice;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNGeolocationServiceModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNGeolocationServiceModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNGeolocationService";
  }

  @ReactMethod
  public String initGeolocation() {
    Log.v("GEOLOCATION", "called initGeolocation");
    return ":::: INIT ::::";
  }

}
