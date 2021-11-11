package com.example.daggerjava.daggersubcomponent;

import com.example.daggerjava.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    UserManager provideUserManager(){
        return new UserManager();
    }
}
