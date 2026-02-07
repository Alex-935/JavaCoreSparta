package com.sparta.lessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CustomerTest {

    @Test
    @DisplayName("My first test")
    void firstTest() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Given two identical customer objects, equals returns true")
    void equalsTest() {
        Customer phil = new Customer();
        phil.setFirstName("Phil");
        phil.setLastName("Windridge");

        Customer connie = new Customer();
        connie.setFirstName("Connie");
        connie.setLastName("Fong");

        Assertions.assertFalse(phil.equals(connie));
    }

    @Test
    @DisplayName("Given the same customer objects, equals returns true")
    void equalsSameCustomerTest() {
        Customer phil = new Customer();
        phil.setFirstName("Phil");
        phil.setLastName("Windridge");

        Assertions.assertTrue(phil.equals(phil));
    }

    @Test
    @DisplayName("Given two identical customer objects, equals returns true")
    void equalsSameDetailsTest() {
        Customer phil = new Customer();
        phil.setFirstName("Phil");
        phil.setLastName("Windridge");

        Customer phil2 = new Customer();
        phil2.setFirstName("Phil");
        phil2.setLastName("Windridge");

        Assertions.assertTrue(phil.equals(phil2));
    }
}
