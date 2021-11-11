package com.example.daggerjava.daggersubcomponent;

import com.example.daggerjava.MainActivity2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @EmployeeScope
    @ContributesAndroidInjector
    abstract MainActivity2 provideMainActivity2();
}
