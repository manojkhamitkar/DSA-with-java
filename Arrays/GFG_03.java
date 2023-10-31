
/* Move all zeros to end of array */
import java.util.*;

public class GFG_03 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 4, 0, 6 };
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                if (arr[index] == 0) {
                    arr[index] = arr[i];
                    arr[i] = 0;
                }
                index++;
               // System.out.print(arr[index] + " ");
            }
             System.out.print(arr[index] + " ");
            }
        }

        // System.out.println(arr[index]);
    }
}
