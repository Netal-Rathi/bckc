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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node, it's already sorted
        }

        boolean swapped;
        do {
            swapped = false;
            ListNode current = head;
            ListNode prev = null;

            while (current != null && current.next != null) {
                if (current.val > current.next.val) {
                    // Swap values
                    int temp = current.val;
                    current.val = current.next.val;
                    current.next.val = temp;
                    swapped = true;
                }
                prev = current;
                current = current.next;
            }
        } while (swapped);

        return head;
    }
}

// Title: Sort List
