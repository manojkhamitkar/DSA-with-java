
/* Move all zeroes to end of array */
import java.util.*;
import java.io.*;

public class Recursion_12 {

    static void pushZerosToEnd(int arr[], int n) {

        // Count of non-zero elements
        int count = 0;

        /*
         * Traverse the array. If element encountered is
         * non -zero , then replace the element at index 'count'
         * with this element
         */

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        /*
         * Now all non-zero elements have been shifted to
         * front and 'count' is set as index of first 0.
         * Make all elements 0 from count to end.
         */
        while (count < n)
            arr[count++] = 0;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
