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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map=new HashMap<>();
        if(head==null|| head.next==null){
            return false;
        }
        while(head!=null){
          //  map.put(head,map.getorDefault(head,0)+1)
            if(map.containsKey(head)){
                return true;
            }else{
                map.put(head,1);
                head=head.next;

            }
           
        }
      return false;
        
        
    }
}