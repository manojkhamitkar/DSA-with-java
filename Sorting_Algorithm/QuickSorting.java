// Quick Sorting
package Sorting_Algorithm;

import java.util.*;

public class QuickSorting {
    int partition(int arr[], int first, int last) {
        int pivot = arr[last];
        int i = (first - 1);
        for (int j = first; j < last; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = temp;
        return i + 1;
    }

    public void quickSort(int arr[], int first, int last) {
        if (first < last) {
            int pivot = partition(arr, first, last);
            quickSort(arr, first, pivot - 1);
            quickSort(arr, pivot + 1, last);
        }
    }

    static void display(int arr[], int n) {
        // int i;
        for (int i : arr) {
            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting");
        display(arr, n);
    }
}
