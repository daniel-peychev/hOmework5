package com.company;

public class BubbleSort {
    static void bubbleSortAscending(int[] a) {
        int d = a.length;
        int temp = 0;
        for (int i = 0; i < d; i++) {
            for (int j = 1; j < (d - i); j++) {
                if (a[j - 1] > a[j]) {

                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }



            }
        }
    }
    static void bubbleSortDescending( int[] a){
        int d = a.length;
        int temp = 0;
        for(int i = 0; i < 0; i++){
            for(int k = 0; i < (d - i); i++){
                if(a[k - 1] < a[k]){
                    temp = a[k - 1];
                    a[k - 1] = a[k];
                    a[k] = temp;
                }
            }
        }
    }
}
