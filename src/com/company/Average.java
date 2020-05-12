package com.company;

public class Average {
    public static void getAverage(double[] Arr) {

        double[] arr = {1.4, 2.6, 5.7, 3.9, 3, 90, 8.9, 100};

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            double average = sum / arr.length;
            System.out.println(" The average is: " + average);
        }
    }

    public static void getAverage(int[] arr) {
    }
}
