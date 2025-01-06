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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Already sorted if the list is empty or has only one element
        }

        ListNode temp = head;

        // Continue sorting until no swaps are needed in a complete pass
        while (temp != null) {
            ListNode current = temp;
            boolean isSorted = true; // Assume that the list is sorted in this pass

            // Traverse the list starting from temp
            while (current != null && current.next != null) {
                if (current.val > current.next.val) {
                    // Swap the values between current node and next node
                    int tempVal = current.val;
                    current.val = current.next.val;
                    current.next.val = tempVal;

                    // Since we made a swap, set isSorted to false
                    isSorted = false;
                }
                current = current.next; // Move to the next node
            }

            // If no swaps were made, the list is sorted, so break the loop
            if (isSorted) {
                break;
            }
            
            // Move to the next node for another pass
            temp = temp.next;
        }

        return head;
    }
}

// Title: Sort List
