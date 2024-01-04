// Insertion at kth position in a singly linked list.
package Linked_list;

public class Linked_list_05 {
    public Node insertAtEnd(Node head, int val) {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node(val);
        return head;
    }

    public Node insertAtBeginning(Node head, int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        return newHead;
    }

    public Node insert(Node head, int index, int val) {
        Node newNode = new Node(val);
        newNode.val = val;
        if (index == 0) {
            // inserting at the start
            newNode.next = head;
            return newNode;
        }
        Node prevNode = head;
        int currentIndex = 0;
        while (currentIndex != index - 1) {
            prevNode = prevNode.next;
            currentIndex++;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        return head;
    }

}
