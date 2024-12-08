package ru.mirea.lab11;

public class Task implements Printable {
    private String surName; // фамилия
    private int getDate; // получение
    private String time; // сдача

    public Task(String surName, int getDate, String time) {
        this.surName = surName;
        this.getDate = getDate;
        this.time = time;
    }

    @Override
    public void print() {
        System.out.println("Фамилия: " + surName + " Месяц: " + getDate + " Время: " + time);
    }
}
