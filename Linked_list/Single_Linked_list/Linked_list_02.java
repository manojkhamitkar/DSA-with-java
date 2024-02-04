// package Linked_list;

public class Linked_list_02 {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;

        }

        public static void display(Node head) {
            Node next = head;
            // iterating using the while loop
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }

        }

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(4);
            Node c = new Node(1);
            Node d = new Node(9);
            Node e = new Node(0);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            System.out.println("Linked list using while loop");
            display(a);
        }

    }
}
