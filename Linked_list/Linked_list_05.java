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
                insertAtEnd(val);

            } else {
                temp.next = head;
                head = temp;
            }

        }

        // Function to insert a node at the ith index .
        void insertAtIndex(int index, int val) {
            Node t = new Node(val);
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
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
        System.out.println("Insertion at end of linkedlist");
        ll.display(); // 4 5
        System.out.println("Insertion at head of linkedlist");
        ll.insertAtHead(1);
        ll.insertAtHead(9);
        ll.display(); // 9 1 4 5
        ll.insertAtIndex(2, 10);
        ll.insertAtIndex(0, 8);
        System.out.println("\nInsertion at given index"); // 9 1 10 4 5
        ll.display();
        System.out.println("\nSize of linkedlist");
        System.out.println(ll.size());
    }
}
