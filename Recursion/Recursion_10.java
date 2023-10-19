
/* Print all elements of array using recursion. */
import java.util.*;

public class Recursion_10 {
    static void sumOfArray(int[] arr, int n, int idx) {

        // Base condition.
        if (idx == n)
            return;

        // self work
        System.out.println(arr[idx]);

        // recursive call.
        sumOfArray(arr, n, idx + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sumOfArray(arr, n, 0);

    }
}
