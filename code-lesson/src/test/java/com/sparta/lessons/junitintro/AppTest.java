package com.sparta.lessons.junitintro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("greeting, when given a time of 21, returns good evening")
    void greeting21ReturnsGoodEveningTest() {

        // Arrange
        int time = 21;
        String expected = "Good Evening!";

        //Act
        String actual = App.greeting(time);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    /*
        Any unit test can be broken down into 3 elements
        The 3 A's are: arrange, act and assert
            - Arrange: Set-up of the state
            - Act: Some action taking place
            - Assert: Some action happening against it
     */
}
