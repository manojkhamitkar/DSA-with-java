// displaying the linked list using the recursion function.
package Linked_list.Single_Linked_list;

public class Linked_list_03 {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;

        }

        public static void display(Node head) {
            if (head == null)
                return;
            System.out.print(head.data + " ");
            display(head.next);

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
            System.out.println("Displaying Linked list using  ");
            display(a);
        }
    }
}
