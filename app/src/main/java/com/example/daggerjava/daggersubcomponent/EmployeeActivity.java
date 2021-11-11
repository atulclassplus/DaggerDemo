package com.example.daggerjava.daggersubcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerjava.ApplicationClass;
import com.example.daggerjava.R;

import javax.inject.Inject;

public class EmployeeActivity extends AppCompatActivity {

    @Inject
    public Employee employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee2);

        ApplicationClass.daggerEmployeeComponent.inject(this);
        //ApplicationClass.daggerEmployeeComponent.inject(this);

        String employeeName = employee.employeeName;
    }
}