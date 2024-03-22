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
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode previous = head;
        ListNode current = head.next;
        ListNode nextNode = current.next;
        while (current != null) {
            
            current.next = previous;
            //updating
            previous = current;
            current = nextNode;
        }
        head.next = null;
        head = previous;
        return head;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null|| head.next==null) {
            return true;
        }
        ListNode reversed = reverse(head);
        while (head != null && reversed != null) {
            if (head.val != reversed.val) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }
}

// Title: Palindrome Linked List
