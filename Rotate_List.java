class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; // Handle edge cases
        }

        ListNode current = head, temp = head, prev = head;

        // Find the length of the list
        int size = 1;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }

        // Reduce k to within bounds of the list length
        k = k % size;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Start the rotation process
        for (int i = 0; i < k; i++) {
            temp = head;
            prev = null;

            // Find the second last and last nodes
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }

            // Adjust pointers to rotate
            prev.next = null;  // Break the link at the second last node
            temp.next = head;  // Point the last node to the current head
            head = temp;       // Update the head to the last node
        }

        return head;
    }
}

// Title: Rotate List
