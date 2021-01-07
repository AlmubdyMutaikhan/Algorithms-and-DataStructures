package com.company.LinkedList.Implementation;

import java.util.Scanner;

/**
 * Code by Mutaikhan Almubdi
 * */


public class Main {

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        // Adding node methods/operations
        linkedList.add(5);
        linkedList.addAtStart(0);
        linkedList.addTo(1, 1);
        linkedList.add(8);
        linkedList.add(5);
        linkedList.add(19);

        // Output LL ;)
        linkedList.print();
        linkedList.reverseLinkedList();
        linkedList.print();
        // Removing node methods/operations
        linkedList.removeTail();
        linkedList.removeHead();
        linkedList.removeAt(2);

        // Output LL after removing some nodes ;)
        linkedList.print();


    }
}
