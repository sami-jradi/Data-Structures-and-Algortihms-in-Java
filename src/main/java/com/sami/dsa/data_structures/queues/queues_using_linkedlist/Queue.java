package com.sami.dsa.data_structures.queues.queues_using_linkedlist;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public Queue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public void peek() {
        if (this.length == 0) {
            System.out.println("The queue is empty");
        } else {
            System.out.println(this.first.value);
        }
    }

    public void enqueue(String value) {

        Node newNode = new Node(value);

        if (this.length == 0) {
            this.first = newNode;

        } else {
            this.last.next = newNode;
        }

        this.last = newNode;
        this.length++;
    }

    public void dequeue() {

        if (this.length == 0) {
            System.out.println("The queue is empty");

        } else {
            this.first = this.first.next;

            if (this.length == 1) {
                this.last = null;
            }

            length--;
        }

    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enqueue("Apple");
        myQueue.enqueue("Ball");
        myQueue.enqueue("Cat");

        myQueue.peek();

        myQueue.dequeue();

        myQueue.peek();

    }
}
