/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

     ListNode slow=head;
    ListNode fast=head;

    while(slow!=null && fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==head){
            return slow;
        }
        if(slow==fast){
           slow=slow.next;
            return slow;
        }

    }        
    return null;
    }
}