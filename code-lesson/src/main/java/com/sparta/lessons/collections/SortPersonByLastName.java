package com.sparta.lessons.collections;

import com.sparta.lessons.Customer;
import java.util.Comparator;

public class SortPersonByLastName implements Comparator<Customer> {

    @Override
    public int compare(Customer person1, Customer person2) {
        return person1.getLastName().compareTo(person2.getLastName());
    }
}
