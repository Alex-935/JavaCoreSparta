package com.sparta.pcw.designpatterns.singleton;

public class SingletonMessenger {

    // volatile - indicates that a variable needs to be read from main memory and cannot be cached

    /* A thread 'A' may start creating the class and update the 'instance' variable
    with a reference before the class is fully created.
       Thread B may come in and see this and return the instance resulting in a crash
      Volatile ensures this is handled properly   */
    private static volatile SingletonMessenger instance;

    public static SingletonMessenger getInstance() {

        if (instance == null) {
            // makes this thread safe
            // uses a monitor to ensure only one thread can work on the same object at a single time
            synchronized (SingletonMessenger.class) {

                // ensures that another instance hasn't been created since the initial check
                // while waiting for the lock
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
