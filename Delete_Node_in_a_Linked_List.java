/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Ensure the node is not null and is not the last node
        if (node == null || node.next == null) {
            return;
        }
        
        // Copy the value from the next node to the current node
        node.val = node.next.val;
        
        // Bypass the next node
        node.next = node.next.next;
    }
}

// Title: Delete Node in a Linked List
