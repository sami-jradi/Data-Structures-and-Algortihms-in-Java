package com.sami.dsa.data_structures.trees.binary_search_tree;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {

        Node newNode = new Node(value);

        if (this.root == null) {
            this.root = newNode;

        } else {
            Node currentNode = this.root;

            while (true) {
                if (value < currentNode.value) {

                    // left
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;

                } else {

                    // right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }

    }

    public boolean lookup(int value) {

        if (this.root == null) {
            return false;
        }

        Node currentNode = this.root;

        while (currentNode != null) {

            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                currentNode = currentNode.right;
            } else if (currentNode.value == value) {
                return true;
            }
        }

        return false;
    }

    public void remove(int value) {
        if (this.root == null) {
            return;
        }
        Node current = this.root;
        Node parentNode = null;
        // while current is not null
        while (current != null) {
            if (value < current.value) {
                // go left
                parentNode = current;
                current = current.left;
            } else if (value > current.value) {
                // go right
                parentNode = current;
                current = current.right;
            }
            // (value == current.value, means if we found the value to be removed)
            else {
                // Option 1: NO RIGHT CHILD            // Child means the child of current Node
                if (current.right == null) {
                    // if parentNode is null means delete the root node
                    if (parentNode == null) {
                        this.root = current.left;
                    } else {
                        // if current < parent, make current left child a left child of parent
                        if (current.value < parentNode.value) {
                            parentNode.left = current.left;

                        }
                        // if current > parent, make current's left child a right child of parent
                        else if (current.value > parentNode.value) {
                            parentNode.right = current.left;
                        }
                    }
                }

                // Option 2: RIGHT CHILD WHICH DOESN'T HAVE A LEFT CHILD
                else if (current.right.left == null) {
                    if (parentNode == null) {
                        this.root = current.right;
                    } else {
                        // if current < parent, make current's right child a left child of parent
                        if (current.value < parentNode.value) {
                            parentNode.left = current.right;
                        }
                        // if current > parent, make current's right child a right child of parent
                        else if (current.value > parentNode.value) {
                            parentNode.right = current.right;
                        }
                    }
                }

                // Option 3: RIGHT CHILD WHICH HAVE LEFT CHILD
                else {
                    if (parentNode == null) {
                        // save reference of left and right nodes of the root
                        Node leftNode = this.root.left;
                        Node rightNode = this.root.right;
                        // root.right.left node becomes new root
                        this.root = current.right.left;
                        rightNode.left = rightNode.left.right;
                        // set back the saved reference of left and right nodes of root.
                        this.root.left = leftNode;
                        this.root.right = rightNode;
                    } else {
                        if (current.value < parentNode.value) {
                            parentNode.left = current.right.left;
                        } else if (current.value > parentNode.value) {
                            parentNode.right = current.right.left;
                        }
                    }
                }
                return;
            }
        }
    }

    public void getInTraversalOrder() {
        doInOrder(this.root);
    }

    private void doInOrder(Node root) {

        if (root == null) {
            return;
        }

        doInOrder(root.left);
        System.out.print(root.value + " ");
        doInOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);

        System.out.println(bst.lookup(9));

        bst.remove(20);

        bst.getInTraversalOrder();

    }
}
