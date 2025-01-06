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

    //recursive merging
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode middle= findmid(head);
        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;
        
         left=sortList(left);
        right=sortList(right);
        
        return merge(left,right);
    }


    // finding middle 
    public ListNode findmid(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
        
    }

    
    //merging parts 
    public ListNode merge(ListNode left,ListNode right){
        ListNode temp=new ListNode(0);
        ListNode current=temp;
        
        while(left!=null && right!=null){
            if(left.val>right.val){
                current.next=right;
                right=right.next;
            }else{
                current.next=left;
                left=left.next;

            }
            current=current.next;
            
        }
        if(left!=null){
                current.next=left;      
                     }else{
                        current.next=right;
                     }
                     return temp.next;
    }

}
// Title: Sort List
