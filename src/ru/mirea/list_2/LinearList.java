package ru.mirea.list_2;

/*
    5.	Элемент односвязного списка содержит массив из пяти целых переменных. Массив заполнен частично.
    Все значения хранятся в порядке возрастания. Написать метод включения значения в элемент списка с сохранением
    упорядоченности. При переполнении массива создается новый элемент списка
*/

public class LinearList implements Printable {
    private Node head;

    public LinearList() {
        head = new Node(new int[]{0, 3, 5}, null); // пусть изначально список заполнен тремя элементами, один узел
    }

    public static void bubbleSort(int[] sortArr) { // сортировка пузырьком
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    @Override
    public void print() { // в последствии так выведем на экран каждый узел
        Node current = head;
        int countOfNodes = 1;

        while (current.getNext() != null) {
            current = current.getNext();
            countOfNodes++;
        }

        current = head;

        for (int i = 0; i < countOfNodes; i++) {
            System.out.printf("Node %d:" + "\n", i+1);
            for(int j = 0; j < current.getData().length; j++) {
                System.out.println(current.getData()[j]);
            }
            System.out.println("\n");
            current = current.getNext();
        }
    }

    public void add(int number) { // сам метод вставки элемента
        Node current = head;
        while (current.getNext() != null) { // ищем последний элемент
            current = current.getNext();
        }

        int newLength = current.getData().length + 1;

        if (current.getData().length < 5) { // если не переполнили
            int[] newArray = new int[newLength];
            for (int i = 0; i < current.getData().length; i++) {
                newArray[i] = current.getData()[i];
            }
            newArray[newLength - 1] = number;
            bubbleSort(newArray); // отправили сортироваться
            current.setData(newArray);
        }

        else { // если переполнили
            Node newNode = new Node(new int[]{number}, null);
            current.setNext(newNode);
        }
    }
}