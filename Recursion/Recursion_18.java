
/* Print the max value of the array [ 3, 10, 3, 2, 5]. */
import java.util.*;
import java.io.*;

public class Recursion_18 {
    static int maxValue(int[] arr, int n, int idx) {
        if (idx == n - 1)
            return arr[n - 1];
        int maxofLaterIndices = maxValue(arr, n, idx + 1);
        int maxVal = Math.max(arr[idx], maxofLaterIndices);
        return maxVal;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // maxValue(arr, n, 0);
        System.out.println(maxValue(arr, n, 0));

    }

}
