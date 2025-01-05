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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        if(head.next==null && n==1){
          //  head.next=null;
            return null;
        }
        ListNode temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;

        }
        count=count-n;
        int s=0;
        temp=head;
        while(s!=count && temp.next!=null){
            s++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;

        
    }
}