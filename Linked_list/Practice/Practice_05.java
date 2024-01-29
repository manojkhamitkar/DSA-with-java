// Reverse of Linked list using 3 pointers form.
package Linked_list.Practice;

public class Practice_05 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // method to revese the linked list
    public static Node reverse(Node head) {
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

    // method to display the list.
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        Node a = new Node(1);
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(10);
        Node e = new Node(24);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a); // 1 8 4 10 24
        a = reverse(a);
        display(a); // 24 10 4 8 1
    }

}
