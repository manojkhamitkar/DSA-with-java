/*  Given a linked list and a positive integer k, find the k'th node from the end of the list.
Note: It is guaranteed that k <= length Kf the linked list. */
package Linked_list.Practice;

import java.util.*;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Practice_01 {
    // -> Method-I
    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        // mth node from start
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // -> Method - II
    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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
        Node q = nthNode(a, 1);
        System.out.println(q.data);

    }
}
