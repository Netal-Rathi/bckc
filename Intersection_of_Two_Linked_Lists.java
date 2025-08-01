/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map =new HashMap<>();
        while(headA!=null){
            if(map.containsKey(headA)){
                return headA;
            }else{
                map.put(headA,1);
                headA=headA.next;
            }

        }        

        while(headB!=null){

        if(map.containsKey(headB)){
                return headB;
            }else{
                map.put(headB,1);
                headB=headB.next;
            }
        }
        return null;
    }
}
// Title: Intersection of Two Linked Lists
