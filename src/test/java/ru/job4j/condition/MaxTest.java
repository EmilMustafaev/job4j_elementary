package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To20Then20() {
        int left = 10;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To7To10Then3() {
        int one = 3;
        int two = 7;
        int three = 10;
        int result = Max.max(one, two, three);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax40To12To8To20Then40() {
        int one = 40;
        int two = 12;
        int three = 8;
        int four = 20;
        int result = Max.max(one, two, three, four);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }
}