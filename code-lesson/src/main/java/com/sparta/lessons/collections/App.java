package com.sparta.lessons.collections;

import java.util.*;
import com.sparta.lessons.Customer;

public class App {

    public static void main(String[] args) {

        //arrayLists();
        //hashSet();
        //hashMap();
        sorting();
    }

    static void collections() {

        /*
        https://docs.oracle.com/javase/tutorial/collections/intro/index.html
        https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
         */


    }

    static void arrayLists() {
        /*
        https://docs.oracle.com/javase/tutorial/collections/intro/index.html
        https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

        ArrayLists need to use the wrapper classes in the <>
        Still uses arrays in its implementation
            - when capacity is reached, it creates a new array and moves
              all the values over

         Will only loop over indexes where you have actually put a value,
            unlike arrays that will iterate over all indexes
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Terry");
        names.add("Karen");

        System.out.println(names.get(0));

        for (String name : names) {
            System.out.println(name);
        }
    }

    static void hashSet() {
        /*
        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashSet.html

        Really fast as it accesses hash codes, which is an integer
        */

        HashSet<String> names = new HashSet<>(
                List.of("Terry", "Karen", "Fred", "Jimmy", "Brenda")
        );

        for (String name : names) {
            System.out.println(name);
        }

        //all values are unique so there will only be one version of Fred
        names.add("Fred");
        System.out.println(names);
    }



    static void hashMap() {

        String message = "The cat in the hat comes back"
                .trim()
                .toLowerCase();

        HashMap<Character, Integer> lettersCount = new HashMap<>();

        for (Character letter: message.toCharArray()) {

            if (!letter.equals(' ')) {
                if (lettersCount.containsKey(letter)) {

                    lettersCount.put(letter, lettersCount.get(letter) + 1);

                } else {
                    lettersCount.put(letter, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry: lettersCount.entrySet()) {
            System.out.println(entry);
        }
    }


    static void sorting() {

        List<String> firstNames = new ArrayList<>(

                List.of("Carol", "Brenda", "Jeffrey", "Albert", "Terry")
        );

        Collections.sort(firstNames);
        // applies a method to each element in a collection
        firstNames.forEach(System.out::println);


        Customer cust1 = new Customer();
        cust1.setFirstName("Phil");
        cust1.setLastName("Windridge");
        Customer cust2 = new Customer();
        cust2.setFirstName("Jack");
        cust2.setLastName("Sparrow");
        Customer cust3 = new Customer();
        cust3.setFirstName("Elizabeth");
        cust3.setLastName("Sparrow");
        List<Customer> customers = new ArrayList<>(List.of(cust1, cust2, cust3));

        // we need to have Customer implements Comparable and override compareTo
        Collections.sort(customers);
        for (Customer cust : customers) {
            System.out.printf("%s %s%n", cust.getFirstName(), cust.getLastName());
        }
    }
}
