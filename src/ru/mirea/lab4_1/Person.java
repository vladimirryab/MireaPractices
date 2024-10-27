package ru.mirea.lab4_1;

public class Person extends Human {

    public Person(String fullName, int age) {
        super(fullName, age);
    }

    @Override
    public void move() {
        System.out.println(getFullName() + " идет");
    }

    @Override
    public void talk() {
        System.out.println(getFullName() + " говорит");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иван Иванов", 30);
        person1.move();
        person1.talk();
    }
}