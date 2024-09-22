package ru.mirea.lab6;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Mazda", 1000000);
        Animal animal = new Animal("Sharik", 10000);

        car.print();
        animal.print();
    }
}