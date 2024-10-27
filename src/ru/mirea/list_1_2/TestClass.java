package ru.mirea.list_1_2;

import ru.mirea.list_1_1.Student;
import ru.mirea.list_1_1.StudentList;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ru.mirea.list_1_1.StudentList studentList = new StudentList();

        while (true) {
            System.out.println("\nМеню выбора операции:\n");
            System.out.println("\t0. Выход");
            System.out.println("\t1. Добавить студента");
            System.out.println("\t2. Удалить студента");
            System.out.println("\t3. Вывести список");
            System.out.println("\t4. Очистить список");
            System.out.println("Введите номер операции: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Завершаем работу программы...");
                    System.exit(0);

                case 1:
                    Student student = new Student();
                    student.getArguments();

                    studentList.add(student);
                    System.out.println("Студент был добавлен в список!\n\n");
                    break;

                case 2:
                    studentList.delete();
                    break;

                case 3:
                    studentList.printList();
                    break;

                case 4:
                    studentList.clearList();
                    System.out.println("Список был очищен!");
                    break;
            }
        }
    }
}
