package ru.mirea.lab6;

public class Car implements Nameable, Priceable, Printable {

    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Car | Name: " + getName() + " | Price: " + getPrice());
    }
}