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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int find=0;
        if(count%2!=0){
            find=count/2+1;
        }else{
            find=count/2 +1;
        }
        temp=head;
        count=1;
        while(count!=find){
            count++;
            temp=temp.next;
        }
        head=temp;
        return head;
        
    }
}