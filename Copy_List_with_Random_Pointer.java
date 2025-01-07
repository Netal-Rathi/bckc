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
        Node dummy=new Node(0);
        Node current=dummy;
        Node temp=head;
        while(temp!=null){
            Node copy=new Node (temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }


        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        temp=head;

        while(temp!=null){
            current.next=temp.next;
            temp.next=temp.next.next;
            current=current.next;
            temp=temp.next;
        }
        return dummy.next;

    }
}
// Title: Copy List with Random Pointer
