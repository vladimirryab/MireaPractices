package ru.mirea.lab19;

public class BadNameExpection extends Exception {
    public BadNameExpection (String errorMessage) {
        super(errorMessage);
    }
}
