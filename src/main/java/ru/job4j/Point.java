package ru.job4j;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance1 = a.distance(b);
        System.out.println(distance1);
        Point a2 = new Point(0, 0);
        Point b2 = new Point(5, 5);
        double distance2 = a2.distance(b2);
        System.out.println(distance2);
        Point a3 = new Point(0, 0);
        Point b3 = new Point(6, 4);
        double distance3 = a3.distance(b3);
        System.out.println(distance3);
        Point a4 = new Point(1, 8);
        Point b4 = new Point(2, 5);
        double distance4 = a4.distance(b4);
        System.out.println(distance4);
        Point a5 = new Point(5, 2);
        Point b5 = new Point(4, 3);
        double distance5 = a5.distance(b5);
        System.out.println(distance5);
    }
}