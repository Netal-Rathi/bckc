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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null|| head.next==null){
            return null;
        }
        ListNode slow=head,fast=head,temp=null;
        
        while(fast.next!=null && fast.next.next!=null){
             temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        } 
        if(fast.next==null){
            //delet slow
            temp.next=slow.next;
        }else{
            slow.next=slow.next.next;
        }
        return head;
    }
}
// Title: Delete the Middle Node of a Linked List
