package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void when84to5527then28Dot28() {
        double expected = 28.28;
        Point p1 = new Point(4, 27);
        Point p2 = new Point(8, 55);
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus51toMinus21then4Dot12() {
        double expected = 4.12;
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(-2, -5);
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when105to105then7Dot07() {
        double expected = 7.07;
        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 10);
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when73to73to73then6Dot92() {
        double expected = 6.92;
        Point p1 = new Point(3, 3, 3);
        Point p2 = new Point(7, 7, 7);
        double output = p1.distance3d(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when315to810to1142then33Dot30() {
        double expected = 33.30;
        Point p1 = new Point(15, 10, 42);
        Point p2 = new Point(3, 8, 11);
        double output = p1.distance3d(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}