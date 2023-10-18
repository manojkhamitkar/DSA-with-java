
/* Find Second largest element in an array */
import java.util.*;

public class GFG_02 {
    static void secondLargest(int[] arr, int arr_size) {
        if (arr_size < 2) {
            System.out.println("Invalid Input");
            return;
        }
        Arrays.sort(arr);

        for (int i = arr_size - 2; i >= 0; i--) {
            if (arr[i] != arr[arr_size - 1])
                System.out.println("The Second largest element is " + arr[i]);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int arr_size = sc.nextInt();
        System.out.println("Enter " + arr_size + " elements");
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }
        secondLargest(arr, arr_size);

    }

}
