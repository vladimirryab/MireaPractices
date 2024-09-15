package ru.mirea.lab41;

abstract class Human {
    private String fullName;
    private int age;

    public Human(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract void move();

    public abstract void talk();

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}