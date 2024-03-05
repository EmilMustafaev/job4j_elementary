package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialFor3Then6() {
        int expected = 6;
        int number = 3;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int expected = 1;
        int number = 0;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor1Then1() {
        int expected = 1;
        int number = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

}