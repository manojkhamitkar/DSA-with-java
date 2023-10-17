
/* Find the largest three distinct elements in an array */
import java.util.*;

public class GFG_01 {
    static void largestElement(int[] arr, int arr_size) {
        int first, second, third;
        if (arr_size < 3)
            System.out.print("Invalid input");
        // return;

        third = first = second = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++) {
            /* If current element is greater than first */
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and second then update second */
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third)
                third = arr[i];

        }
        System.out.println("Three largest elements are " + first + " " + second + " " + third);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }
        largestElement(arr, arr_size);
    }
}
