/* Bubble Sort Algorithm */
package Sorting_Algorithm;

import java.util.*;

public class BubbleSorting {
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // n-1 iterations/passes
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap a[j+1] and a[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 9, 2, 7, 0, 7 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
