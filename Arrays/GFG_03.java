
/* Move all zeros to end of array */
import java.util.*;

public class GFG_03 {
    static void moveZeroesTOEnd(int[] arr, int n) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroesTOEnd(arr, n);

    }
}
