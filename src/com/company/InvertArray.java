package com.company;

public class InvertArray {
    public static void invertArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = array[array.length - 1 - i];
            int temp = 0;
            temp = array[i];
            array[array.length - 1 - i] = temp;
            System.out.println("Inverting an array of numbers: "+ array);
        }
    }
}
