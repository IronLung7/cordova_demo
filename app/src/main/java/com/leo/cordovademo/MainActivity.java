package com.leo.cordovademo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.rjfun.cordova.facebookads.FacebookAdPlugin;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.PluginEntry;
import org.apache.cordova.whitelist.WhitelistPlugin;



public class MainActivity extends CordovaActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //super.onCreate(savedInstanceState);
        //master comments
        //test comments
        //test comments2

//        pluginEntries= new ArrayList<PluginEntry>();
//        PluginEntry pluginEntry = new PluginEntry("FacebookAds",new FacebookAdPlugin());
//        pluginEntries.add(pluginEntry);
//        pluginEntry = new PluginEntry("Whitelist",new WhitelistPlugin());
//        pluginEntries.add(pluginEntry);
////        Log.i("leo", "before init:" + pluginEntries.size());
//        super.init();
        //loadUrl("http://121.52.235.232:30006/static/guessemoji_fbads/index.html");
        //loadUrl(launchUrl);
        loadUrl("http://121.52.235.232:30006/static/guessemoji_fbads/demo/index.html");
    }
    //test master
}
