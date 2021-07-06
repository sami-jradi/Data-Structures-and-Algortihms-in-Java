package com.sami.dsa.data_structures.linked_lists.linked_list_implementation;

import java.util.Arrays;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    public void insert(int index, int value) {

        if (index < 0 || index > length) {
            System.out.println("Index out of bounds for length " + length);

        } else if (index == length) {
            append(value);

        } else if (index == 0) {
            prepend(value);

        } else {

            Node newNode = new Node(value);

            Node leader = traverseToIndex(index - 1);

            Node holdingPointer = leader.next;

            leader.next = newNode;
            newNode.next = holdingPointer;

            length++;
        }

    }

    public void remove(int index) {

        if (index < 0 || index > length) {
            System.out.println("Index out of bounds for length " + length);

        } else if (index == 0) {
            this.head = this.head.next;
            length--;

        } else {

            Node previousNode = traverseToIndex(index - 1);
            Node currentNode = traverseToIndex(index);

            previousNode.next = currentNode.next;
            length--;
        }
    }

    private Node traverseToIndex(int index) {
        int counter = 0;
        Node currentNode = this.head;

        while (counter != index) {
            currentNode = currentNode.next;
            counter++;
        }

        return currentNode;
    }

    public void printList() {
        int[] array = new int[length];
        Node currentNode = this.head;
        int index = 0;

        while (currentNode != null) {
            array[index] = currentNode.value;
            currentNode = currentNode.next;
            index++;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);

        linkedList.append(5);
        linkedList.append(16);

        linkedList.prepend(1);

        linkedList.insert(2, 99);

        linkedList.remove(3);

        linkedList.printList();

    }
}
