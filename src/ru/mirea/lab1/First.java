package ru.mirea.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        third();
        fourth();
        fifth();
        sixth();

        int n = 5;
        long factorial = seventh(n);
        System.out.println("Факториал " + n + "! равен " + factorial);
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
    public static void fifth() {
        int args[] = new int[5];
        System.out.println("Введите аргументы:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": ");
            args[i] = scanner.nextInt();
        }
        System.out.println("Аргументы командной строки:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
    public static void sixth() {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("1/%d = %.4f\n", i, harmonicNumber);
        }
    }
    public static long seventh(int number) {
        if (number < 0) {
            System.out.println("Факториал не определен для отрицательных чисел");
            return 0;
        }
        else if (number == 0) {
            return 1;
        }
        else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = i*factorial;
            }
            return factorial;
        }
    }
}