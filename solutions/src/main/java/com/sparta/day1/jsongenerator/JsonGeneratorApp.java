package com.sparta.day1.jsongenerator;

public class JsonGeneratorApp {
    static void main(String[] args) {
        System.out.printf(
                """
                        {
                          "first_name": "%s",
                          "last_name": "%s",
                          "email": "%s",
                          "phone": "%s",
                          "occupation": "%s",
                          "is_active": %s,
                          "years_service": %s
                        }""",
                args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
    }
}
