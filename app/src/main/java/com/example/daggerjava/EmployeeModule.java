package com.example.daggerjava;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class EmployeeModule {

    @Provides
    @Singleton
    public Employee1 getEmployee() {
        return new Employee1();
    }

}
