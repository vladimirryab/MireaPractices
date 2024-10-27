package ru.mirea.list_1_1;

public class Node { // структура односвязного списка
    private Student data; // данные
    private Node next; // ссылка на следующий элемент

    public Node(Student data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}