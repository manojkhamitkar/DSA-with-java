// Lenght of the   linked list

public class Linked_list_04 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        // method to find length of linked list iteratively.
        public static int length_1(Node head) {
            int count = 0;
            while (head != null) {
                count++;
                head = head.next;

            }
            return count;
        }

        // method to find length of linked list recursively.
        public static int length_2(Node head) {

            int count = 0;
            if (head == null)
                return 0;
            else {
                count = 1 + length_2(head.next);
                return count;
            }

        }

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(4);
            Node c = new Node(1);
            Node d = new Node(9);
            Node e = new Node(0);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            System.out.println(length_1(a));
            System.out.println(length_2(a));

        }
    }
}
