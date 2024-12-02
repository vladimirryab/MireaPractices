package ru.mirea.lab14;

import java.util.Scanner;

public class EmailRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите e-mail формата user@email.com: ");
        String email = sc.nextLine();

        System.out.println(isCorrect(email));
    }
    public static boolean isCorrect(String email) {
        final String regex = "^([a-zA-Z0-9]+)@([a-z]+).([a-z]+){2,5}$";
        return email.matches(regex);
    }
}