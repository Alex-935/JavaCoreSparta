package com.sparta.lessons.oop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main() {

        //Member member = new Member("Phil", "Windbridge", LocalDate.of(2004, 10, 21));

        Member m1 = new Member("Cathy", "French", LocalDate.of(1990, 5, 15));
        Member m2 = new Member("Nish", "Mandal", LocalDate.of(2025, 1, 28));

        System.out.println(m1.getFullName());
        System.out.println(m1.getMemberDays());
        System.out.println(m2.getFullName());
        System.out.println(m2.getMemberDays());

        m2.setLastName("Jones");
        System.out.println(m2.getFullName());

        BaseballMember bm1 = new BaseballMember("Phil", "Windridge", LocalDate.of(2022, 12, 6), "shortshop");
        System.out.println(bm1.getFullName());
        System.out.println(bm1.getMemberDays());
        System.out.println(bm1.getPosition());
        bm1.setPosition("pitcher");
        System.out.println(bm1.getPosition());

        System.out.println(m1.toString());
        System.out.println(bm1.toString());

        List<Member> members = new ArrayList<>(List.of(m1, bm1));
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }
}
