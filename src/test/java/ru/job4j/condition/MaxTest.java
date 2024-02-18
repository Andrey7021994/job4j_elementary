package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2o4o5Then5() {
        Max max = new Max();
        int a = 2;
        int b = 1;
        int c = 5;
        int d = 4;
        int result = max.max(a, b, c, d);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        Max max = new Max();
        int a = 3;
        int b = 1;
        int c = 2;
        int result = max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To1Then7() {
        Max max = new Max();
        int a = 2;
        int b = 3;
        int c = 7;
        int d = 6;
        int result = max.max(a, b, c, d);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}

