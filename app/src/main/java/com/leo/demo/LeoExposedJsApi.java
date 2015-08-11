package com.leo.demo;

import android.webkit.JavascriptInterface;

import org.apache.cordova.CordovaBridge;
import org.apache.cordova.ExposedJsApi;
import org.json.JSONException;

/**
 * Created by Leo.Zhu on 15/8/11.
 */
public class LeoExposedJsApi implements ExposedJsApi {
    private final CordovaBridge bridge;

    LeoExposedJsApi(CordovaBridge bridge) {
        this.bridge = bridge;
    }

    @JavascriptInterface
    public String exec(int bridgeSecret, String service, String action, String callbackId, String arguments) throws JSONException, IllegalAccessException {
        return bridge.jsExec(bridgeSecret, service, action, callbackId, arguments);
    }

    @JavascriptInterface
    public void setNativeToJsBridgeMode(int bridgeSecret, int value) throws IllegalAccessException {
        bridge.jsSetNativeToJsBridgeMode(bridgeSecret, value);
    }

    @JavascriptInterface
    public String retrieveJsMessages(int bridgeSecret, boolean fromOnlineEvent) throws IllegalAccessException {
        return bridge.jsRetrieveJsMessages(bridgeSecret, fromOnlineEvent);
    }
}
