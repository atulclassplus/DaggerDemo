package com.example.daggerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    @Inject
//    User user;
//
//    @Inject
//    public String firstName = "";
//
//    @Inject
//    public Employee employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ApplicationClass.daggerUserComponent.inject(this);

//        user = ApplicationClass.daggerUserComponent.getUser();
//        user.firstName = "Changed name";
//        employee = ApplicationClass.daggerUserComponent.getEmployee();
//        employee.employeeName = "changed name";

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

        String str1 = "Data1";
        String str2 = str1;

        str2 = "Data2";

        if (str1 == str2) {
            Log.d("d", "true");
        } else {
            Log.d("d", "false");
        }
    }
}