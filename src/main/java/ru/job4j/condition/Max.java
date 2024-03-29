package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        return left > right ? left : right;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }
}