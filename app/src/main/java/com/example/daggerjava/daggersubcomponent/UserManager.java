package com.example.daggerjava.daggersubcomponent;

import javax.inject.Inject;

public class UserManager {

    public String userName = "";
    public String email = "";

    @Inject
    public UserManager(){

    }
}
