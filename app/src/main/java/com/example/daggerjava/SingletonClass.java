package com.example.daggerjava;

public class SingletonClass {

    private static SingletonClass _singleton = null;

    private SingletonClass() {

    }

    public SingletonClass getInstance() {
        if(_singleton == null) {
            synchronized (_singleton) {
                if (_singleton == null) {
                    _singleton = new SingletonClass();
                }
            }
        }

        return _singleton;
    }
}
