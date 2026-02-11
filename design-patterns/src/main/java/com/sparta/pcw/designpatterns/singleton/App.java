package com.sparta.pcw.designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        SingletonMessenger messenger = SingletonMessenger.getInstance();
        SingletonMessenger messenger2 = SingletonMessenger.getInstance();
        SingletonMessenger messenger3 = SingletonMessenger.getInstance();

        System.out.println(messenger.getMessage());
        System.out.println(messenger2.getMessage());
        System.out.println(messenger3.getMessage());
    }
}
