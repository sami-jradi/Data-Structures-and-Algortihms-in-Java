package com.sami.dsa.data_structures.stacks.stacks_using_linkedlist;

public class Stack {

    private Node top;
    private Node bottom;
    private int length;

    public Stack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public void peek() {
        if (this.length == 0) {
            System.out.println("The stack is empty");
        } else {
            System.out.println(this.top.value);
        }
    }

    public void push(String value) {
        Node newNode = new Node(value);

        if (this.length == 0) {
            this.top = newNode;
            this.bottom = newNode;

        } else {
            newNode.next = this.top;

            this.top = newNode;
        }

        this.length++;
    }

    public void pop() {
        if (this.length == 0) {
            System.out.println("The stack is empty");

        } else {
            this.top = this.top.next;

            if (this.length == 1) {
                this.bottom = null;
            }

            this.length--;
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push("Google");
        myStack.push("Facebook");
        myStack.push("Youtube");

        myStack.peek();

        myStack.pop();

        myStack.peek();

        myStack.pop();
    }
}
