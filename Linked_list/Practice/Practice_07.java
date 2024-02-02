// Delete the middle element of the given linked list.
package Linked_list.Practice;

public class Practice_07 {
    static Node deleteMiddleElement(Node head) {
        Node fast = head;
        Node slow = head;
        if (fast.next == null)
            return null;
        while (fast.next.next != null && fast.next.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
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
        Node a = new Node(1);
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(10);
        Node e = new Node(24);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        a = deleteMiddleElement(a);
        display(a);

    }

}
