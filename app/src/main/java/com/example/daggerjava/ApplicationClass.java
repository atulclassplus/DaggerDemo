package com.example.daggerjava;

import android.app.Application;

import com.example.daggerjava.daggersubcomponent.AppComponent;
//import com.example.daggerjava.daggersubcomponent.DaggerAppComponent;
//import com.example.daggerjava.daggersubcomponent.DaggerAppComponent;
import com.example.daggerjava.daggersubcomponent.DaggerAppComponent;
import com.example.daggerjava.daggersubcomponent.EmployeeComponent;
import com.example.daggerjava.daggersubcomponent.EmployeeModule;

public class ApplicationClass extends Application {

    public static UserComponent daggerUserComponent;
    public static AppComponent daggerAppComponent;
    public static EmployeeComponent daggerEmployeeComponent;

    public ApplicationClass() {
        String data = "";
        daggerUserComponent = DaggerUserComponent.create();
        daggerAppComponent = DaggerAppComponent.create();
        daggerEmployeeComponent = daggerAppComponent.getEmployeeComponent(new EmployeeModule());
    }
}
