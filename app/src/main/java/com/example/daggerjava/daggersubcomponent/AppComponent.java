package com.example.daggerjava.daggersubcomponent;

import com.example.daggerjava.MainActivity;
import com.example.daggerjava.MainActivity2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ActivityBuildersModule.class})
public interface AppComponent {
    void inject1(MainActivity mainActivity);
    void inject2(MainActivity2 mainActivity2);

    EmployeeComponent getEmployeeComponent(EmployeeModule employeeModule);
}
