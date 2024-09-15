package ru.mirea.lab3;

public class DoubleExamples {
    public static void main(String[] args) {

        Double d1 = Double.valueOf(10.5);
        Double d2 = Double.valueOf("20.25");

        String strValue = "30.75";
        double doubleValue = Double.parseDouble(strValue);

        byte byteValue = d1.byteValue();
        short shortValue = d1.shortValue();
        int intValue = d1.intValue();
        long longValue = d1.longValue();
        float floatValue = d1.floatValue();

        System.out.println("Значение объекта Double: " + d1);

        String dStr = Double.toString(3.14);
        System.out.println("Преобразованный литерал: " + dStr);
    }
}
