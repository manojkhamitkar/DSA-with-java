
/* Move all zeros to end of array */
import java.util.*;

public class GFG_03 {
    static void moveZerosToEnd(int[] arr, int n) {

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                if (arr[index] == 0) {
                    arr[index] = arr[i];
                    arr[i] = 0;
                }
                index++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZerosToEnd(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
