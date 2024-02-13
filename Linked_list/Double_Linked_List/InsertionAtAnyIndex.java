package Linked_list.Double_Linked_List;

public class InsertionAtAnyIndex {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

        // Method to insert a node at given index.
        public static void insertAtIndex(Node head, int index, int x) {
            Node s = head;
            for (int i = 0; i < index; i++) {
                s = s.next;
            }
            Node r = s.next;
            Node t = new Node(x);
            // s.next = t;
            // t.prev = s;
            // t.next = r;
            // r.prev = t;
            r.prev = t;
            t.prev = s;
            t.next = r;
            s.next = t;

        }

        // Method to display the linked list.
        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Node a = new Node(6);
            Node b = new Node(5);
            Node c = new Node(1);
            Node d = new Node(78);
            Node e = new Node(30);
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
            insertAtIndex(a, 3, 35);
            display(a);

        }

    }
}
