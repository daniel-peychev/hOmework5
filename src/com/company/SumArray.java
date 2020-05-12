package com.company;

public class SumArray {
    public static void main(int[] a){
        int[] num = {1, 2, 3, 4, 5, 100, 7, 8};
        int sum = 0;
        for(int i : num){
        sum = sum + i;
        }

        System.out.println(sum);
    }
}
