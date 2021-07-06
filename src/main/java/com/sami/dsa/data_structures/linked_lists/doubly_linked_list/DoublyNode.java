package com.sami.dsa.data_structures.linked_lists.doubly_linked_list;

public class DoublyNode {

    int value;
    DoublyNode next;
    DoublyNode previous;

    public DoublyNode(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
