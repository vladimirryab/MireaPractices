package ru.mirea.list_1_1;

import java.util.Scanner;

public class Student {

    private String name; // имя
    private int age; // возраст
    private int iDnumber; // номер студента

    public void getArguments() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        String name = sc.nextLine();
        System.out.println("Введите возраст студента: ");
        int age = sc.nextInt();
        System.out.println("Введите номер студента: ");
        int iDnumber = sc.nextInt();

        this.name = name;
        this.age = age;
        this.iDnumber = iDnumber;
    }
    public void getDesc() {
        System.out.println("Имя: " + name + " Возраст: " + age + " Номер студента: " + iDnumber);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getiDnumber() {
        return iDnumber;
    }
}