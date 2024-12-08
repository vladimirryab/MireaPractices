package ru.mirea.lab19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        System.out.println("Введите действительный ИНН: ");
        String inn = sc.nextLine(); // удобнее через строку

        try {
            isCorrectINN(inn, fullName);
        } catch (BadINNException e) {
            e.printStackTrace();
        } catch (BadNameExpection e) {
            e.printStackTrace();
        } catch (BadNameForINNExpection e) {
            e.printStackTrace();
        }
    }

    public static boolean isCorrectINN(String inn, String fullName) throws BadINNException, BadNameExpection, BadNameForINNExpection {
        // ИНН физического лица состоит из 12 цифр вида: NNNN-ХХХХХХ-CC
        final String innRegex = "^([0-9]{4}+)-([0-9]{6}+)-([0-9]){2}$";
        final String nameRegex = "^([A-Z][a-z]+) ([A-Z][a-z]+) ([A-Z][a-z]+)$";

        if (!inn.matches(innRegex)) {
            throw new BadINNException("Bad format of INN's numbers"); // не является номером ИНН
        } else if (!fullName.matches(nameRegex)) {
            throw new BadNameExpection("Resolved bad name: " + fullName); // не является именем
        } else if (!fullName.equals("Ivanov Ivan Ivanovich")) {
            throw new BadNameForINNExpection("Bad name for INN"); // не сооветствует ИННу
        } else {
            return true;
        }
    }
}
