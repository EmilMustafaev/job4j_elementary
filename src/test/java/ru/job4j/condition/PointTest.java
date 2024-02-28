package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void when84to5527then28Dot28() {
        double expected = 28.28;
        int x1 = 4;
        int y1 = 27;
        int x2 = 8;
        int y2 = 55;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus51toMinus21then4Dot12() {
        double expected = 4.12;
        int x1 = -1;
        int y1 = -1;
        int x2 = -2;
        int y2 = -5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when105to105then7Dot07() {
        double expected = 7.07;
        int x1 = 5;
        int y1 = 5;
        int x2 = 10;
        int y2 = 10;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}