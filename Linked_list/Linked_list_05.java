// Insertion at kth position in a singly linked list.
package Linked_list;

public class Linked_list_05 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        // Function to insert a node at the end of the linked list.
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;

        }

        // Function to insert a node at the head of the linked list
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;

            } else {
                temp.next = head;
                head = temp;
            }

        }

        // function to find the size of the linked list.
        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtHead(1);
        ll.insertAtHead(9);
        ll.display();
    }
}
