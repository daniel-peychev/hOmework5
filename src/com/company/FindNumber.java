package com.company;

public class FindNumber {
    public static int findNumber(int[] array, int a) {
        if (array == null)
            return -1;

            int l = array.length;
            int i = 0;

            while (i < l) {
                if (array[i] == a)

                    return i;
                 else i = i + 1;
            }
            return -1;
        }
    }
