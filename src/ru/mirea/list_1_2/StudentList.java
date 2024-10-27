package ru.mirea.list_1_2;

import ru.mirea.list_1_1.Student; // возьмем тот же класс студента из пакета list_1_1

import java.util.Scanner;

public class StudentList {
    Node head; // первый узел в списке
    Node tail; // последний узел в списке

    public StudentList() {
        head = null;
        tail = null;
    }

    public void add(Student data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
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
            if (head != null) {
                head.setPrevious(null);
            } else {
                tail = null;
            }
            return;
        }
        Node temp = head;
        while (temp.getNext() != null && !(temp.getNext().getData().getiDnumber() == iDnumber)) {
            temp = temp.getNext();
        }
        if (temp.getNext() == null) {
            System.out.println("Студент с номером " + iDnumber + " не найден.");
        } else {
            Node nodeToDelete = temp.getNext();
            temp.setNext(nodeToDelete.getNext());
            if (nodeToDelete.getNext() != null) {
                nodeToDelete.getNext().setPrevious(temp);
            } else {
                tail = temp;
            }
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
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}