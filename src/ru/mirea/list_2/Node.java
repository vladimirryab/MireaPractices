package ru.mirea.list_2;

public class Node { // структура узла
    private int[] data; // данные
    private Node next; // следующий элемент

    public Node(int[] data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}