package Linked_list.Double_Linked_List;

public class CreatingDoubleLinkedList {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;

        }
    }

    public static void display(Node head) {
        while (head.next != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(0);
        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = null;
        e.prev = d;
        display(a);

    }

}
