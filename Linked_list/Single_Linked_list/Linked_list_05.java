// Insertion at kth position in a singly linked list.

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
            if (index == size()) {
                insertAtEnd(val);
                return;
            }

            else if (index == 0) {
                insertAtHead(val);
                return;

            } else if (index < 0 || index > size()) {
                System.out.print("\nplease insert into correct node");
                return;

            } else
                t.next = temp.next;
            temp.next = t;
        }

        // method to return the element at any given index of linked list.
        int getElement(Node head, int index, int currIndex) {
            if (head == null) {
                return -1; // index doesn't exist in the linked list
            }
            if (index == currIndex) {
                return head.data;
            }
            return getElement(head.next, index, currIndex + 1);
        }

        // Deletion at kth index in a singly linked list
        public Node deleteAtIndex(Node head, int index) {
            if (index == 0) {
                // deleting from the start
                Node temp = head;
                head = head.next;
                return head;
            }
            Node prevNode = head;
            int currIndex = 0;
            while (currIndex != index - 1) {
                prevNode = prevNode.next;
                currIndex++;
            }
            Node temp = prevNode.next;
            prevNode.next = prevNode.next.next;
            return head;
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
        ll.insertAtIndex(7, 1);
        System.out.println("\nInsertion at given index"); // 8 9 10 1 4 5
        ll.display();
        System.out.println("\nSize of linkedlist");
        System.out.println(ll.size());
        System.out.println(ll.getElement(ll.head, 2, 0));
        // ll.getElement(null, 0, 0)
        System.out.println("deletion of node ");
        ll.deleteAtIndex(ll.head, 4);
        ll.display();
    }
}
