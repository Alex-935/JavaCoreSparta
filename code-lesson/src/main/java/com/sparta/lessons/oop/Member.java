package com.sparta.lessons.oop;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Member {

    private final String firstName;
    private String lastName;
    private final LocalDate joinDate;

    public Member(String firstName, String lastName, LocalDate joinDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
    }
     /*
     There is a default implementation of the constructor that is used by default
     if you overwrite it at all, you lose access to it
      */
    //public Member() {}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public long getMemberDays() {

        //return ChronoUnit.DAYS.between(this.joinDate, LocalDate.now());
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);

    }

    @Override
    public String toString() {
        return getFullName() + " has been a member for " + getMemberDays() + " days.";
    }
}