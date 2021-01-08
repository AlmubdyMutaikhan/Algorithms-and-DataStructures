package com.company.LinkedList.Problems;
import com.company.LinkedList.Implementation.*;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void removeFromDuplicates(MyLinkedList list) {
        /*
        * @Input: head of list;
        * @Output: list removed from duplicates;
        * @How to solve: Traverse the list and have temp hash set to store values of node;
        * @Algorithm:
        * 1. Init hashset to store values of nodes.
        * 2. Traverse through the list.
        * 3. if node value doesn't exist in the set then add it.
        * 4. Else remove this node.
        * 5. Do it till the end of list.
        * */

        // 1
        HashSet<Integer> uniques = new HashSet<>();
        //2
        Node trav = list.head;
        while(trav != null) {
            // 3
            if(uniques.contains(trav.val)) {
                list.removeNode(trav);
            } else {  // 4
                uniques.add(trav.val);
            }
            // 5
            trav = trav.next;
        }

        /**
         * Time Complexity of this algorithm:
         * Traversing: O(n);
         * Removing node: O(m);
         * Total T/C Average case: O(n*m);
         * Total T/C Worst case: O(n*n);
         * */
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(0);
        list.add(-1);
        list.add(5);
        list.add(-1);
        list.add(0);
        list.print();
        removeFromDuplicates(list);
        list.print();

    }
}