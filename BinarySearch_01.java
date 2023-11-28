/*Search if the given value is present in the array or not.*/
package BinarySearch;

import java.util.*;

public class BinarySearch_01 {

    /* BinarySearch using Recursive */

    static boolean binarySearchInRecursion(int[] a, int start, int end, int target) {
        if (start > end) // base case
            return false;
        int mid = (start + end) / 2; // self work
        if (a[mid] == target)
            return true;
        else if (target < a[mid])
            return binarySearchInRecursion(a, start, mid - 1, target); // recursive work
        else
            return binarySearchInRecursion(a, mid + 1, end, target); // recursive work

    }

    static boolean binarySearch(int[] a, int target) {
        int n = a.length;
        // int n = a.size();
        int start = 0, end = n - 1; // 0 based indexing
        while (start <= end) {
            int mid = (start + end) / 2; // find middle element of the array

            if (mid == target)
                return true; // value found
            else if (mid > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return false; // value not found in the array
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 }; // ArrayList<Integer> a = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int target = 3;
        while (target != 10) {
            System.out.println(target + " exists in array: " + binarySearchInRecursion(a, 0, a.length - 1, target));
            System.out.println(target + " exists in array: " + binarySearch(a, target));
            System.out.println();
            target++;
        }
    }
}
