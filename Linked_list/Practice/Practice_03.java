/* Given the heads of two singly linked-lists headA and headB, return the value of the node at which
the two lists intersect. If the two linked lists have no intersection at all, return -1. 
Note: the values in each node are distinct. */
package Linked_list.Practice;

import java.util.*;

public class Practice_03 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 1; i <= steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps = lengthB - lengthA;
            for (int i = 1; i <= steps; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

}