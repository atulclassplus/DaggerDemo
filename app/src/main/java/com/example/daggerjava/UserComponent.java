package com.example.daggerjava;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UserModule.class, EmployeeModule.class})
public interface UserComponent {
    void inject(MainActivity activity);

    void injectUser(User user);

    void injectActivity(MainActivity2 activity2);

    User getUser();

    Employee1 getEmployee();
}
