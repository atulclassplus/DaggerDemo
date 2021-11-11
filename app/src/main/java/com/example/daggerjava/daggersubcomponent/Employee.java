package com.example.daggerjava.daggersubcomponent;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Employee {

    public String employeeName = "";
    public String firstName = "";

    public Manager _manager;

    @Inject
    public Employee(Manager manager) {
        _manager = manager;
    }
}
