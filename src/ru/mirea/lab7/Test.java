package ru.mirea.lab7;

public class Test {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double base = 2.0;
        int exponent = 3;
        double result = mathFunc.power(base, exponent);
        System.out.println(base + " in pow " + exponent + " = " + result);

        ComplexNumber complexNumber = new ComplexNumber(3, 4);
        result = mathFunc.abs(complexNumber);
        System.out.println("Abs complex number with (" + complexNumber.real + ", " + complexNumber.imaginary + ") = " + result);

        double radius = 5.0;
        result = mathFunc.circleLength(radius);
        System.out.println("Circle length with radius " + radius + " = " + result);
    }
}