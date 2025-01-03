import java.util.HashMap;

public class Solution {
    public boolean hasCycle(ListNode head) {
        // Initialize a HashMap to track visited nodes
        HashMap<ListNode, Integer> map = new HashMap<>();

        // Traverse the linked list
        while (head != null) {
            // If the current node is already in the map, there is a cycle
            if (map.containsKey(head)) {
                return true;
            }
            // Mark the current node as visited
            map.put(head, 1);

            // Move to the next node
            head = head.next;
        }

        // If we reach the end of the list, there is no cycle
        return false;
    }
}
