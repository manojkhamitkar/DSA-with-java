package Sorting_Algorithm;

import java.io.*;
import java.util.*;

public class SelectSorting {
    // 0 based indexing used.
    static void selectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represents the current index.
            // Finding the minimum element in unsorted part of the array.
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }

            // Swap the minimum element with the current element.
            if (min_index != i) {
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
