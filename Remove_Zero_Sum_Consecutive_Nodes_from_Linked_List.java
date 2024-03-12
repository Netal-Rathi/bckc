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
public class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixsum=0;
      Map<Integer,ListNode>map=new HashMap<>();
      ListNode dummy=new ListNode(0);
      dummy.next=head;
      map.put(0,dummy);

      while(head!=null){
        prefixsum+=head.val;
        
        if (map.containsKey(prefixsum)) {
           
            ListNode p=map.get(prefixsum);
            ListNode start=p;
             int psum=prefixsum;
            while(start!=head){
                start=start.next;
            psum+=start.val;
            if(start!=head){
                map.remove(psum);
            }
            }
            p.next=start.next;
        }else{
            map.put(prefixsum,head);

        }
        head=head.next;

      }
      return dummy.next;
}
}
