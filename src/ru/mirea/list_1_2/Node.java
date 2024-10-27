package ru.mirea.list_1_2;

import ru.mirea.list_1_1.Student; // возьмем тот же класс студента из пакета list_1_1

public class Node {
    private Student data; // данные хранящиеся в узле
    private Node previous; // ссылка на предыдущий узел
    private Node next; // ссылка на следующий узел

    public Node(Student data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public Student getData() {
        return data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}