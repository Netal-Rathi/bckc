class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);  // Dummy node
        ListNode temp = l3;  // Pointer to build the result
        int carry = 0;

        // Traverse both lists until all digits and carry are processed
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;  // Start with the carry value

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;  // Move to the next node in l1
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;  // Move to the next node in l2
            }

            carry = sum / 10;  // Calculate carry for the next addition
            temp.next = new ListNode(sum % 10);  // Create new node for the current digit
            temp = temp.next;  // Move the temp pointer to the new node
        }

        return reverse(l3.next);  // Reverse the result list
    }

    // Function to reverse the linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null, current = head, next = null;

        // Traverse the list and reverse the links
        while (current != null) {
            next = current.next;  // Store the next node
            current.next = prev;  // Reverse the link
            prev = current;  // Move prev to current
            current = next;  // Move current to next
        }

        return prev;  // Return the new head of the reversed list
    }
}

// Title: Add Two Numbers
