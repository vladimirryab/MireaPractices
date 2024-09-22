package ru.mirea.lab9;

public class SortStudents {

    public static void insertionSort(Student[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {

            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getiDNumber() > key.getiDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {

        Student[] students = {
                new Student(1234, "Evgeniy"),
                new Student(5678, "Petr"),
                new Student(9101, "Andrey"),
                new Student(2345, "Anna"),
                new Student(6789, "Dmitriy"),
                new Student(4123, "Vladimir")
        };

        System.out.println("Started array:");
        for (Student student : students) {
            System.out.println("ID: " + student.getiDNumber() + ", Name: " + student.getName());
        }

        insertionSort(students);

        System.out.println("\nAfter void array:");
        for (Student student : students) {
            System.out.println("ID: " + student.getiDNumber() + ", Name: " + student.getName());
        }
    }
}
