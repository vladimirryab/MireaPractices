package ru.mirea.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        //third();
        fourth();
    }

    public static void third() {
        System.out.print("Input a count of values: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] array = new int[count];
        int sum = 0;
        double average = 0;

        for(int i = 0; i < count; i++)
        {
            System.out.printf("Input a value for №%d: ", i+1);
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        average = sum/count;

        System.out.println(Arrays.toString(array));
        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Average: %5.2f\n", average);
    }

    public static void fourth() {
        System.out.print("Input a count of values: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] array = new int[count];
        int sum = 0;

        int i = 0;
        int max = -1000000;
        int min = 20301230;

        do {
            System.out.printf("Input a value for №%d: ", i+1);
            array[i] = scanner.nextInt();

            if (max < array[i]) { max = array[i]; }
            else if (min > array[i]) { min = array[i]; }
            sum += array[i];
            i++;
        } while (i < count);

        System.out.printf("Sum: %d\nMax: %d\nMin: %d\n", sum, max, min);
    }
}
