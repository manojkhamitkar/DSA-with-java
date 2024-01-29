// check if th linked list is palindrome or not.
package Linked_list.Practice;

public class Practice_06 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head) {
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(10);
        Node e = new Node(24);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println();
    }
}
