/* Find the index of the first occurrence of a given element x in an array? It is given that the array is
sorted? If no occurrence of x is found then return -1. */
package BinarySearch;

import java.util.*;

public class BinarySearch_02 {
    public static int firstOccurance(int[] a, int target) {
        int n = a.length;
        int start = 0, end = n - 1, ans = -1;
        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (a[mid] == target) {
                ans = mid;
                end = mid - 1; // trying to find the minimum index at which value target is present.
            } else if (a[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] a = { 2, 5, 5, 6, 7, 8, 9, 9, 9 };
        int target = 5;
        while (target != 10) {
            System.out.println("First Occurance of " + target + " is : " + firstOccurance(a, target));
            target++;
        }
    }

}
