package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("Введите фамилию разработчика: ");
        Scanner sc = new Scanner(System.in);
        String surName = sc.nextLine();
        int month = date.getDate();
        SimpleDateFormat time = new SimpleDateFormat("EEEE, d MMMM, hh:mm:ss, yyyy");

        Task task = new Task(surName, month, time.format(date));
        task.print();
    }
}
