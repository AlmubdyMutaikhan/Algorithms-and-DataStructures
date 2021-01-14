package com.company.LinkedList.Problems;
import com.company.LinkedList.Implementation.MyLinkedList;
import com.company.LinkedList.Implementation.Node;

public class FindTheMiddleNode {
    /**
     * Approach-1: Find the len of LL and find by index (len / 2 + 1) the middle node
     * */
    public static int getLen(Node head) {
        // Time complexity: O(n)
        Node trav = head;
        int len = 0;
        while (trav != null) {
            len += 1;
            trav = trav.next;
        }
        return len;
    }

    public static Node getTheMiddleNode(Node head) {
        Node middle = null;
        // Given head
        // Should find the middle one

        // Count the length, if len is even than get second middle element
        int len = getLen(head);
        int middleIndex = len / 2 + 1;
        // traverse list and find middle node
        Node trav = head;
        int count = 0;
        // Time complexity O(n/2) -> O(n)
        while (trav != null) {
            count += 1;
            if(count == middleIndex) {
                middle = trav;
            }
            trav = trav.next;
        }


        return middle;

        /***
         * Total time complexity O(n) + O(n) -> O(2n) -> O(n)
         */
    }

    /**
     * Approach-2: Use 2 pointers, fast and slow; When slow comes to the middle, fast comes to the end of LL
     */

    public static Node getTheMiddleNode2(Node head) {
        Node middle = null;
        Node fast_ptr = head;
        Node slow_ptr = head;

        while (fast_ptr != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }

        middle = slow_ptr;

        return middle;
    }


    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        for(int i = 1; i <= 6;i++) {
            list.add(i);
        }
        System.out.println("total linked list:");
        list.print();
        Node middle = getTheMiddleNode2(list.head);
        System.out.println("midle node is  " + middle.val);


    }
}
