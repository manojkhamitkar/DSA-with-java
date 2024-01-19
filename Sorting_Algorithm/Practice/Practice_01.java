/* Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in
linear time. Assume there are no duplicates in the array. */
package Sorting_Algorithm;

import java.util.*;

public class Practice_01 {
    public static void sortArr(int[] arr, int n) {
        // base case
        if (n <= 1) {
            return;
        }
        int x = -1;
        int y = -1;
        int prev = arr[0];

        // process each pair of adjacent elements
        for (int i = 1; i < n; i++) {
            // if the previous element is greater than the current element
            if (prev > arr[i]) {
                // first occurrence of conflict
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
            prev = arr[i];
        }
        // swap the elements at index x and y
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 6, 7, 5, 9, 10 };
        sortArr(arr, 0);
        display(arr);

    }
}
