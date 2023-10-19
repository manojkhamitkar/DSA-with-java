
/*Find the sum of the values of the array [2, 3, 5, 20, 1] using recursion.  */
import java.util.*;
import java.io.*;

public class Recursion_11 {
    static int sumOfArray(int[] arr, int n) {
        if (n <= 0)
            return 0;

        return (sumOfArray(arr, n - 1) + arr[n - 1]);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 20, 1 };
        int n = arr.length;
        System.out.print(sumOfArray(arr, n));
    }

}
