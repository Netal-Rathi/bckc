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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode Next;
        ListNode current=head;
        while(current!=null){
        Next=current.next;
        current.next=prev;
        prev=current;
        current=Next;
        }
        head=prev;
        return head;
        
    }
}
// Title: Reverse Linked List
