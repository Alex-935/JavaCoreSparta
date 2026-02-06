package com.sparta.lessons;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");


        // to run ctrl + shift + f10

        // Open terminal with alt + f12
        // or 4 bars in top-left -> view -> Tool Windows -> Terminal (near bottom)
    /*
    Manually run java file in terminal
        - convert yto bytecode : javac -d .\target\classes\ .\src\main\java\com\sparta\setup\HelloWorld.java
        - run .class file      : java -cp .\target\classes\ com.sparta.setup.HelloWorld

     You can put _s inside numbers to make them more readable
     5000000 = 5_000_000
     */


    /*
    More Shortcuts:
        - ctrl + e: recent files
        - alt + home: Navigation bar
        - ctrl + n: class
        - ctrl + shift + n: file

        - ctrl + b: takes you to the documentation of the highlighted thing e.g. method
        - shift + f6: rename variables
     */



    /*
    Postfix vs Prefix increment:

        - for postfix, it assigns the value of x and then increments
        - for prefix, it increments the value and then assigns it
     */
        int x = 5;
        int y = 5;
        System.out.printf("Postfix: x++ = %d : Subsequent value of x = %d%n", x++, x);
        System.out.printf("Prefix: ++x = %d : Subsequent value of x = %d%n", ++y, y);
        // in the first line, x is assigned to the first %d and is then incremented so it is still 5 in the string.
        // for prefix, the increment happens before it is assigned to %d so has a value of 6 in both

        int a = x++; // a: 6, x: 7  - because the value of x is assigned to a before it is incremented
        int b = ++y; // b: 7, y: 7  - because the increment happens before the assignment to b
        System.out.printf("A: %d, B: %d%n", a, b);


        //Exercise
        int j = 5, k = 3, m = 4;
        m += +j++ + ++k;
        System.out.printf("m: %d, j: %d, k: %d%n", m, j, k);
        //m = 4 + 5 + 4 = 13; j = 6; k = 4;


        /*
            Jane's birthday is 23 days from now.
            How many weeks and days is that?

            Write a short program using three int variables
            that works this out and displays the result.
         */
        int daysRemaining = 23;
        int weeksRemaining = 23 / 7;
        daysRemaining %= 7;
        System.out.printf("There are %d weeks and %d days remaining until Jane's birthday%n", weeksRemaining, daysRemaining);


        /*
            Logical Operators:
                and - &&
                    - a single & can be used if you want both sides to run
         */
        int i = 2;
        // using && would only check the left hand side
        if (5 == 4 & i++ == 3) {
            System.out.println("cool beans");
        }
        System.out.println("i still increments: " + i);

        // using || would only check the left side
        if (5 == 5 | i++ == 3) {
            System.out.println("i still increments: " + i);
        }
        //System.out.println("i still increments: " + i);


        // == always compares items in the stack,
        //which is why we cannot use == on Strings as it is comparing the reference

    }
}

