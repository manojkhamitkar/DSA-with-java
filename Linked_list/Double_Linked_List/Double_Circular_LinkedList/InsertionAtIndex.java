package Linked_list.Double_Linked_List.Double_Circular_LinkedList;

public class InsertionAtIndex {
    public class Node {
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

    // Method to insert at Node at given index.
    public void insertAtIndex(int index, int val) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty Linked list");
        } else {
            do {
                System.out.println(temp.val);
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList ll = new CircularLinkedList();
        ll.add(30);
        ll.add(1);
        ll.add(7);
        ll.add(6);
        ll.display();
        ll.insertAtIndex(3, 66);

    }

}
