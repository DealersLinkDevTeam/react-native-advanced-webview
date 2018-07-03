
package com.dealerslink;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RNAdvancedWebviewPackage implements ReactPackage {
    private RNAdvancedWebviewManager manager;
    private RNAdvancedWebviewModule module;

    // Deprecated from RN 0.47
    public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      manager = new RNAdvancedWebviewManager();
      manager.setPackage(this);
      return Arrays.<ViewManager>asList(manager);
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      List <NativeModule> modules = new ArrayList<>();
      module = new RNAdvancedWebviewModule(reactContext);
      module.setPackage(this);
      modules.add(module);
      return modules;
    }

    public RNAdvancedWebviewManager getManager(){
      return manager;
    }

    public RNAdvancedWebviewModule getModule(){
        return module;
    }
}
