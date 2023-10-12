/* Write a program to sort an ArrayList of Strings in descending order. */
package ArrayList;

import java.util.*;
import java.io.*;

public class ArrayList_03 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Akash");
        arraylist.add("Manoj");
        arraylist.add("Narasim");
        arraylist.add("ganesh");

        /* Unsorted list: ArrayList content before sorting */
        System.out.println("ArrayList Before Sorting: ");
        for (String str : arraylist) {
            System.out.println(str);
        }

        /* Sorting in decresing order */
        Collections.sort(arraylist, Collections.reverseOrder());

        /* Sorted list in reverse order */
        System.out.println("ArrayList in descending order: ");
        for (String str : arraylist) {
            System.out.println(str);
        }
    }
}
