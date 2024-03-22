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
    public ListNode isReverse(ListNode head){
        if(head.next==null || head==null){
            return head;
        }
        ListNode previous=head;
        ListNode current=head.next;
        while (current != null){
            ListNode NextNode=current.next;
            current.next=previous;
            //updating
            previous=current;
            current=NextNode;
            //return head;
        }
        head.next=null;
        head=previous;
        return head;

    }
    public boolean isPalindrome(ListNode head) {
        if(head==null ){
            return true;
        }
            ListNode  reversed=isReverse(head);
                while(head!=null && reversed!=null){
                if(head.val!=reversed.val){
                    return false;
                }
                head=head.next;
                reversed=reversed.next;
                }
                return true;
            }
        
        
    }
