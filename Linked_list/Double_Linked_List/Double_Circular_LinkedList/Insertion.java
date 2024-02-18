package Linked_list.Double_Linked_List.Double_Circular_LinkedList;

public class Insertion {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

    }

    Node head = null;
    Node tail = null;

    // Method to make Double Linked List as Circular
    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {

            head = newNode;
            tail = newNode;
            newNode.next = head;
            newNode.prev = tail;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;
            head.prev = tail;

        }

    }

    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            newNode.prev = tail;

        } else {
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            head = newNode;
        }
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty Linked list");

        } else {
            do {
                System.out.println(temp.val + " ");
                temp = temp.next;
            } while (temp != head);

        }

    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(30);
        cll.add(1);
        cll.add(7);
        cll.add(6);
        cll.display();
        cll.insertAtHead(2);
        cll.display();

    }

}
