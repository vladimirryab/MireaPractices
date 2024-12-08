package ru.mirea.lab18;

// 5-6 задания
public class Throws {
    public static void main(String[] args) {
        try {
            getDetails(null);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        printMessage(null);
    }

    public static void printMessage(String key) {
        String message = "";
        try {
            message = getDetails(key);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Set key default value '1'");
            printMessage("1");
            return;
        }
        System.out.println(message);
    }

    public static String getDetails(String key) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("Exception: key is not nullable");
        }
        return key;
    }
}