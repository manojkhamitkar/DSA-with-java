package Linked_list.Double_Linked_List;

public class Delete {
    static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // method to Delete a head node
    public static Node deleteNodeAtHead(Node head) {
        head.next.prev = null;

        head = head.next;

        return head;

    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(78);
        Node e = new Node(30);
        Node f = new Node(8);
        Node g = new Node(0);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = null;

        display(a);
        Node delete = deleteNodeAtHead(a);
        System.out.println("\nLinked list after deleting  head node");
        display(delete);

    }

}
