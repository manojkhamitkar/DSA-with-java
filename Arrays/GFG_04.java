
/* Given an array arr[] of integers, segregate even and odd numbers in the array such 
that all the even numbers should be present first, and then the odd numbers. */
import java.util.*;

public class GFG_04 {
    static void arrayEvenAndOdd(int arr[], int n) {
        int i = -1, j = 0;
        while (j != n) {
            if (arr[j] % 2 == 0) {
                i++;

                // Swapping even and odd numbers
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        // printing segreted array
        for (int k = 0; k < n; k++)
            System.out.print(arr[k] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int n = arr.length;
        arrayEvenAndOdd(arr, n);
    }

}
