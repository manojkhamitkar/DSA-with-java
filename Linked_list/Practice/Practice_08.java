/* Given head, the head of a linked list. Return true if the linked list has a cycle in it, otherwise return
false. */
package Linked_list.Practice;

public class Practice_08 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == slow)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        hasCycle(a);
    }

}
