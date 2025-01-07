/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Dummy node to simplify new list creation
        Node dummy = new Node(0);
        Node current = dummy; // Pointer to traverse and build the new list
        Node temp = head;     // Pointer to traverse the original list

        // First pass: Copy nodes and next pointers
        while (temp != null) {
            current.next = new Node(temp.val); // Create a new node with the value of temp
            current = current.next;           // Move the current pointer forward
            temp = temp.next;                 // Move temp to the next node in the original list
        }

        // Second pass: Copy random pointers
        temp = head;              // Reset temp to the head of the original list
        current = dummy.next;     // Start at the head of the new list
        while (temp != null) {
            if (temp.random != null) {
                current.random = findNode(dummy.next, temp.random); // Map the random pointer
            }
            temp = temp.next;      // Move to the next node in the original list
            current = current.next; // Move to the next node in the new list
        }

        return dummy.next; // Return the head of the new list
    }

    // Helper function to find a node in the copied list corresponding to a given original node
    private Node findNode(Node copiedHead, Node target) {
        Node temp = copiedHead;
        while (temp != null) {
            if (temp.val == target.val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
