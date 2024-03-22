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
       // ListNode temp=head;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode previous = head;
        ListNode current = head.next;
        
        while (current != null) {
            ListNode nextNode = current.next;
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
        ListNode Normal=reverse(reversed);
        ListNode temp=Normal;
        while (temp != null && reversed != null) {
            if (temp.val != reversed.val) {
                return false;
            }
            temp= temp.next;
            reversed = reversed.next;
        }
        return true;
    }
}

// Title: Palindrome Linked List
