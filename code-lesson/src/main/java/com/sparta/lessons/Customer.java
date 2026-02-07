package com.sparta.lessons;

import java.util.Objects;

public class Customer {

    private String firstName = "";
    private String lastName = "";

    // Key binding for generate is alt + insert

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        // if the values in the stack are the same reference (point to the same object)
        if (this == obj) {
            return true;
        }
        // if they're in different areas of memory
        // java is treating the object as an object type which doesn't have any extra methods
        // so we need to cast it to customer to get access to the getter methods
        return (obj instanceof Customer customer)
                // ^ equivalent of Customer customer = (Customer) obj
                // casts object to type customer and gives variable name customer
                // if it cannot perform the casting, it will return false
                && firstName.equals(customer.getFirstName())
                && lastName.equals(customer.getLastName());
    }

    @Override
    public int hashCode() {
        // hash is a static method of the Objects class
        // this class needs to be imported

        // arguments are a comma-separated list of the values to be used
        // as the basis of the hash
        return Objects.hash(firstName, lastName);
    }
}
