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
}