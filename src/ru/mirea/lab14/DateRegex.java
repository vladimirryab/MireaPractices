package ru.mirea.lab14;

import java.util.Scanner;

public class DateRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строчку формата: dd/mm/yyyy: ");
        String date = sc.nextLine();

        System.out.println(isDate(date));
    }
    public static boolean isDate(String date) {
        final String regex = "^(0[0-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[012])/(19[0-9]{2}|2[0-9]{3}|3[0-9]{3}|4[0-9]{3}|5[0-9]{3}|6[0-9]{3}|7[0-9]{3}|8[0-9]{3}|9[0-9]{3})$";
        return date.matches(regex);
    }
}
