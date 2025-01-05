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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
          ListNode head1=head;
        ListNode head2;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        //head2=slow.next;
      // head2=prev;
       // slow.next=null;

        ListNode prev=null;
        ListNode current=slow;
        ListNode Next=null;
        while(current!=null){
            Next=current.next;
            current.next=prev;
            prev=current;
            current=Next;
        }
      
        head2=prev;

        while( head2!=null){
            if(head1.val!=head2.val){
            return false;
            }
             head1=head1.next;
            head2=head2.next;
            
        }
       return true;
        
        
    }
}