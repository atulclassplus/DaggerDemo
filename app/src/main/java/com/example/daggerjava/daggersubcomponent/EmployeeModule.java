package com.example.daggerjava.daggersubcomponent;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

@Module
public class EmployeeModule {

    @Provides
    @EmployeeScope
    Employee provideEmployee() {
        return new Employee(provideManager());
    }

    @Provides
    Manager provideManager() {
        return new Manager();
    }
}
