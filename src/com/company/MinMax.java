package com.company;

public class MinMax {
    int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static int getMax(int[] Arr) {
        int max = Arr[0];

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] Arr) {
        int min = Arr[0];

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] < min) {
                min = Arr[i];
            }
        }
        return min;
    }
}
