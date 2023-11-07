
/* Print the max value of the array [ 3, 10, 3, 2, 5]. */
import java.util.*;
import java.io.*;

public class Recursion_18 {
    // Apporach -> 1
    static int maxValue(int[] arr, int n, int idx) {
        if (idx == n - 1) // Base Case
            return arr[n - 1];
        int maxofLaterIndices = maxValue(arr, n, idx + 1); // Self Work
        int maxVal = Math.max(arr[idx], maxofLaterIndices); // Recursive Work
        return maxVal;

    }

    // Apporach -> 2
    static int maxInArray(int[] arr, int idx) {
        if (idx == arr.length - 1) // Self Work
            return arr[idx];

        int smallAns = maxInArray(arr, idx + 1);
        return Math.max(smallAns, arr[idx]); // Recursive Work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Apporch-1 : " + maxValue(arr, n, 0));
        System.out.println("Apporach-2 : " + maxInArray(arr, 0));

    }

}
