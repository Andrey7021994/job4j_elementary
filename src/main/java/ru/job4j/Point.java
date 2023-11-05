package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(0, 0, 5, 5);
        System.out.println("result (0, 0) to (5, 5) " + result2);
        double result3 = Point.distance(0, 0, 6, 4);
        System.out.println("result (0, 0) to (6, 4) " + result3);
        double result4 = Point.distance(1, 8, 2, 5);
        System.out.println("result (1, 8) to (2, 5) " + result4);
        double result5 = Point.distance(5, 2, 4, 3);
        System.out.println("result (5, 2) to (4, 3) " + result5);
}
}
