public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Initialize two pointers for the two lists.
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        // Traverse both lists. When one pointer reaches the end, redirect it to the head of the other list.
        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // The intersection node is either the intersection point or null if there's no intersection.
        return pointerA;
    }
}
