
/* 1 Print the max value of the array  [ 3, 10, 3, 2, 5] using recursion. */
import java.util.*;
import java.io.*;

public class Recursion_09 {
    static int maximumElement(int[] arr, int n, int idx) {

        // Base case
        if (idx == n - 1)
            return arr[n - 1];

        // Recursive call
        int maxOfLaterIndices = maximumElement(arr, n, idx + 1);
        int maxVal = Math.max(arr[idx], maxOfLaterIndices);
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 10, 3, 2, 5 };
        int n = arr.length;
        System.out.println(maximumElement(arr, n, 0));

    }
}
