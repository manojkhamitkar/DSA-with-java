/* Find the square root of the given non negative value x, Round it off to the nearest floor integer value. */
package BinarySearch;

import java.util.*;

public class BinarySearch_03 {
    public static int squareRoot(int x) {
        // int n = a.size();
        int start = 0, end = x, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mid * mid;
            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;

        }

        return ans;

    }

    public static void main(String[] args) {
        int x = 25;
        System.out.println(squareRoot(x));
    }

}
