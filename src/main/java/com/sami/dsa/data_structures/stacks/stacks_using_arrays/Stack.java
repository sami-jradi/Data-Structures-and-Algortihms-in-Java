package com.sami.dsa.data_structures.stacks.stacks_using_arrays;

import java.util.ArrayList;

public class Stack {

    ArrayList<String> stackArray;

    public Stack() {
        this.stackArray = new ArrayList<>();
    }

    public void peek() {
        if (this.stackArray.size() > 0) {
            System.out.println(stackArray.get(this.stackArray.size() - 1));
        } else {
            System.out.println("The Stack is empty");
        }
    }

    public void push(String value) {
        this.stackArray.add(value);
    }

    public void pop() {
        this.stackArray.remove(stackArray.size() - 1);
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
