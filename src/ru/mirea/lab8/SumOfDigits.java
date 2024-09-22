package ru.mirea.lab8;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Input a number which needed to sum digits: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}
