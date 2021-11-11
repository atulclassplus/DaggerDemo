package com.example.daggerjava.daggersubcomponent;

import com.example.daggerjava.MainActivity2;

import dagger.Subcomponent;

@EmployeeScope
@Subcomponent(modules = {EmployeeModule.class})
public interface EmployeeComponent {
    void inject(EmployeeActivity employeeActivity);
    void inject(MainActivity2 mainActivity2);

//    @Subcomponent.Builder
//    public interface Builder {
//        EmployeeComponent build();
//    }
}
