package com.company;
import java.util.Random;
public class ShuffleArray {

    public static void shuffleArray(int[] arr) {
        int sum, temp;
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            sum = random.nextInt(i + 1);
            temp = arr[sum];
            arr[sum] = arr[i];
            arr[i] = temp;
            System.out.println("Shuffle the numbers: " + arr[i]);
        }
    }
}
