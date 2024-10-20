package ru.mirea.lab8;

import java.util.Scanner;

public class IsDigitIsPrime {
    public static void main(String[] args) {
        System.out.println("Введите число n > 1: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n, 2)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false; // по условию числа > 1
        }

        if (number % 2 == 0) {
            return (number == 2); // если число делится на 2, оно простое только если равно 2
        }

        if (divisor * divisor > number) {
            return true;
            /* если число не простое, то оно имеет как минимум два множителя, которые должны быть меньше(либо равны)
            корня из исходного числа, иначе бы их произведение было бы больше,
            поэтому нет смысла перебирать стоящие далее числа */
        }

        if (number % divisor == 0) { // делится на делитель - не простое
            return false;
        }

        return isPrime(number, divisor + 2); // шагаем по 2
    }
}
