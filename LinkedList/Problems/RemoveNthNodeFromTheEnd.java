/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode trav = head;

        while(trav != null)  {
            next = trav.next;
            trav.next = prev;
            prev = trav;
            trav = next;
        }
        return prev;
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);

        ListNode trav = head;
        ListNode prev = null;
        int i = 1;
        if(n == 1) {
            head = head.next;
        } else {
            while(trav != null) {
                if(i == n) {
                    prev.next = trav.next;
                }
                prev = trav;
                trav = trav.next;
                i += 1;
            }
        }

        head = reverse(head);
        return head;

    }
}