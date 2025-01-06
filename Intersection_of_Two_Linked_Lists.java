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
        // HASH-map uses extra space O(n) to store values 
        // HashMap<ListNode,Integer> map =new HashMap<>();
        // while(headA!=null){
        //     if(map.containsKey(headA)){
        //         return headA;
        //     }else{
        //         map.put(headA,1);
        //         headA=headA.next;
        //     }

        // }        

        // while(headB!=null){

        // if(map.containsKey(headB)){
        //         return headB;
        //     }else{
        //         map.put(headB,1);
        //         headB=headB.next;
        //     }
        // }
        // return null;
        ListNode pA=headA,pB=headB;


        while(pA!=pB){
            if(pA!=null){
                pA=pA.next;
            }else{
              pA= headB;
            }  

               if(pB!=null){
                pB=pB.next;
            }else{
                pB=headA;
            }
        }
        return pA;
    }
}
// Title: Intersection of Two Linked Lists
