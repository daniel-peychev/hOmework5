package com.company;
import java.util.Scanner;
import java.util.Set;

import static com.company.FindNumber.findNumber;

import static com.company.InvertArray.invertArray;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        //MinMax
        int arr1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int max = MinMax.getMax(arr1);
        System.out.println("Max: \n" + max);

        int min = MinMax.getMin(arr1);
        System.out.println("Min: \n" + min + "\n");


        //BubbleSortAscending
        int arr2[] = new int[]{100, 55, 29, 8, 4, 99, 4856, 1};
        ;
        System.out.println("Array Before Bubble Sort ascending");
        for (int i = 0; i < arr2.length; i++) {
            out.print(arr2[i] + " ");
        }
        System.out.println();

        BubbleSort.bubbleSortAscending(arr2);

        System.out.println("Array After Bubble Sort ascending");
        for (int i = 0; i < arr2.length; i++) {
            out.print(arr2[i] + " ");
        }
        System.out.println("\n");


        //BubbleSortDescending
        int arr5[] = new int[]{100, 22, 31, 7, 79, 56, 3, 11};
        System.out.println("Array Before Bubble Sort descending");
        for (int i = 0; i < arr5.length; i++) {
            out.print(arr5[i] + " ");
        }
        System.out.println("\n");

        BubbleSort.bubbleSortDescending(arr5);

        System.out.println("Array After Bubble Sort descending");
        for (int i = 0; i < arr5.length; i++) {
            out.print(arr5[i] + " ");
        }
        System.out.println("\n");


        //Average
        double[] arr3 = new double[]{8.99, 7, 6.77, 5, 4.254, 3, 2.94, 1};
        Average.getAverage(arr3);
        System.out.println();


        //ShuffleArray
        int[] arr4= new int[]{1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        ShuffleArray.shuffleArray(arr4);
       System.out.println();


        //SumArray
        int[] arr6 ={1, 2, 3, 4, 5, 100, 7, 8};
        System.out.println("Calculate the sum of all numbers:  " + arr6);
        SumArray.main(arr6);

        //FindNumber
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Index position of 5 is: "+ findNumber(array, 5));


        //InvertArray
        int[] arr8 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Inverting an array of numbers: " +  arr8);


        //OptionMenu
        Scanner scanner = new Scanner(System.in);
        int instruction = 0;
        instruction = Integer.parseInt(scanner.nextLine());

        while (instruction != 7) {
            OptionMenu.optionMenuSC(arr5);
        }

    }

}
