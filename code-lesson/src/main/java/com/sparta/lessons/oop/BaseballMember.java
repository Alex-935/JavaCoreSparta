package com.sparta.lessons.oop;

import java.time.LocalDate;

public class BaseballMember extends Member {

    private String position;

    // because it extends member, it must instantiate Member, so must call the constructer
    public BaseballMember(String firstName, String lastName, LocalDate joinDate, String position) {
        super(firstName, lastName, joinDate);

        this.position = position;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + " Position: " + position;
    }
}
