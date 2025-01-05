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

    //  ListNode slow=head;
    // ListNode fast=head;

    // while(slow!=null && fast!=null && fast.next!=null){
    //     slow=slow.next;
    //     fast=fast.next.next;
    //     if(slow==head){
    //         return slow;
    //     }
    //     if(slow==fast){
    //        slow=slow.next;
    //         return slow;
    //     }

    // }        
    // return null;
    HashMap<ListNode,Integer> map=new HashMap<>();
    while(head!=null){
        if(map.containsKey(head)){
            return head;
        }else{
             map.put(head,1);
             head=head.next;
        }
    }
    return null;
    


    }
}