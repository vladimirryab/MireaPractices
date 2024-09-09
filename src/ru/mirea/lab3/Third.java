package ru.mirea.lab3;

import java.util.Random;

public class Third {
    public static void main(String[] args) {

        final int N = 4;
        int[] array = new int[N];
        Random rand = new Random();
        boolean isIncrease = true;

        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt((99 - 10) + 1) + 10;
            System.out.print(array[i] + " ");
        }
        checkIncrease(array, N);
    }

    public static void checkIncrease(int[] array, int N) {
        boolean isIncrease = true;

        for (int i = 1; i < N; i++)
            if (isIncrease)
                if (!(array[i-1] < array[i])) {
                    isIncrease = false;
                    break;
                }
        System.out.printf("\nThe array %s the increasing sequence.", isIncrease ? "is" : "is not");
    }
}
