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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode current=head,temp=head,prev=head;//current =alwasy first node 
            int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        k=k%size;
        if(k%size==0 || head==null ||head.next==null){
            return head;
        }
        
        for(int i=0;i<k;i++){
            temp=head;
            prev=null;
             while(temp.next!=null){
            prev=temp;//second last node
            temp=temp.next;//last node
            //size++:
        }
        prev.next=null;
        temp.next=head;
        head=temp;
           
            
        }
        return head;
    }
}