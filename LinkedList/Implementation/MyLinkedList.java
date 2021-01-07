package com.company;

/**
 * LL - Linked List
 * */

public class MyLinkedList {
    private Node head;

    public MyLinkedList(){}

    public Node getTail() {
        Node traverse = head;
        while (traverse.next != null) {
            traverse = traverse.next;
        }
        return traverse;
    }

    public void print() {
        Node traverse = head;
        System.out.println("Values of LL: ");
        while (traverse != null) {
            System.out.print(traverse.val + " ");
            traverse = traverse.next;
        }
        System.out.println();
    }

    /** Adding node to the LL methods */
    // Adds to the end
    public void add(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
        } else {
            Node lastNode = this.getTail();
            lastNode.next = node;
        }
    }

    public void addAtStart(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void addTo(int index, int value) {
        if(index == 0) {
            addAtStart(value);
            return;
        } else {
            Node node = new Node(value);
            Node traverse = head;
            Node prev = null;

            int counter = 0;
            while (traverse != null) {
                if (counter == index) {
                    prev.next = node;
                    node.next = traverse;
                    break;
                } else {
                    counter += 1;
                    prev = traverse;
                    traverse = traverse.next;
                }
            }
        }
    }

    /** Removing node from LL methods */
    public void removeHead() {
        head = head.next;
    }

    public void removeTail() {
        Node trav = head;

        if (head.next == null) {
            head = null;
        } else {
            while (trav.next != null && trav.next.next != null) {
                trav = trav.next;
            }
            trav.next = null;
        }
    }

    public void removeAt(int index) {
        // Exceptional cases
        if(index == 0) {
            head = head.next;
        } else {
            Node trav = head;
            Node prev = null;
            int counter = 0;
            while (trav != null) {
                if(counter == index) {
                    if(trav.next == null) {
                        this.removeTail();
                    } else {
                        prev.next = trav.next;
                    }
                    break;
                } else {
                    counter += 1;
                    prev = trav;
                    trav = trav.next;
                }
            }
        }
    }
}

/**
 *  Time Complexity of a Linked List
 *  Insertion: O(1)
 *  Deletion: O(1)
 *  Access: O(n)
 *  Search: O(n)
 * */

/**
 * Pros and cons of Linked list
    + Dynamic Data Structure ( dynamically expands and reduces )
    + Unlike arrays, elements can be located in everywhere in the memory. Each element knows only its value and next node.
    + Fast adding and removing operations
    - To search for a certain element, you need to look through the all previous nodes.
    - Slow access to an element
 * */
