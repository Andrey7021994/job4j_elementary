package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to55then7() {
        double expected = 7.07;
        Point a2 = new Point(0, 0, 0);
        Point b2 = new Point(0, 5, 5);
        double out = a2.distance3d(b2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to64then7dot21() {
        double expected = 7.21;
        Point a3 = new Point(0, 0);
        Point b3 = new Point(6, 4);
        double out = a3.distance(b3);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when18to25then3dot16() {
        double expected = 3.16;
        Point a4 = new Point(1, 8);
        Point b4 = new Point(2, 5);
        double out = a4.distance(b4);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when52to43then1dot41() {
        double expected = 1.41;
        Point a5 = new Point(5, 2);
        Point b5 = new Point(4, 3);
        double out = a5.distance(b5);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}