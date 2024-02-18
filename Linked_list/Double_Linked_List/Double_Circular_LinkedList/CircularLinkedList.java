package Linked_list.Double_Linked_List.Double_Circular_LinkedList;

public class CircularLinkedList {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

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
        Node a = new Node(4);
        Node b = new Node(7);
        Node c = new Node(60);
        Node d = new Node(1);
        Node e = new Node(9);
        Node f = new Node(3);
        a.prev = e;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        e.prev = e;
        e.next = a;
        display(a);

    }

}
