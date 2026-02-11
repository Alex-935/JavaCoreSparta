package com.sparta.pcw.designpatterns.singleton;

public class SingletonMessenger {

    private static SingletonMessenger instance;

    public static SingletonMessenger getInstance() {

        if (instance == null) {
            synchronized (SingletonMessenger.class) {
                if (instance == null) {
                    instance = new SingletonMessenger();
                }
            }
        }
        return instance;
    }

    private SingletonMessenger() { }

    public String getMessage() {
        return "There is only 1 of me! Proof --> " + this.hashCode();
    }
}
