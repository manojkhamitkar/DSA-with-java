//package Linked_list;
public class Linked_list_01 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(0);

        // 5 -> 4 -> 1 -> 9 -> 0
        a.next = b; // 5 -> 4 1 9 0
        b.next = c;// 5 -> 4 -> 1 9 0
        c.next = d;// 5 -> 4 -> 1 -> 9 0
        d.next = e;// 5 -> 4 -> 1 -> 9 -> 0

        // System.out.print(a.data + " ");
        // System.out.print(a.next.data + " ");
        // System.out.print(a.next.next.data + " ");
        // System.out.print(a.next.next.next.data + " ");
        // System.out.print(a.next.next.next.next.data + " ");

        Node temp = a;
        // Iterate over using the for loop.
        System.out.println("printing list using for loop");
        for (int i = 1; i <= 5; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}
