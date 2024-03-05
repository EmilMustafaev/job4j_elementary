package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart3Finish11ThenSum63() {
        int start = 3;
        int finish = 11;
        int output = Counter.sum(start, finish);
        int expected = 63;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish5ThenSum0() {
        int start = 10;
        int finish = 5;
        int output = Counter.sum(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To41Then418() {
        int start = 3;
        int finish = 41;
        int result = Counter.sumByEven(start, finish);
        int expected = 418;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus7To25Then144() {
        int start = -7;
        int finish = 25;
        int result = Counter.sumByEven(start, finish);
        int expected = 144;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To1Then144() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}