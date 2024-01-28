// Reserve of linked list by recursion and with pointers.
package Linked_list.Practice;

public class Practice_04 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node recursionReverse(Node head) {
        if (head.next == null)
            return head;
        Node newHead = recursionReverse(head.next);
        head.next = head;
        head.next = null;
        return newHead;

    }

    public static void displayrev(Node head) {
        if (head == null)
            return;
        display(head.next);
        System.out.println(head.data + " ");
    }

    static Node pointerReverse(Node head) {
        Node curr = head;
        Node Next = null;
        Node prev = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public static void display(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(8);
        Node d = new Node(4);
        Node e = new Node(10);
        Node f = new Node(24);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        pointerReverse(a);
        // displayList(a);
        Node r = recursionReverse(a);
        displayrev(r);

    }

}
