package com.example.daggerjava;

import javax.inject.Inject;

public class Employee1 {

    @Inject
    public String employeeName = "default";

    @Inject
    public Employee1() {

    }
}
