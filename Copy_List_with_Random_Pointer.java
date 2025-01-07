class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Create a copy of each node and link them together in an interweaved manner
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        // Step 2: Assign random pointers for the copied nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        // Step 3: Separate the copied list from the original list
        Node dummy = new Node(0);
        Node copyCurrent = dummy;
        current = head;

        while (current != null) {
            Node copy = current.next;
            copyCurrent.next = copy;
            copyCurrent = copy;

            // Restore the original list
            current.next = copy.next;
            current = current.next;
        }

        return dummy.next;
    }
}

// Title: Copy List with Random Pointer
