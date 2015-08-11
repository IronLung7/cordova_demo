package com.leo.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;


/**
 * Created by Leo.Zhu on 15/8/11.
 */
public class LeoWebView extends WebView implements CordovaWebViewEngine.EngineView {
    private CordovaInterface cordova;
    private LeoWebViewEngine parentEngine;

    public LeoWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LeoWebView(Context context) {
        super(context);
    }


    // Package visibility to enforce that only SystemWebViewEngine should call this method.
    void init(LeoWebViewEngine parentEngine, CordovaInterface cordova) {
        this.cordova = cordova;
        this.parentEngine = parentEngine;
//        if (this.viewClient == null) {
//            setWebViewClient(new SystemWebViewClient(parentEngine));
//        }
//
//        if (this.chromeClient == null) {
//            setWebChromeClient(new SystemWebChromeClient(parentEngine));
//        }
    }

    @Override
    public CordovaWebView getCordovaWebView() {
        return parentEngine != null ? parentEngine.getCordovaWebView() : null;
    }
}
