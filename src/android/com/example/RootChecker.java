/**
 */
package com.example;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import com.scottyab.rootbeer.RootBeer;
import android.content.Context;



import android.util.Log;

import java.util.Date;

public class RootChecker extends CordovaPlugin {
  private static final String TAG = "MyCordovaPlugin";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Initializing MyCordovaPlugin");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
     if(action.equals("isRooted")) {
Context context=this.cordova.getActivity().getApplicationContext(); 
     RootBeer rootBeer = new RootBeer(context);
    if (rootBeer.isRootedWithoutBusyBoxCheck()) {
     final PluginResult result = new PluginResult(PluginResult.Status.OK, ("true"));
      callbackContext.sendPluginResult(result);
} else {
     final PluginResult result = new PluginResult(PluginResult.Status.OK, ("false"));
      callbackContext.sendPluginResult(result);
}


     
    }
    return true;
  }

}
