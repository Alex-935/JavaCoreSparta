package com.sparta.pcw.designpatterns.singleton;

public class OptimisedSingleton {

    private volatile static OptimisedSingleton instance;

    public OptimisedSingleton getInstance() {

        // the variable isn't volatile so can be cached
        // not having to wait for main memory can increase performance by upto 40%
        OptimisedSingleton myInstance = instance;

        if (myInstance == null) {

            // we must pass in the name of the class as we can not instantiate the class
            // to use this
            synchronized (OptimisedSingleton.class) {

                // ensures we get the most up-to-date version of instance
                // as its now monitor locked and prevents using an out of date value
                myInstance = instance;

                if (myInstance == null) {
                    myInstance = new OptimisedSingleton();
                }
            }
        }
        return myInstance;
    }

    private OptimisedSingleton() {}
}
