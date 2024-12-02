package ru.mirea.lab13;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона России, начиная с 8: ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        if (!isPhoneNumber(number)) {
            System.out.println("Неверный формат!");
            System.exit(0);
        }
        String formattedNumber = formattedPhoneNumber(number);
        System.out.println("Отформатированный номер: " + formattedNumber);
    }

    public static String formattedPhoneNumber(String number) {
        return "+7 (" + number.substring(1, 4) + ") " + number.substring(4, 7) + " " + number.substring(7);
    }

    public static boolean isPhoneNumber(String number) {
        final String regex = "[0-9]+";
        char first = number.charAt(0);
        return number.matches(regex) && (number.length() == 11) && (first == '8');
    }
}