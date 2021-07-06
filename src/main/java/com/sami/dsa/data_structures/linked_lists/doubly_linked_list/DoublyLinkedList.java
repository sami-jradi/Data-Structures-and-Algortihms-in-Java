package com.sami.dsa.data_structures.linked_lists.doubly_linked_list;

import com.sami.dsa.data_structures.linked_lists.linked_list_implementation.Node;

import java.util.Arrays;

public class DoublyLinkedList {

    private DoublyNode head;
    private DoublyNode tail;
    private int length;

    public DoublyLinkedList(int value) {
        this.head = new DoublyNode(value);
        this.tail = this.head;
        this.length = 1;
    }

    public void append(int value) {
        DoublyNode newNode = new DoublyNode(value);

        newNode.previous = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    public void prepend(int value) {
        DoublyNode newNode = new DoublyNode(value);

        newNode.next = this.head;
        this.head.previous = newNode;
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

            DoublyNode newNode = new DoublyNode(value);

            DoublyNode leader = traverseToIndex(index - 1);

            DoublyNode follower = leader.next;

            leader.next = newNode;
            newNode.previous = leader;
            newNode.next = follower;
            follower.previous = newNode;

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

            DoublyNode previousNode = traverseToIndex(index - 1);
            DoublyNode currentNode = traverseToIndex(index);

            previousNode.next = currentNode.next;
            currentNode.next.previous = previousNode;
            length--;
        }
    }

    private DoublyNode traverseToIndex(int index) {
        int counter = 0;
        DoublyNode currentNode = this.head;

        while (counter != index) {
            currentNode = currentNode.next;
            counter++;
        }

        return currentNode;
    }

    public void printList() {
        int[] array = new int[length];
        DoublyNode currentNode = this.head;
        int index = 0;

        while (currentNode != null) {
            array[index] = currentNode.value;
            currentNode = currentNode.next;
            index++;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(10);

        doublyLinkedList.append(5);
        doublyLinkedList.append(16);

        doublyLinkedList.prepend(1);

        doublyLinkedList.insert(1, 99);

        doublyLinkedList.remove(3);

        doublyLinkedList.printList();
    }
}
