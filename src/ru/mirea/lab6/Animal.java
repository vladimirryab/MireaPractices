package ru.mirea.lab6;

public class Animal implements Nameable, Priceable, Printable {
    private String name;
    private int price;

    public Animal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Animal | Name: " + getName() + " | Price: " + getPrice());
    }
}