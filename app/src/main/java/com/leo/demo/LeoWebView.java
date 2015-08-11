package com.leo.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;


/**
 * Created by Leo.Zhu on 15/8/11.
 */
public class LeoWebView extends WebView implements CordovaWebViewEngine.EngineView {
    private CordovaInterface cordova;
    private LeoWebViewEngine parentEngine;
    private LeoWebViewClient viewClient;
    LeoWebChromeClient chromeClient;

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
        if (this.viewClient == null) {
            setWebViewClient(new LeoWebViewClient(parentEngine));
        }

        if (this.chromeClient == null) {
            setWebChromeClient(new LeoWebChromeClient(parentEngine));
        }
    }

    @Override
    public CordovaWebView getCordovaWebView() {
        return parentEngine != null ? parentEngine.getCordovaWebView() : null;
    }

    @Override
    public void setWebViewClient(WebViewClient client) {
        viewClient = (LeoWebViewClient)client;
        super.setWebViewClient(client);
    }

    @Override
    public void setWebChromeClient(WebChromeClient client) {
        chromeClient = (LeoWebChromeClient)client;
        super.setWebChromeClient(client);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        Boolean ret = parentEngine.client.onDispatchKeyEvent(event);
        if (ret != null) {
            return ret.booleanValue();
        }
        return super.dispatchKeyEvent(event);
    }
}
