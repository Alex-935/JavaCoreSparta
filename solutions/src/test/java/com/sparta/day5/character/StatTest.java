package com.sparta.day5.character;

import com.sparta.day5.character.Stat;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StatTest {
    @Test
    @DisplayName("Given stat of 3, getSurplus returns 0")
    void getSurplusReturns0() {
        Stat stat = new Stat("stat", 3);
        int available = stat.getAvailable();
        MatcherAssert.assertThat(stat.getAvailable(), Matchers.is(0));
    }

    @Test
    @DisplayName("Given stat of 18, getAvailable returns 7")
    void getSurplusReturns7() {
        Stat stat = new Stat("stat", 18);
        MatcherAssert.assertThat(stat.getAvailable(), Matchers.is(7));
    }

    @Test
    @DisplayName("Given required class points of 15 and stat of 14, getAvailable returns 0")
    void getSurplusNeeding15With14Returns0() {
        Stat stat = new Stat("stat", 14, 15);
        MatcherAssert.assertThat(stat.getAvailable(), Matchers.is(0));
    }

    @Test
    @DisplayName("Given required class points of 15 and stat of 18, getAvailable returns 1")
    void getSurplusNeeding15With18Returns1() {
        Stat stat = new Stat("stat", 18, 15);
        MatcherAssert.assertThat(stat.getAvailable(), Matchers.is(1));
    }

    @Test
    @DisplayName("Given required class points of 15 and stat of 15, getDeficit returns 0")
    void getDeficitNeeding15With15Returns0() {
        Stat stat = new Stat("stat", 15, 15);
        MatcherAssert.assertThat(stat.getDeficit(), Matchers.is(0));
    }

    @Test
    @DisplayName("Given required class points of 15 and stat of 14, getDeficit returns 1")
    void getDeficitNeeding15With14Returns1() {
        Stat stat = new Stat("stat", 14, 15);
        MatcherAssert.assertThat(stat.getDeficit(), Matchers.is(1));
    }

    @Test
    @DisplayName("Given required class points of 15 and stat of 16, getDeficit returns 0")
    void getDeficitNeeding15With16Returns0() {
        Stat stat = new Stat("stat", 16, 15);
        MatcherAssert.assertThat(stat.getDeficit(), Matchers.is(0));
    }

    @ParameterizedTest
    @DisplayName("Given stat requesting points, with 3 points minimum for stat, takePoints returns floored half requested")
    @CsvSource({
            "18, 15, 7",
            "3, 15, 0",
            "4, 1, 0",
            "5, 3, 1",
            "5, 4, 0",
    })
    void takePointsWithMinimumOf3ReturnsCorrectAmount(int given, int requesting, int returns) {
        Stat stat = new Stat("stat", given);
        MatcherAssert.assertThat(stat.takePoints(requesting), Matchers.is(returns));
    }

}
