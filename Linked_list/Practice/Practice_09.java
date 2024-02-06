package Linked_list.Practice;

public class Practice_09 {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node removeDuplicate(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == temp.val) {
                temp.next = temp.next.next;
            }
            if (head == null)
                return null;
            if (temp.next.val != temp.val) {
                temp = temp.next;
            }
        }
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
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(3);
        Node f = new Node(3);
        Node g = new Node(4);
        Node h = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        display(a);
        a = removeDuplicate(a);
        display(a);

    }

}
