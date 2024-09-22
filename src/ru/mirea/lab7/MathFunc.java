package ru.mirea.lab7;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double abs(ComplexNumber number) {
        return Math.sqrt(number.real*number.real + number.imaginary*number.imaginary); // |z| = sqrt(x^2 + y^2)
    }

    public double circleLength(double radius) {
        return 2*PI*radius;
    }

}
