package com.example.daggerjava;

import javax.inject.Inject;
import javax.inject.Named;

public class User {

    @Inject
    public String firstName = "";

//    @Inject
//    //@Named("second_name")
//    public String lastName = "";

    @Inject
    public User() {
        DaggerUserComponent.create().injectUser(this);
    }
}
