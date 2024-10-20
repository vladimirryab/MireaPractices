package ru.mirea.lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeDivisors {
    public static void main(String[] args) {

        System.out.println("Введите число n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> primeFactors = findPrimeFactors(n);
        System.out.println("Простые множители числа " + n + ": " + primeFactors);
    }
    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> divisors = new ArrayList<>();
        findPrimeFactorsRecursive(number, 2, divisors);
        return divisors;
    }

    public static void findPrimeFactorsRecursive(int n, int divisor, List<Integer> divisors) {
        if (n == 1) {
            return;
        }
        if (n % divisor == 0) {
            divisors.add(divisor);
            findPrimeFactorsRecursive(n / divisor, divisor, divisors);
        }
        else {
            findPrimeFactorsRecursive(n, divisor + 1, divisors);
        }
    }
}
