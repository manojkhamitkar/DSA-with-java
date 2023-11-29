
/* Find the index of the Last occurrence of a given element x in an array? It is given that the array is
sorted? If no occurrence of x is found then return -1. -> using recursion  */
package BinarySearch;

import java.util.*;

public class BinarySearch_Practice_01 {
    static int lastOccurence(int[] a, int val) {
        int n = a.length;
        int start = 0, end = n - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == val) {
                ans = mid;
                start = mid + 1; // this line will check for right to the mid value for presence of duplicate mid value.
            } else if (a[mid] >= val) {
                end = mid - 1;
            } else
                start = mid + 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9 };
        int val = 1;
        while (val != 10) {
            System.out.println("Last Occurence of " + val + " is : " + lastOccurence(a, val));
            val++;
        }
    }
}

/*
 * output:
 * Last Occurence of 1 is : -1 // here output is -1 coz 1 doesnot exist
 * Last Occurence of 2 is : 0
 * Last Occurence of 3 is : 1
 * Last Occurence of 4 is : 3
 * Last Occurence of 5 is : 5
 * Last Occurence of 6 is : 6
 * Last Occurence of 7 is : 7
 * Last Occurence of 8 is : 8
 * Last Occurence of 9 is : 10
 */