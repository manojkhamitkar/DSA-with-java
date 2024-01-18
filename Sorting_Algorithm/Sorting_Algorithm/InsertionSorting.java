// Insertion Sort

package Sorting_Algorithm;

public class InsertionSorting {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {

                // swaping arr[j] with arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                // Decrementing j by 1
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 1, 0, 4, 10, 7 };
        insertionSort(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}
