package ru.mirea.list_1_1;

import java.util.Scanner;

public class StudentList {
    private Node head;

    public StudentList() {
        head = null;
    }

    public void add(Student data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public void delete() {

        System.out.println("Введите номер студента, которого необходимо удалить: ");
        Scanner sc = new Scanner(System.in);
        int iDnumber = sc.nextInt();

        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        if (head.getData().getiDnumber() == iDnumber) {
            head = head.getNext();
            return;
        }
        Node temp = head;
        while (temp.getNext() != null && !(temp.getNext().getData().getiDnumber() == iDnumber)) {
            temp = temp.getNext();
        }
        if (temp.getNext() == null) {
            System.out.println("Студент с номером " + iDnumber + " не найден.");
        } else {
            temp.setNext(temp.getNext().getNext());
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            temp.getData().getDesc();
            temp = temp.getNext();
        }
    }

    public void clearList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}