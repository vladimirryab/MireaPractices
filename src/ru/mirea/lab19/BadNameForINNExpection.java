package ru.mirea.lab19;

public class BadNameForINNExpection extends Exception {
    public BadNameForINNExpection(String errorMessage) {
        super(errorMessage);
    }
}
