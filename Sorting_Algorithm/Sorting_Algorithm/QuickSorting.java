// Quick Sorting
package Sorting_Algorithm;

import java.util.*;

public class QuickSorting {

    static void display(int arr[]) {
        // int i;
        for (int val : arr) {
            System.out.print(val + " ");

        }
    }

    // method to swap variables
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i = st, j = end;
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSort(int arr[], int st, int end) {
        if (st >= end)
            return;
        int pivot = partition(arr, st, end);
        quickSort(arr, st, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before sorting\n" + " ");
        display(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Array after sorting\n");
        display(arr);

    }
}
