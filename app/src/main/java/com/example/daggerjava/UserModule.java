package com.example.daggerjava;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    @Singleton
    public User getUser() {
        User user = new User();
        return user;
    }

    @Provides
    public String getFirstName() {
        return "A.K Garg";
    }

//    @Provides
//    @Named("second_name")
//    public String getSecondName() {
//        return "Garg";
//    }

}
