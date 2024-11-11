package ru.mirea.lab11;

import ru.mirea.lab9.Student;

import java.util.ArrayList;
import java.util.LinkedList;

public class Comparing {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        LinkedList<String> studentList = new LinkedList<>();
        studentList.add("F");
        studentList.addFirst("A");
        studentList.addLast("M");
        studentList.add("M");
        System.out.println("Содержимое списка LinkedList: " + studentList);
        studentList.remove("M");
        studentList.removeLast();
        System.out.println("Содержимое списка LinkedList: " + studentList);

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).equals("F")) {
                System.out.println("Нашли F");
                break;
            }
        }

        long estimatedTime = System.currentTimeMillis() - startTime;

        System.out.println("Потратили время: " + estimatedTime + " (мс)");

        startTime = System.currentTimeMillis();

        ArrayList<String> anotherStudentList = new ArrayList<>();
        anotherStudentList.add("F");
        anotherStudentList.addFirst("A");
        anotherStudentList.addLast("M");
        anotherStudentList.add("M");
        System.out.println("Содержимое списка ArrayList: " + studentList);
        anotherStudentList.remove("M");
        anotherStudentList.removeLast();
        System.out.println("Содержимое списка ArrayList: " + studentList);

        for (int i = 0; i < anotherStudentList.size(); i++) {
            if (anotherStudentList.get(i).equals("F")) {
                System.out.println("Нашли F");
                break;
            }
        }

        estimatedTime = System.currentTimeMillis() - startTime;

        System.out.println("Потратили время: " + estimatedTime + " (мс)");
    }
}
