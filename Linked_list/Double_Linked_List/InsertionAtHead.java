package Linked_list.Double_Linked_List;

public class InsertionAtHead {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // inserting a node at the head
    public static Node insertNode(Node head, int x) {
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        t = head;
        return head;

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(1);
        Node d = new Node(0);
        Node e = new Node(9);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        Node newHead = insertNode(a, 35);
        display(newHead);

    }

}
