package com.example.daggerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.daggerjava.daggersubcomponent.Employee;
import com.example.daggerjava.daggersubcomponent.EmployeeActivity;
import com.example.daggerjava.daggersubcomponent.EmployeeScope;

import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {

//    @Inject
//    public User user;
//
    @Inject
    public Employee employee1;

    @Inject
    public Employee employee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //ApplicationClass.daggerUserComponent.injectActivity(this);

//        user = ApplicationClass.daggerUserComponent.getUser();
//        employee = ApplicationClass.daggerUserComponent.getEmployee();


        ApplicationClass.daggerEmployeeComponent.inject(this);

        employee1.employeeName = "MainActivity2";

        Intent intent = new Intent(this, EmployeeActivity.class);
        startActivity(intent);

        String data = "";
    }
}