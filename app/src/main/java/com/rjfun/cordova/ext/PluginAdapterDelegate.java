package com.rjfun.cordova.ext;

import android.app.Activity;
import android.view.View;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

public interface PluginAdapterDelegate {
	// context
	public Activity getActivity();
	public View getView();
	
	// send message from plugin to container on events
	public void fireEvent(String obj, String eventName, String jsonData);
	
	// send call result
	public void sendPluginResult(PluginResult result, CallbackContext context);
}

