package Sorting_Algorithm;

public class BucketSorting {
    static void bucketSort(float[] arr) {
        int n = arr.length;
    }

    public static void main(String[] args) {
        float[] arr = { 1, 7, 8, 2, 4, 0, 6, 2, 8, 2, 1 };
        bucketSort(arr);
        for (float val : arr) {
            System.out.println(val + " ");
        }
    }
}
