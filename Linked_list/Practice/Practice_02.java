/* Given the head of a linked list, remove the k-th node from the end of the list and return its head.>
Note: It is guaranteed that k <= length Kf the linked list.*/
package Linked_list.Practice;

//import java.util.*;
public class Practice_02 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void deleteKthNode(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(1);
        Node d = new Node(6);
        Node e = new Node(9);
        Node f = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        deleteKthNode(a, 2);
        display(a);

    }

}
