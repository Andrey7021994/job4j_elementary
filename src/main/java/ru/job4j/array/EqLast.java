package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        if (left.length == 0 || right.length == 0) {
            result = false;
        } else {
            int array1 = left[left.length - 1];
            int array2 = right[right.length - 1];
            if (array1 != array2) {
                result = false;
            }
        }

        return result;
    }
}