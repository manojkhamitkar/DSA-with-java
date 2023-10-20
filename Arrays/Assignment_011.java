
/* Rearrange an array in maximum minimum form using Two Pointer Technique */
import java.util.*;
import java.io.*;

public class Assignment_011 {
    public static void reArrange(int[] arr, int n) {
        int max_index = n - 1;
        int min_index = 0;
        int max = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = (arr[max_index] % max) * max + arr[i];
                max_index--;
            } else {
                arr[i] = (arr[min_index] % max) * max + arr[i];
                min_index++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reArrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
