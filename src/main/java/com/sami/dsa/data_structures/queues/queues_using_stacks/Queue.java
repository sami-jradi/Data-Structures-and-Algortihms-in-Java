package com.sami.dsa.data_structures.queues.queues_using_stacks;

import java.util.Stack;

public class Queue {

    // this is the main stack which we will use as queue
    Stack<Integer> queueStack = new Stack<>();

    // rev stack
    Stack<Integer> revStack = new Stack<>();

    public void push(int value) {

        if (this.queueStack.size() == 0) {
            this.queueStack.push(value);

        } else {

            while (this.queueStack.size() != 0) {
                this.revStack.push(this.queueStack.pop());
            }

            this.revStack.push(value);

            while (this.revStack.size() != 0) {
                this.queueStack.push(this.revStack.pop());
            }
        }
    }

    public void pop() {
        if (this.queueStack.size() > 0) {
            this.queueStack.pop();
        } else {
            System.out.println("The queue is empty");
        }
    }

    public void peek() {
        if (this.queueStack.size() > 0) {
            System.out.println(this.queueStack.get(this.queueStack.size() - 1));
        } else {
            System.out.println("The queue is empty");
        }
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.push(10);
        myQueue.push(20);
        myQueue.push(30);

        myQueue.peek();

        myQueue.pop();

        myQueue.peek();
    }

}
