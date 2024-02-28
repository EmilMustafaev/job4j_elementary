package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP20K4Square16() {
        int expected = 16;
        int p = 20;
        double k = 4;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP35K6Square37Dot5() {
        double expected = 37.5;
        int p = 35;
        double k = 6;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}
